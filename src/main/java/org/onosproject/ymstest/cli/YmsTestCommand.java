/*
 * Copyright 2015-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.ymstest.cli;

import org.apache.karaf.shell.commands.Argument;
import org.apache.karaf.shell.commands.Command;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.ymstest.YmsTestService;
import org.onosproject.ymstest.YmsTestcases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

/**
 * CLI command to test YMS application.
 */

@Command(scope = "onos", name = "yms-test",
        description = "YMS test application")
public class YmsTestCommand extends AbstractShellCommand {

    @Argument(index = 0, name = "testcaseName", description = "Test case function name.", required = true,
            multiValued = false)
    String testcaseName = null;

    @Override
    protected void execute() {
        Integer total = 0;
        Integer passed = 0;
        Integer failed = 0;

        YmsTestService ymsTestService = get(YmsTestService.class);
        YmsTestcases ymsTestcases = ymsTestService.getYmsTestcases();
        Method[] methods = YmsTestcases.class.getMethods();

        Map<String, Method> testcases = new TreeMap<>();

        // Find the testcases by matching function name
        for (Method method : methods) {
            String methodName = method.getName();
            if ((testcaseName.startsWith("all") && methodName.startsWith("test")) ||
                    testcaseName.equals(methodName)) {
                testcases.put(methodName, method);
            }
        }

        // When running all testcases turn on/off print in testcases
        if (testcaseName.startsWith("all") && !testcaseName.equals("all-with-print")) {
            ymsTestcases.disablePrinting();
        }

        // Invoke the selected testcases sorted by name
        for (Map.Entry<String, Method> testcase : testcases.entrySet()) {
            String methodName = testcase.getKey();
            Method method = testcase.getValue();
            total++;
            print("[REPORT] Running test %d %s", total, methodName);

            try {
                boolean result = (boolean) method.invoke(ymsTestcases);

                if (result) {
                    passed++;
                    print("[REPORT] %s Passed\n", methodName);
                } else {
                    failed++;
                    print("[REPORT] %s Failed!\n", methodName);
                }

                // Wait 1 second between testcases
                if (testcaseName.equals("all-with-wait")) {
                    Thread.sleep(1000);
                }
            } catch (IllegalAccessException | InvocationTargetException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Display test run summary report
        if (!testcases.isEmpty()) {
            Integer passPercent = (passed * 100) / total;
            Integer error = total - passed - failed;
            print("[SUMMARY REPORT] Total:%d, Passed:%d, Failed:%d, Error:%d, Pass Percent:%d%%",
                    total, passed, failed, error, passPercent);
        } else {
            print("Error: Unknown testcase or option '%s'", testcaseName);
        }
    }
}

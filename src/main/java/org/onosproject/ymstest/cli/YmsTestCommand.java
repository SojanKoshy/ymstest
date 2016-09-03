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
import org.onosproject.ymstest.YmsTestcases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
        YmsTestcases ymsTestcases = new YmsTestcases();

        Method[] methods = YmsTestcases.class.getMethods();
        boolean testFound = false;

        Integer total = 0;
        Integer passed = 0;
        Integer failed = 0;

        for (Method method : methods) {
            String methodName = method.getName();

            if ((testcaseName.equals("all") && methodName.startsWith("test")) ||
                    methodName.equals(testcaseName)) {
                testFound = true;
                total++;
                print("[REPORT] Running test " + total + " " + methodName);

                try {
                    boolean result = (boolean) method.invoke(ymsTestcases);
                    if (result) {
                        passed++;
                        print("[REPORT] " + methodName + " Passed\n");
                    } else {
                        failed++;
                        print("[REPORT] " + methodName + " Failed!\n");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        if (testFound) {
            Integer passPercent = (passed * 100) / total;
            Integer error = total - passed - failed;
            print("[SUMMARY REPORT] Total: %d, Passed:%d, Failed:%d, Error:%d, Pass percent: %d%%",
                    total, passed, failed, error, passPercent);
        } else {
            print("Error: Unknown testcase '" + testcaseName + "'");
        }
    }
}

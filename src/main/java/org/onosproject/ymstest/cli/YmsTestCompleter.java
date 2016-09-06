package org.onosproject.ymstest.cli;

import org.apache.karaf.shell.console.Completer;
import org.apache.karaf.shell.console.completer.StringsCompleter;
import org.onosproject.ymstest.YmsTestcases;

import java.lang.reflect.Method;
import java.util.List;
import java.util.SortedSet;

/**
 * CLI command completer for YMS test application.
 */
public class YmsTestCompleter implements Completer {
    @Override
    public int complete(String buffer, int cursor, List<String> candidates) {
        // Delegate string completer
        StringsCompleter delegate = new StringsCompleter();
        SortedSet<String> strings = delegate.getStrings();

        // Collect all the test method names
        Method[] methods = YmsTestcases.class.getMethods();
        for (Method method: methods) {
            if (method.getName().startsWith("test")) {
                strings.add(method.getName());
            }
        }

        // Add 'all' testcase execution options
        strings.add("all");
        strings.add("all-with-print");
        strings.add("all-with-wait");

        // Now let the completer do the work for figuring out what to offer
        return delegate.complete(buffer, cursor, candidates);
    }
}
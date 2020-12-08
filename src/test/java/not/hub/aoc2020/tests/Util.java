package not.hub.aoc2020.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInfo;
import org.tinylog.Logger;

public class Util {

    public static void test(long actual, long result, TestInfo info) {
        Assertions.assertEquals(actual, result);
        String testName = info.getDisplayName();
        Logger.info(testName + ":\t" + result);
    }

    public static void test(int actual, int result, TestInfo info) {
        test((long) actual, result, info);
    }

}

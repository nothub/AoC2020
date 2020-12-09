package not.hub.aoc2020.tests.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInfo;
import org.tinylog.Logger;

import java.math.BigInteger;

public class AssertWrapper {

    public static void equals(int actual, int result, TestInfo info) {
        Assertions.assertEquals(actual, result);
        Logger.info(info.getDisplayName() + ": " + result);
    }

    public static void equals(long actual, long result, TestInfo info) {
        Assertions.assertEquals(actual, result);
        Logger.info(info.getDisplayName() + ": " + result);
    }

    public static void equals(BigInteger actual, BigInteger result, TestInfo info) {
        Assertions.assertEquals(actual, result);
        Logger.info(info.getDisplayName() + ": " + result);
    }

    public static void equals(String actual, String result, TestInfo info) {
        Assertions.assertEquals(actual, result);
        Logger.info(info.getDisplayName() + ": " + result);
    }

}

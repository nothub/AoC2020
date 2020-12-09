package not.hub.aoc2020.tests.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputParser {

    public static String string(String path) {
        return resourceStream(path).collect(Collectors.joining("\n"));
    }

    public static List<String> stringList(String path) {
        return resourceStream(path).collect(Collectors.toList());
    }

    public static List<Integer> integerList(String path) {
        return resourceStream(path).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static List<BigInteger> bigIntegerList(String path) {
        return resourceStream(path).map(BigInteger::new).collect(Collectors.toList());
    }

    private static Stream<String> resourceStream(String path) {
        try {
            return new BufferedReader(new InputStreamReader(
                    Objects.requireNonNull(ClassLoader.getSystemResourceAsStream(path))
            )).lines();
        } catch (Exception e) {
            throw new IllegalStateException("Unable to load input file " + path + " - " + e.getMessage(), e);
        }
    }

}

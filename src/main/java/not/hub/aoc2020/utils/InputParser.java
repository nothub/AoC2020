package not.hub.aoc2020.utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class InputParser {

    public static List<Integer> getIntegerList(String path) {
        try {
            return Files.lines(Paths.get(path)).map(Integer::parseInt).collect(Collectors.toList());
        } catch (Exception e) {
            throw new IllegalStateException("Unable to load input file " + path + " - " + e.getMessage(), e);
        }
    }

    public static List<String> getStringList(String path) {
        try {
            return Files.lines(Paths.get(path)).collect(Collectors.toList());
        } catch (Exception e) {
            throw new IllegalStateException("Unable to load input file " + path + " - " + e.getMessage(), e);
        }
    }

    public static String getString(String path) {
        try {
            return Files.readString(Paths.get(path));
        } catch (Exception e) {
            throw new IllegalStateException("Unable to load input file " + path + " - " + e.getMessage(), e);
        }
    }

}

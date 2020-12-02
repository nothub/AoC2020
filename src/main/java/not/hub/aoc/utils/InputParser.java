package not.hub.aoc.utils;

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

    public static StringBuffer getStringBuffer(String path) {
        try {
            return new StringBuffer(Files.readString(Paths.get(path)));
        } catch (Exception e) {
            throw new IllegalStateException("Unable to load input file " + path + " - " + e.getMessage(), e);
        }
    }

}

package not.hub.aoc2020.day6;

import not.hub.aoc2020.Solver;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CustomCustoms1 extends Solver<String, Integer> {

    private static final String linebreak = "\\r?\\n|\\r";

    @Override
    public Integer solve(String input) {
        int result = 0;
        for (String group : Arrays.stream(input.replaceAll(linebreak, "\n").strip().split("\n{2,}")).collect(Collectors.toList())) {
            result = result + group.replaceAll(linebreak, "").chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size();
        }
        return result;
    }

}

package not.hub.aoc2020.day6;

import not.hub.aoc2020.Solver;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomCustoms2 extends Solver<String, Integer> {

    private static final String linebreak = "\\r?\\n|\\r";

    @Override
    public Integer solve(String input) {
        int result = 0;
        Set<Character> answers = input.replaceAll(linebreak, "").chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        var a = Arrays.stream(input.replaceAll(linebreak, "\n").strip().split("\n{2,}")).collect(Collectors.toList());
        for (String group : a) {
            for (Character character : answers) {
                if (group.chars().filter(ch -> ch == character).count() == group.chars().filter(ch -> ch == '\n').count() + 1) {
                    result++;
                }
            }
        }
        return result;
    }

}

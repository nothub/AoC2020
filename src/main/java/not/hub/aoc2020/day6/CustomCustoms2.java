package not.hub.aoc2020.day6;

import not.hub.aoc2020.Solver;

import java.util.Arrays;
import java.util.stream.Collectors;

import static not.hub.aoc2020.Globals.LINESEPRE;

public class CustomCustoms2 extends Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        var answers = input.replaceAll(LINESEPRE, "")
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        return Arrays.stream(input.replaceAll(LINESEPRE, "\n").strip().split("\n{2,}"))
                .collect(Collectors.toList()).stream().mapToInt(group ->
                        (int) answers.stream().filter(character ->
                                group.chars().filter(ch -> ch == character).count() ==
                                        group.chars().filter(ch -> ch == '\n').count() + 1
                        ).count()).sum();
    }

}

package not.hub.aoc2020.day6;

import not.hub.aoc2020.Solver;

import java.util.Arrays;
import java.util.stream.Collectors;

import static not.hub.aoc2020.Globals.LINESEPRE;

public class CustomCustoms1 extends Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        return Arrays.stream(input.replaceAll(LINESEPRE, "\n").strip().split("\n{2,}")
        ).collect(Collectors.toList()).stream().mapToInt(group ->
                group.replaceAll(LINESEPRE, "").chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size()
        ).sum();
    }

}

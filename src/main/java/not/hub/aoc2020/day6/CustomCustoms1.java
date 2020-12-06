package not.hub.aoc2020.day6;

import not.hub.aoc2020.Solver;

import java.util.Arrays;

import static not.hub.aoc2020.Globals.LINESEPRE;
import static not.hub.aoc2020.Globals.LINESEPRE_MULTI;

public class CustomCustoms1 extends Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        return Arrays.stream(input.split(LINESEPRE_MULTI)).mapToInt(group ->
                (int) group.replaceAll(LINESEPRE, "").chars().distinct().count()
        ).sum();
    }

}

package not.hub.aoc2020.day6;

import not.hub.aoc2020.Solver;

import java.util.Arrays;

import static not.hub.aoc2020.Globals.LB_PRED;
import static not.hub.aoc2020.Globals.LB_SECT;

public class CustomCustoms1 extends Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        return Arrays.stream(input.split(LB_SECT)).mapToInt(group ->
                (int) group.chars().filter(LB_PRED.negate()).distinct().count()
        ).sum();
    }

}

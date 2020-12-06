package not.hub.aoc2020.day6;

import not.hub.aoc2020.Solver;

import java.util.Arrays;
import java.util.stream.Collectors;

import static not.hub.aoc2020.Globals.LB_MULTI;
import static not.hub.aoc2020.Globals.LB_PRED;

public class CustomCustoms2 extends Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        var answers = input.chars().filter(LB_PRED.negate()).boxed().collect(Collectors.toSet());
        return Arrays.stream(input.strip().split(LB_MULTI))
                .mapToInt(group -> (int) answers.stream().filter(answer ->
                        group.chars().filter(a -> a == answer).count() ==
                                group.chars().filter(LB_PRED).count() + 1
                ).count()).sum();
    }

}

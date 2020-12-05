package not.hub.aoc2020.day5;

import not.hub.aoc2020.Solver;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BinaryBoarding1 extends Solver<List<String>, Integer> {

    protected static Set<Integer> parse(List<String> input) {
        return input.stream().map(seat -> seat
                .replaceAll("[BR]", "1")
                .replaceAll("[FL]", "0")).mapToInt(value ->
                Integer.parseInt(value.substring(0, 7), 2) * 8 + Integer.parseInt(value.substring(7, 10), 2)
        ).boxed().collect(Collectors.toSet());
    }

    @Override
    public Integer solve(List<String> input) {
        return parse(input).stream().max(Integer::compareTo).orElseThrow();
    }

}

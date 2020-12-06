package not.hub.aoc2020.day5;

import not.hub.aoc2020.Solver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static not.hub.aoc2020.day5.BinaryBoarding1.parse;

public class BinaryBoarding2 extends Solver<List<String>, Integer> {

    @Override
    public Integer solve(List<String> input) {
        var seatIds = parse(input);
        var stats = seatIds.stream().collect(Collectors.summarizingInt(Integer::intValue));
        return IntStream.range(stats.getMin(), stats.getMax()).filter(id -> !seatIds.contains(id)).findAny().orElseThrow();
    }

}

package not.hub.aoc2020.day5;

import not.hub.aoc2020.Solver;
import org.tinylog.Logger;

import java.util.List;
import java.util.stream.IntStream;

import static not.hub.aoc2020.day5.BinaryBoarding1.parse;

public class BinaryBoarding2 extends Solver<List<String>, Integer> {

    @Override
    public Integer solve(List<String> input) {

        var seatIds = parse(input);

        var ownId = IntStream.range(0, seatIds.stream().max(Integer::compareTo).orElseThrow()).filter(
                id -> !seatIds.contains(id) && seatIds.contains(id - 1) && seatIds.contains(id + 1)
        ).findAny().orElseThrow();

        Logger.info("Result: " + ownId);
        return ownId;

    }


}

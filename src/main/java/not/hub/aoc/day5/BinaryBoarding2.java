package not.hub.aoc.day5;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static not.hub.aoc.day5.BinaryBoarding1.parse;

public class BinaryBoarding2 extends Solver<List<String>, Integer> {

    @Override
    public Integer solve(List<String> input) {

        Set<Integer> seatIds = parse(input);

        int ownId = IntStream.range(0, seatIds.stream().max(Integer::compareTo).orElseThrow()).boxed().filter(
                id -> !seatIds.contains(id) && seatIds.contains(id - 1) && seatIds.contains(id + 1)
        ).findAny().orElseThrow();

        Logger.info("Result: " + ownId);
        return ownId;

    }


}

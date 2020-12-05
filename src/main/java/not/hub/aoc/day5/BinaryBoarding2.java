package not.hub.aoc.day5;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static not.hub.aoc.day5.BinaryBoarding1.partition;

public class BinaryBoarding2 extends Solver<List<String>, Integer> {

    @Override
    public Integer solve(List<String> input) {

        Set<Integer> seatIds = new HashSet<>();

        for (String seatcode : input) {

            List<Integer> rows = IntStream.range(0, 128).boxed().collect(Collectors.toList());
            List<Integer> columns = IntStream.range(0, 8).boxed().collect(Collectors.toList());

            for (char c : seatcode.toCharArray()) {
                if (c == 'F' || c == 'B') {
                    rows = partition(rows, c);
                } else if (c == 'L' || c == 'R') {
                    columns = partition(columns, c);
                }
            }

            int seatId = rows.get(0) * 8 + columns.get(0);

            seatIds.add(seatId);

        }

        int ownId = seatIds.stream().filter(
                id -> !seatIds.contains(id + 1) && seatIds.contains(id + 2)
        ).findAny().orElseThrow();
        ownId++;

        Logger.info("Result: " + ownId);
        return ownId;

    }


}

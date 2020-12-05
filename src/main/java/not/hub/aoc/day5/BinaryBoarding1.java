package not.hub.aoc.day5;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinaryBoarding1 extends Solver<List<String>, Integer> {

    protected static List<Integer> partition(List<Integer> list, char c) {

        if (c == 'F' || c == 'L') {
            return list.subList(0, list.size() / 2);
        } else if (c == 'B' || c == 'R') {
            return list.subList(list.size() / 2, list.size());
        }

        throw new IllegalStateException();

    }

    @Override
    public Integer solve(List<String> input) {

        int biggestId = 0;

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

            if (seatId > biggestId) {
                biggestId = seatId;
            }

        }

        Logger.info("Result: " + biggestId);
        return biggestId;

    }


}

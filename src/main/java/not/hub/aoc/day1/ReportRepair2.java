package not.hub.aoc.day1;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.List;

public class ReportRepair2 extends Solver<List<Integer>, Integer> {

    @Override
    public Integer solve(List<Integer> input) {

        Logger.info("Day 1: Report Repair - Part 2");

        for (var i = 0; i < input.size(); i++) {
            for (var j = 0; j < input.size(); j++) {
                if (i == j) {
                    continue;
                }
                for (var k = 0; k < input.size(); k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    if (input.get(i) + input.get(j) + input.get(k) == 2020) {
                        Logger.info("Result: " + input.get(i) * input.get(j) * input.get(k));
                        return input.get(i) * input.get(j) * input.get(k);
                    }
                }
            }
        }

        throw new IllegalStateException();

    }

}

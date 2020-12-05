package not.hub.aoc2020.day1;

import not.hub.aoc2020.Solver;
import org.tinylog.Logger;

import java.util.List;

public class ReportRepair1 extends Solver<List<Integer>, Integer> {

    @Override
    public Integer solve(List<Integer> input) {

        Logger.info("Day 1: Report Repair - Part 1");

        for (var i = 0; i < input.size(); i++) {
            for (var j = 0; j < input.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (input.get(i) + input.get(j) == 2020) {
                    Logger.info("Result: " + input.get(i) * input.get(j));
                    return input.get(i) * input.get(j);
                }
            }
        }

        throw new IllegalStateException();

    }

}

package not.hub.aoc.day1;

import not.hub.aoc.utils.InputParser;
import org.tinylog.Logger;

import java.util.List;

public class ReportRepairSecond {

    private static final List<Integer> input = InputParser.getIntegerList("inputs/day1");

    public static void main(String[] args) {

        Logger.info("Day 1: Report Repair - Part 2");

        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < input.size(); k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    if (input.get(i) + input.get(j) + input.get(k) == 2020) {
                        Logger.info("Result: " + input.get(i) * input.get(j) * input.get(k));
                        return;
                    }
                }
            }
        }

    }

}

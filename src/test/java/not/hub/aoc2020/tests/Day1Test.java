package not.hub.aoc2020.tests;

import not.hub.aoc2020.day1.ReportRepair1;
import not.hub.aoc2020.day1.ReportRepair2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

import java.util.List;

class Day1Test {

    private static final List<Integer> example = InputParser.getIntegerList("inputs/day1_example");
    private static final List<Integer> input = InputParser.getIntegerList("inputs/day1");

    @Test
    void example() {
        Logger.info("Day 1: Report Repair - Example");
        int result = new ReportRepair1().solve(example);
        Logger.info("Result: " + result);
        Assertions.assertEquals(514579, result);
    }

    @Test
    void part1() {
        Logger.info("Day 1: Report Repair - Part 1");
        int result = new ReportRepair1().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(713184, result);
    }

    @Test
    void part2() {
        Logger.info("Day 1: Report Repair - Part 2");
        int result = new ReportRepair2().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(261244452, result);
    }

}

package not.hub.aoc2020.tests;

import not.hub.aoc2020.day1.ReportRepair1;
import not.hub.aoc2020.day1.ReportRepair2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

import java.util.List;

@DisplayName("Day 1: Report Repair")
class Day1Test {

    private static final List<Integer> example = InputParser.getIntegerList("inputs/day1_example");
    private static final List<Integer> input = InputParser.getIntegerList("inputs/day1");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example() {
        int result = new ReportRepair1().solve(example);
        Assertions.assertEquals(514579, result);
        Logger.info("Part 1 - Example: " + result);
    }

    @Test
    @DisplayName("Part 1")
    void part1() {
        int result = new ReportRepair1().solve(input);
        Assertions.assertEquals(713184, result);
        Logger.info("Part 1: " + result);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example() {
        int result = new ReportRepair2().solve(example);
        Assertions.assertEquals(241861950, result);
        Logger.info("Part 2 - Example: " + result);
    }

    @Test
    @DisplayName("Part 2")
    void part2() {
        int result = new ReportRepair2().solve(input);
        Assertions.assertEquals(261244452, result);
        Logger.info("Part 2: " + result);
    }

}

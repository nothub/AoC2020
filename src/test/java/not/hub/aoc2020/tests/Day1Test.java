package not.hub.aoc2020.tests;

import not.hub.aoc2020.day1.ReportRepair1;
import not.hub.aoc2020.day1.ReportRepair2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 1: Report Repair")
@Execution(ExecutionMode.CONCURRENT)
class Day1Test {

    private static final List<Integer> example = InputParser.getIntegerList("inputs/day1_example");
    private static final List<Integer> input = InputParser.getIntegerList("inputs/day1");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        Util.test(514579, new ReportRepair1().solve(example), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        Util.test(713184, new ReportRepair1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        Util.test(241861950, new ReportRepair2().solve(example), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        Util.test(261244452, new ReportRepair2().solve(input), info);
    }

}

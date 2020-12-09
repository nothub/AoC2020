package not.hub.aoc2020.tests;

import not.hub.aoc2020.day7.HandyHaversacks1;
import not.hub.aoc2020.day7.HandyHaversacks2;
import not.hub.aoc2020.tests.util.AssertWrapper;
import not.hub.aoc2020.tests.util.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@DisplayName("Day 7: Handy Haversacks")
@Execution(ExecutionMode.CONCURRENT)
class Day7Test {

    private static final String example1 = InputParser.string("inputs/day7_example_1");
    private static final String example2 = InputParser.string("inputs/day7_example_2");
    private static final String input = InputParser.string("inputs/day7");

    @Test
    @DisplayName("Part 1 - Example (1)")
    void part1_example1(TestInfo info) {
        AssertWrapper.equals(4, new HandyHaversacks1().solve(example1), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        AssertWrapper.equals(213, new HandyHaversacks1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example (1)")
    void part2_example1(TestInfo info) {
        AssertWrapper.equals(32, new HandyHaversacks2().solve(example1), info);
    }

    @Test
    @DisplayName("Part 2 - Example (2)")
    void part2_example2(TestInfo info) {
        AssertWrapper.equals(126, new HandyHaversacks2().solve(example2), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        AssertWrapper.equals(38426, new HandyHaversacks2().solve(input), info);
    }

}

package not.hub.aoc2020.tests;

import not.hub.aoc2020.day8.HandheldHalting1;
import not.hub.aoc2020.day8.HandheldHalting2;
import not.hub.aoc2020.tests.util.AssertWrapper;
import not.hub.aoc2020.tests.util.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 8: Handheld Halting")
@Execution(ExecutionMode.CONCURRENT)
class Day8Test {

    private static final List<String> example = InputParser.stringList("inputs/day8_example");
    private static final List<String> input = InputParser.stringList("inputs/day8");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        AssertWrapper.equals(5, new HandheldHalting1().solve(example), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        AssertWrapper.equals(1217, new HandheldHalting1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        AssertWrapper.equals(8, new HandheldHalting2().solve(example), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        AssertWrapper.equals(501, new HandheldHalting2().solve(input), info);
    }

}

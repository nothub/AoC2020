package not.hub.aoc2020.tests;

import not.hub.aoc2020.day5.BinaryBoarding1;
import not.hub.aoc2020.day5.BinaryBoarding2;
import not.hub.aoc2020.tests.util.AssertWrapper;
import not.hub.aoc2020.tests.util.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 5: Binary Boarding Philosophy")
@Execution(ExecutionMode.CONCURRENT)
class Day5Test {

    private static final List<String> example = InputParser.stringList("inputs/day5_example");
    private static final List<String> input = InputParser.stringList("inputs/day5");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        AssertWrapper.equals(820, new BinaryBoarding1().solve(example), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        AssertWrapper.equals(848, new BinaryBoarding1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        AssertWrapper.equals(682, new BinaryBoarding2().solve(input), info);
    }

}

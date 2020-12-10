package not.hub.aoc2020.tests;

import not.hub.aoc2020.day10.AdapterArray1;
import not.hub.aoc2020.day10.AdapterArray2;
import not.hub.aoc2020.tests.util.AssertWrapper;
import not.hub.aoc2020.tests.util.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 10: Adapter Array")
@Execution(ExecutionMode.CONCURRENT)
class Day10Test {

    private static final List<Integer> example1 = InputParser.integerList("inputs/day10_example_1");
    private static final List<Integer> example2 = InputParser.integerList("inputs/day10_example_2");
    private static final List<Integer> input = InputParser.integerList("inputs/day10");

    @Test
    @DisplayName("Part 1 - Example (1)")
    void part1_example1(TestInfo info) {
        AssertWrapper.equals(35, new AdapterArray1().solve(example1), info);
    }

    @Test
    @DisplayName("Part 1 - Example (2)")
    void part1_example2(TestInfo info) {
        AssertWrapper.equals(220, new AdapterArray1().solve(example2), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        AssertWrapper.equals(2263, new AdapterArray1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example (1)")
    void part2_example1(TestInfo info) {
        AssertWrapper.equals(8, new AdapterArray2().solve(example1), info);
    }

    @Test
    @DisplayName("Part 2 - Example (2)")
    void part2_example2(TestInfo info) {
        AssertWrapper.equals(19208, new AdapterArray2().solve(example2), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        AssertWrapper.equals(396857386627072L, new AdapterArray2().solve(input), info);
    }

}

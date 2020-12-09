package not.hub.aoc2020.tests;

import not.hub.aoc2020.day3.TobogganTrajectory1;
import not.hub.aoc2020.day3.TobogganTrajectory2;
import not.hub.aoc2020.tests.util.AssertWrapper;
import not.hub.aoc2020.tests.util.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 3: Toboggan Trajectory")
@Execution(ExecutionMode.CONCURRENT)
class Day3Test {

    private static final List<String> example = InputParser.stringList("inputs/day3_example");
    private static final List<String> input = InputParser.stringList("inputs/day3");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        AssertWrapper.equals(7, new TobogganTrajectory1().solve(example), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        AssertWrapper.equals(254, new TobogganTrajectory1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        AssertWrapper.equals(336, new TobogganTrajectory2().solve(example), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        AssertWrapper.equals(1666768320, new TobogganTrajectory2().solve(input), info);
    }

}

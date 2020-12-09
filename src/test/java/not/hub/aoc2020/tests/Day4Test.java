package not.hub.aoc2020.tests;

import not.hub.aoc2020.day4.PassportProcessing1;
import not.hub.aoc2020.day4.PassportProcessing2;
import not.hub.aoc2020.tests.util.AssertWrapper;
import not.hub.aoc2020.tests.util.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@DisplayName("Day 4: Passport Processing")
@Execution(ExecutionMode.CONCURRENT)
class Day4Test {

    private static final String example1 = InputParser.string("inputs/day4_example_1");
    private static final String example2 = InputParser.string("inputs/day4_example_2");
    private static final String input = InputParser.string("inputs/day4");

    @Test
    @DisplayName("Part 1 - Example (1)")
    void part1_example1(TestInfo info) {
        AssertWrapper.equals(2, new PassportProcessing1().solve(example1), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        AssertWrapper.equals(206, new PassportProcessing1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example (2)")
    void part2_example2(TestInfo info) {
        AssertWrapper.equals(4, new PassportProcessing2().solve(example2), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        AssertWrapper.equals(123, new PassportProcessing2().solve(input), info);
    }

}

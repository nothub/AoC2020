package not.hub.aoc2020.tests;

import not.hub.aoc2020.day4.PassportProcessing1;
import not.hub.aoc2020.day4.PassportProcessing2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

@DisplayName("Day 4: Passport Processing")
class Day4Test {

    private static final String example1 = InputParser.getString("inputs/day4_example_1");
    private static final String example2 = InputParser.getString("inputs/day4_example_2");
    private static final String input = InputParser.getString("inputs/day4");

    @Test
    @DisplayName("Part 1 - Example 1")
    void part1_example1() {
        int result = new PassportProcessing1().solve(example1);
        Assertions.assertEquals(2, result);
        Logger.info("Part 1 - Example 1: " + result);
    }

    @Test
    @DisplayName("Part 1")
    void part1() {
        int result = new PassportProcessing1().solve(input);
        Assertions.assertEquals(206, result);
        Logger.info("Part 1: " + result);
    }

    @Test
    @DisplayName("Part 2 - Example 2")
    void part2_example2() {
        int result = new PassportProcessing2().solve(example2);
        Assertions.assertEquals(4, result);
        Logger.info("Part 2 - Example 2: " + result);
    }

    @Test
    @DisplayName("Part 2")
    void part2() {
        int result = new PassportProcessing2().solve(input);
        Assertions.assertEquals(123, result);
        Logger.info("Part 2: " + result);
    }

}

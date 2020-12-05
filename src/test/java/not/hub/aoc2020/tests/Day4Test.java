package not.hub.aoc2020.tests;

import not.hub.aoc2020.day4.PassportProcessing1;
import not.hub.aoc2020.day4.PassportProcessing2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

class Day4Test {

    private static final String example = InputParser.getString("inputs/day4_example");
    private static final String input = InputParser.getString("inputs/day4");

    @Test
    void example() {
        Logger.info("Day 4: Passport Processing - Example");
        int result = new PassportProcessing1().solve(example);
        Logger.info("Result: " + result);
        Assertions.assertEquals(2, result);
    }

    @Test
    void part1() {
        Logger.info("Day 4: Passport Processing - Part 1");
        int result = new PassportProcessing1().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(206, result);
    }

    @Test
    void part2() {
        Logger.info("Day 4: Passport Processing - Part 2");
        int result = new PassportProcessing2().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(123, result);
    }

}

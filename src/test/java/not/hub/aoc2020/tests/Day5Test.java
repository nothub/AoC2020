package not.hub.aoc2020.tests;

import not.hub.aoc2020.day5.BinaryBoarding1;
import not.hub.aoc2020.day5.BinaryBoarding2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

import java.util.List;

@DisplayName("Day 5: Binary Boarding Philosophy")
class Day5Test {

    private static final List<String> example = InputParser.getStringList("inputs/day5_example");
    private static final List<String> input = InputParser.getStringList("inputs/day5");

    @Test
    @DisplayName("Example")
    void example() {
        int result = new BinaryBoarding1().solve(example);
        Assertions.assertEquals(820, result);
        Logger.info("Result: " + result);
    }

    @Test
    @DisplayName("Part 1")
    void part1() {
        int result = new BinaryBoarding1().solve(input);
        Assertions.assertEquals(848, result);
        Logger.info("Result: " + result);
    }

    @Test
    @DisplayName("Part 2")
    void part2() {
        int result = new BinaryBoarding2().solve(input);
        Assertions.assertEquals(682, result);
        Logger.info("Result: " + result);
    }

}

package not.hub.aoc2020.tests;

import not.hub.aoc2020.day5.BinaryBoarding1;
import not.hub.aoc2020.day5.BinaryBoarding2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

import java.util.List;

class Day5Test {

    private static final List<String> example = InputParser.getStringList("inputs/day5_example");
    private static final List<String> input = InputParser.getStringList("inputs/day5");

    @Test
    void example() {
        Logger.info("Day 5: Binary Boarding - Example");
        int result = new BinaryBoarding1().solve(example);
        Logger.info("Result: " + result);
        Assertions.assertEquals(820, result);
    }

    @Test
    void part1() {
        Logger.info("Day 5: Binary Boarding - Part 1");
        int result = new BinaryBoarding1().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(848, result);
    }

    @Test
    void part2() {
        Logger.info("Day 5: Binary Boarding - Part 2");
        int result = new BinaryBoarding2().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(682, result);
    }

}

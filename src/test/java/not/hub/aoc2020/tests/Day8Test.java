package not.hub.aoc2020.tests;

import not.hub.aoc2020.day5.BinaryBoarding1;
import not.hub.aoc2020.day5.BinaryBoarding2;
import not.hub.aoc2020.day7.HandyHaversacks1;
import not.hub.aoc2020.day8.HandheldHalting1;
import not.hub.aoc2020.day8.HandheldHalting2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

import java.util.List;

@DisplayName("Day 8: Handheld Halting")
class Day8Test {

    private static final List<String> example = InputParser.getStringList("inputs/day8_example");
    private static final List<String> input = InputParser.getStringList("inputs/day8");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example() {
        int result = new HandheldHalting1().solve(example);
        Assertions.assertEquals(5, result);
        Logger.info("Part 1 - Example: " + result);
    }

    @Test
    @DisplayName("Part 1")
    void part1() {
        int result = new HandheldHalting1().solve(input);
        Assertions.assertEquals(1217, result);
        Logger.info("Part 1: " + result);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example() {
        int result = new HandheldHalting2().solve(example);
        Assertions.assertEquals(8, result);
        Logger.info("Part 2 - Example: " + result);
    }

    @Test
    @DisplayName("Part 2")
    void part2() {
        int result = new HandheldHalting2().solve(input);
        Assertions.assertEquals(501, result);
        Logger.info("Part 2: " + result);
    }

}

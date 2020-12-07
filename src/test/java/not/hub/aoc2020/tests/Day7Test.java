package not.hub.aoc2020.tests;

import not.hub.aoc2020.day7.HandyHaversacks1;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

@DisplayName("Day 7: Handy Haversacks")
class Day7Test {

    private static final String example = InputParser.getString("inputs/day7_example");
    private static final String input = InputParser.getString("inputs/day7");

    @Test
    @DisplayName("Example")
    void example() {
        long result = new HandyHaversacks1().solve(example);
        Assertions.assertEquals(4, result);
        Logger.info("Example: " + result);
    }

    @Test
    @DisplayName("Part 1")
    void part1() {
        long result = new HandyHaversacks1().solve(input);
        Assertions.assertEquals(213, result);
        Logger.info("Part 1: " + result);
    }

/*
    @Test
    @DisplayName("Part 2")
    void part2() {
        long result = new HandyHaversacks2().solve(input);
        Assertions.assertEquals(420, result);
        Logger.info("Part 2: " + result);
    }
*/

}

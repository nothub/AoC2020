package not.hub.aoc2020.tests;

import not.hub.aoc2020.day3.TobogganTrajectory1;
import not.hub.aoc2020.day3.TobogganTrajectory2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

import java.util.List;

@DisplayName("Day 3: Toboggan Trajectory")
class Day3Test {

    private static final List<String> example = InputParser.getStringList("inputs/day3_example");
    private static final List<String> input = InputParser.getStringList("inputs/day3");

    @Test
    @DisplayName("Example")
    void example() {
        int result = new TobogganTrajectory1().solve(example);
        Assertions.assertEquals(7, result);
        Logger.info("Example: " + result);
    }

    @Test
    @DisplayName("Part 1")
    void part1() {
        int result = new TobogganTrajectory1().solve(input);
        Assertions.assertEquals(254, result);
        Logger.info("Part 1: " + result);
    }

    @Test
    @DisplayName("Part 2")
    void part2() {
        int result = new TobogganTrajectory2().solve(input);
        Assertions.assertEquals(1666768320, result);
        Logger.info("Part 2: " + result);
    }

}

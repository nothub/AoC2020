package not.hub.aoc2020.tests;

import not.hub.aoc2020.day3.TobogganTrajectory1;
import not.hub.aoc2020.day3.TobogganTrajectory2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

import java.util.List;

class Day3Test {

    private static final List<String> example = InputParser.getStringList("inputs/day3_example");
    private static final List<String> input = InputParser.getStringList("inputs/day3");

    @Test
    void example() {
        Logger.info("Day 3: Toboggan Trajectory - Example");
        int result = new TobogganTrajectory1().solve(example);
        Logger.info("Result: " + result);
        Assertions.assertEquals(7, result);
    }

    @Test
    void part1() {
        Logger.info("Day 3: Toboggan Trajectory - Part 1");
        int result = new TobogganTrajectory1().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(254, result);
    }

    @Test
    void part2() {
        Logger.info("Day 3: Toboggan Trajectory - Part 2");
        int result = new TobogganTrajectory2().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(1666768320, result);
    }

}

package not.hub.aoc2020.tests;

import not.hub.aoc2020.day3.TobogganTrajectory1;
import not.hub.aoc2020.day3.TobogganTrajectory2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day3Test {

    private static final List<String> example = InputParser.getStringList("inputs/day3_example");
    private static final List<String> input = InputParser.getStringList("inputs/day3");

    @Test
    void example() {
        Assertions.assertEquals(7, new TobogganTrajectory1().solve(example));
    }

    @Test
    void part1() {
        Assertions.assertEquals(254, new TobogganTrajectory1().solve(input));
    }

    @Test
    void part2() {
        Assertions.assertEquals(1666768320, new TobogganTrajectory2().solve(input));
    }

}

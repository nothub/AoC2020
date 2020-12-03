package not.hub.aoc.tests;

import not.hub.aoc.day3.TobogganTrajectory1;
import not.hub.aoc.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day3Test {

    private static final List<String> input = InputParser.getStringList("inputs/day3");

    @Test
    void part1() {
        Assertions.assertEquals(254, new TobogganTrajectory1().solve(input));
    }

}

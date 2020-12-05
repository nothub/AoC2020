package not.hub.aoc.tests;

import not.hub.aoc.day5.BinaryBoarding1;
import not.hub.aoc.day5.BinaryBoarding2;
import not.hub.aoc.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day5Test {

    private static final List<String> example = InputParser.getStringList("inputs/day5_example");
    private static final List<String> input = InputParser.getStringList("inputs/day5");

    @Test
    void example() {
        Assertions.assertEquals(820, new BinaryBoarding1().solve(example));
    }

    @Test
    void part1() {
        Assertions.assertEquals(848, new BinaryBoarding1().solve(input));
    }

    @Test
    void part2() {
        Assertions.assertEquals(682, new BinaryBoarding2().solve(input));
    }

}

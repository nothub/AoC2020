package not.hub.aoc.tests;

import not.hub.aoc.day5.BinaryBoarding1;
import not.hub.aoc.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day5Test {

    private static final String example = InputParser.getString("inputs/day5_example");
    //private static final String input = InputParser.getString("inputs/day5");

    @Test
    void example() {
        Assertions.assertEquals(567, new BinaryBoarding1().solve(example));
    }

    //@Test
    //void part1() {
    //    Assertions.assertEquals(0, new BinaryBoarding2().solve(input));
    //}

    //@Test
    //void part2() {
    //    Assertions.assertEquals(0, new BinaryBoarding2().solve(input));
    //}

}

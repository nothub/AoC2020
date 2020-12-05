package not.hub.aoc2020.tests;

import not.hub.aoc2020.day4.PassportProcessing1;
import not.hub.aoc2020.day4.PassportProcessing2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day4Test {

    private static final String example = InputParser.getString("inputs/day4_example");
    private static final String input = InputParser.getString("inputs/day4");

    @Test
    void example() {
        Assertions.assertEquals(2, new PassportProcessing1().solve(example));
    }

    @Test
    void part1() {
        Assertions.assertEquals(206, new PassportProcessing1().solve(input));
    }

    @Test
    void part2() {
        Assertions.assertEquals(123, new PassportProcessing2().solve(input));
    }

}

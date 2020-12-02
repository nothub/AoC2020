package not.hub.aoc.tests;

import not.hub.aoc.day2.PasswordPhilosophy1;
import not.hub.aoc.day2.PasswordPhilosophy2;
import not.hub.aoc.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day2Test {

    private static final String input = InputParser.getString("inputs/day2");

    @Test
    void part1() {
        Assertions.assertEquals(638, new PasswordPhilosophy1().solve(input));
    }

    @Test
    void part2() {
        Assertions.assertEquals(699, new PasswordPhilosophy2().solve(input));
    }

}

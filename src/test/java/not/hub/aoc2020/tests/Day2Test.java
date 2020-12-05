package not.hub.aoc2020.tests;

import not.hub.aoc2020.day2.PasswordPhilosophy1;
import not.hub.aoc2020.day2.PasswordPhilosophy2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

class Day2Test {

    private static final String example = InputParser.getString("inputs/day2_example");
    private static final String input = InputParser.getString("inputs/day2");

    @Test
    void example() {
        Logger.info("Day 2: Password Philosophy - Example");
        int result = new PasswordPhilosophy1().solve(example);
        Logger.info("Result: " + result);
        Assertions.assertEquals(2, result);
    }

    @Test
    void part1() {
        Logger.info("Day 2: Password Philosophy - Part 1");
        int result = new PasswordPhilosophy1().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(638, result);
    }

    @Test
    void part2() {
        Logger.info("Day 2: Password Philosophy - Part 2");
        int result = new PasswordPhilosophy2().solve(input);
        Logger.info("Result: " + result);
        Assertions.assertEquals(699, result);
    }

}

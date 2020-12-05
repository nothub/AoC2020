package not.hub.aoc2020.tests;

import not.hub.aoc2020.day2.PasswordPhilosophy1;
import not.hub.aoc2020.day2.PasswordPhilosophy2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

@DisplayName("Day 2: Password Philosophy")
class Day2Test {

    private static final String example = InputParser.getString("inputs/day2_example");
    private static final String input = InputParser.getString("inputs/day2");

    @Test
    @DisplayName("Example")
    void example() {
        int result = new PasswordPhilosophy1().solve(example);
        Assertions.assertEquals(2, result);
        Logger.info("Result: " + result);
    }

    @Test
    @DisplayName("Part 1")
    void part1() {
        int result = new PasswordPhilosophy1().solve(input);
        Assertions.assertEquals(638, result);
        Logger.info("Result: " + result);
    }

    @Test
    @DisplayName("Part 2")
    void part2() {
        int result = new PasswordPhilosophy2().solve(input);
        Assertions.assertEquals(699, result);
        Logger.info("Result: " + result);
    }

}

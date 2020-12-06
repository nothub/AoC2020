package not.hub.aoc2020.tests;

import not.hub.aoc2020.day6.CustomCustoms1;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

@DisplayName("Day 6: Custom Customs")
class Day6Test {

    private static final String example = InputParser.getString("inputs/day6_example");
    private static final String input = InputParser.getString("inputs/day6");

    @Test
    @DisplayName("Example")
    void example() {
        int result = new CustomCustoms1().solve(example);
        Assertions.assertEquals(11, result);
        Logger.info("Example: " + result);
    }

    @Test
    @DisplayName("Part 1")
    void part1() {
        int result = new CustomCustoms1().solve(input);
        Assertions.assertEquals(6768, result);
        Logger.info("Part 1: " + result);
    }

    //@Test
    //@DisplayName("Part 2")
    //void part2() {
    //int result = new CustomCustoms2().solve(input);
    //Assertions.assertEquals(682, result);
    //Logger.info("Part 2: " + result);
    //}

}

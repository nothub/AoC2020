package not.hub.aoc2020.tests;

import not.hub.aoc2020.day6.CustomCustoms1;
import not.hub.aoc2020.day6.CustomCustoms2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@DisplayName("Day 6: Custom Customs")
@Execution(ExecutionMode.CONCURRENT)
class Day6Test {

    private static final String example = InputParser.getString("inputs/day6_example");
    private static final String input = InputParser.getString("inputs/day6");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        Util.test(11, new CustomCustoms1().solve(example), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        Util.test(6768, new CustomCustoms1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        Util.test(6, new CustomCustoms2().solve(example), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        Util.test(3489, new CustomCustoms2().solve(input), info);
    }

}

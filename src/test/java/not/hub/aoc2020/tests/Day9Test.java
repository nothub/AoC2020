package not.hub.aoc2020.tests;

import not.hub.aoc2020.day9.EncodingError1;
import not.hub.aoc2020.day9.EncodingError2;
import not.hub.aoc2020.utils.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.math.BigInteger;
import java.util.List;

@DisplayName("Day 8: Encoding Error")
@Execution(ExecutionMode.CONCURRENT)
class Day9Test {

    private static final List<BigInteger> example = InputParser.getBigIntegerList("inputs/day9_example");
    private static final List<BigInteger> input = InputParser.getBigIntegerList("inputs/day9");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        Util.test(new BigInteger(String.valueOf(127)), new EncodingError1().solve(example, 5), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        Util.test(new BigInteger(String.valueOf(14144619)), new EncodingError1().solve(input, 25), info);
    }


    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        Util.test(new BigInteger(String.valueOf(62)), new EncodingError2().solve(example, 5), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        Util.test(new BigInteger(String.valueOf(1766397)), new EncodingError2().solve(input, 25), info);
    }

}

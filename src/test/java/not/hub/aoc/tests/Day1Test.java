package not.hub.aoc.tests;

import not.hub.aoc.day1.ReportRepair1;
import not.hub.aoc.day1.ReportRepair2;
import not.hub.aoc.utils.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day1Test {

    private static final List<Integer> input = InputParser.getIntegerList("inputs/day1");

    @Test
    void part1() {
        Assertions.assertEquals(713184, new ReportRepair1().solve(input));
    }

    @Test
    void part2() {
        Assertions.assertEquals(261244452, new ReportRepair2().solve(input));
    }

}

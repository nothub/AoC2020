package not.hub.aoc.day3;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.List;

public class TobogganTrajectory1 extends Solver<List<String>, Integer> {

    protected static final char TREE = '#';

    @Override
    public Integer solve(List<String> input) {

        Logger.info("Day 3: Toboggan Trajectory - Part 1");

        var trees = 0;
        var offset = 0;

        for (var line : input) {
            if (line.charAt(offset % line.length()) == TREE) {
                trees++;
            }
            offset = offset + 3;
        }

        Logger.info("Result: " + trees);
        return trees;

    }

}

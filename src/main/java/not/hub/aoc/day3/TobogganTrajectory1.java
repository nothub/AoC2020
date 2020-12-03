package not.hub.aoc.day3;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.List;

public class TobogganTrajectory1 extends Solver<List<String>, Integer> {

    protected static final char TREE = '#';

    @Override
    public Integer solve(List<String> input) {

        Logger.info("Day 3: Toboggan Trajectory - Part 1");

        int trees = 0;
        int offset = 0;

        for (String line : input) {
            if (line.charAt(offset % line.length()) == TREE) {
                trees++;
            }
            offset = offset + 3;
        }

        Logger.info("Result: " + trees);
        return trees;

    }

}

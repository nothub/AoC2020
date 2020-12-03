package not.hub.aoc.day3;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.List;

public class TobogganTrajectory1 extends Solver<List<String>, Integer> {


    @Override
    public Integer solve(List<String> input) {

        Logger.info("Day 3: Toboggan Trajectory - Part 1");

        int numTrees = 0;
        int offSet = 0;

        for (String line : input) {
            if (line.charAt(offSet % line.length()) == '#') {
                numTrees++;
            }
            offSet = offSet + 3;
        }

        Logger.info("Result: " + numTrees);
        return numTrees;

    }

}

package not.hub.aoc.day3;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static not.hub.aoc.day3.TobogganTrajectory1.TREE;

public class TobogganTrajectory2 extends Solver<List<String>, Integer> {

    @Override
    public Integer solve(List<String> input) {

        Logger.info("Day 3: Toboggan Trajectory - Part 2");

        int totalNumTrees = 1;

        for (Map.Entry<Integer, Integer> slope : List.of(
                new AbstractMap.SimpleEntry<>(1, 1),
                new AbstractMap.SimpleEntry<>(3, 1),
                new AbstractMap.SimpleEntry<>(5, 1),
                new AbstractMap.SimpleEntry<>(7, 1),
                new AbstractMap.SimpleEntry<>(1, 2))) {
            totalNumTrees *= calcNumTrees(input, slope.getKey(), slope.getValue());
        }

        Logger.info("Result: " + totalNumTrees);
        return totalNumTrees;

    }

    private int calcNumTrees(List<String> input, int offsetH, int offsetV) {

        int trees = 0;
        int offset = 0;

        for (String line : IntStream.range(0, input.size()).filter(i -> i % offsetV == 0).mapToObj(input::get).collect(Collectors.toList())) {
            if (line.charAt(offset % line.length()) == TREE) {
                trees++;
            }
            offset += offsetH;
        }

        return trees;

    }

}

package not.hub.aoc2020.day7;

import not.hub.aoc2020.Solver;

import java.util.Map;

import static not.hub.aoc2020.day7.HandyHaversacks1.parse;
import static not.hub.aoc2020.day7.HandyHaversacks1.shiny_gold;

public class HandyHaversacks2 extends Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        return innerBags(shiny_gold, parse(input), false);
    }

    private int innerBags(String name, Map<String, Map<String, Integer>> bags, boolean isInner) {
        return bags.get(name).entrySet().stream().mapToInt(bag ->
                innerBags(bag.getKey(), bags, true) * bag.getValue()
        ).sum() + (isInner ? 1 : 0);
    }

}

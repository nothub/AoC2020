package not.hub.aoc2020.day10;

import not.hub.aoc2020.Solver;

import java.util.List;
import java.util.stream.Collectors;

public class AdapterArray1 extends Solver<List<Integer>, Integer> {

    @Override
    public Integer solve(List<Integer> input) {
        List<Integer> sorted = input.stream().sorted().collect(Collectors.toList());
        int diff1 = 1;
        int diff3 = 1;
        for (int i = 1; i < sorted.size(); i++) {
            int diff = sorted.get(i) - sorted.get(i - 1);
            if (diff == 1) {
                diff1++;
            } else if (diff == 3) {
                diff3++;
            }
        }
        return diff1 * diff3;
    }

}

package not.hub.aoc2020.day10;

import not.hub.aoc2020.Solver;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdapterArray2 extends Solver<List<Integer>, Long> {

    @Override
    public Long solve(List<Integer> input) {
        List<Integer> sorted = input.stream().sorted().collect(Collectors.toList());
        sorted.add(sorted.get(sorted.size() - 1) + 3);
        var data = new long[]{1, 0, 0, 0};
        var last = 0;
        for (var n : sorted) {
            final int diff = n - last;
            System.arraycopy(data, 0, data, diff, data.length - diff);
            IntStream.range(0, diff).forEach(i -> data[i] = 0);
            data[0] = Arrays.stream(data).sum();
            last = n;
        }
        return data[0];
    }

}

package not.hub.aoc2020.day9;

import not.hub.aoc2020.PuzzleException;
import not.hub.aoc2020.Solver;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static not.hub.aoc2020.day9.EncodingError1.calcNumber;


public class EncodingError2 extends Solver<List<BigInteger>, BigInteger> {

    public BigInteger bruteforce(List<BigInteger> input, BigInteger part1) {
        Set<BigInteger> range = null;
        for (int m = 0; m < input.size(); m++) {
            Set<BigInteger> contigSet = new HashSet<>();
            // contigSet.stream().reduce(BigInteger::add).orElse(BigInteger.ZERO).equals(part1)
            // needs a long time for the given input to be calculated, we sum manually instead:
            BigInteger contigSum = BigInteger.ZERO.add(input.get(m));
            contigSet.add(input.get(m));
            for (int n = m + 1; n < input.size(); n++) {
                contigSet.add(input.get(n));
                contigSum = contigSum.add(input.get(n));
                if (contigSum.equals(part1)) {
                    range = contigSet;
                    break;
                }
            }
            if (range != null) {
                break;
            }
        }
        if (range == null || range.isEmpty()) {
            throw new PuzzleException("No result found");
        }
        return range.stream().min(BigInteger::compareTo).orElseThrow()
                .add(range.stream().max(BigInteger::compareTo).orElseThrow());
    }

    @Override
    public BigInteger solve(List<BigInteger> input, int preambleSize) {
        return bruteforce(input, calcNumber(input, preambleSize));
    }

    @Override
    public BigInteger solve(List<BigInteger> input) {
        return solve(input, 25);
    }

}

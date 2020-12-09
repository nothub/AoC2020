package not.hub.aoc2020.day9;

import not.hub.aoc2020.Solver;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static not.hub.aoc2020.day9.EncodingError1.calcNumber;


public class EncodingError2 extends Solver<List<BigInteger>, BigInteger> {

    public BigInteger bruteforce(List<BigInteger> input, BigInteger part1) {
        Set<BigInteger> range = null;
        for (int i = 0; i < input.size(); i++) {
            BigInteger contiguousSum = BigInteger.ZERO.add(input.get(i));
            Set<BigInteger> contiguousSet = new HashSet<>();
            contiguousSet.add(input.get(i));
            for (int j = i + 1; j < input.size(); j++) {
                contiguousSum = contiguousSum.add(input.get(j));
                contiguousSet.add(input.get(j));
                if (contiguousSum.equals(part1)) {
                    range = contiguousSet;
                    break;
                }
            }
            if (range != null) {
                break;
            }
        }
        if (range == null) {
            throw new IllegalStateException("No result found");
        }
        return range.stream().min(BigInteger::compareTo).orElseThrow().add(range.stream().max(BigInteger::compareTo).orElseThrow());
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

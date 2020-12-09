package not.hub.aoc2020.day9;

import not.hub.aoc2020.Solver;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static not.hub.aoc2020.day9.EncodingError1.calcNumber;


public class EncodingError2 extends Solver<List<BigInteger>, BigInteger> {

    private static Set<BigInteger> getRange(List<BigInteger> input, BigInteger number) {
        for (int i = 0; i < input.size(); i++) {
            for (int j = i; j < input.size(); j++) {
                Set<BigInteger> operands = new HashSet<>(input.subList(i, j));
                if (operands.stream().reduce(BigInteger::add).orElse(BigInteger.ZERO).equals(number)) {
                    return operands;
                }
            }
        }
        throw new IllegalStateException("No result found");
    }

    @Override
    public BigInteger solve(List<BigInteger> input, int preambleSize) {
        Set<BigInteger> range = getRange(input, calcNumber(input, preambleSize));
        return range.stream().min(BigInteger::compareTo).orElseThrow().add(range.stream().max(BigInteger::compareTo).orElseThrow());
    }

    @Override
    public BigInteger solve(List<BigInteger> input) {
        return solve(input, 25);
    }

}

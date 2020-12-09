package not.hub.aoc2020.day9;

import not.hub.aoc2020.Solver;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static not.hub.aoc2020.day9.EncodingError1.calcNumber;


public class EncodingError2 extends Solver<List<BigInteger>, BigInteger> {

    private static BigInteger bruteforce(List<BigInteger> input, BigInteger number) {
        for (int i = 0; i < input.size(); i++) {
            for (int j = i; j < input.size(); j++) {
                Set<BigInteger> operands = new HashSet<>(input.subList(i, j));
                if (operands.stream().reduce(BigInteger::add).orElse(BigInteger.ZERO).equals(number)) {
                    return operands.stream().min(BigInteger::compareTo).orElseThrow().add(operands.stream().max(BigInteger::compareTo).orElseThrow());
                }
            }
        }
        throw new IllegalStateException("No result found");
    }

    public BigInteger d(List<BigInteger> input, int preambleSize) {
        BigInteger part1 = calcNumber(input, preambleSize);
        BigInteger result = null;
        for (int i = 0; i < input.size(); i++) {
            var test_num = input.get(i);
            var sum = BigInteger.ZERO.add(test_num);
            List<BigInteger> range = new ArrayList<>();
            range.add(test_num);
            for (int j = i + 1; j < input.size(); j++) {
                var sum_num = input.get(j);
                range.add(sum_num);
                sum = sum.add(sum_num);
                if (sum.equals(part1)) {
                    result = range.stream().min(BigInteger::compareTo).orElseThrow().add(range.stream().max(BigInteger::compareTo).orElseThrow());
                } else if (sum.compareTo(part1) > 0) {
                    break;
                }
            }
        }
        if (result == null) {
            throw new IllegalStateException("No result found");
        }
        return result;
    }

    @Override
    public BigInteger solve(List<BigInteger> input, int preambleSize) {
        return d(input, preambleSize);
        //return bruteforce(input, calcNumber(input, preambleSize));
    }

    @Override
    public BigInteger solve(List<BigInteger> input) {
        return solve(input, 25);
    }

}

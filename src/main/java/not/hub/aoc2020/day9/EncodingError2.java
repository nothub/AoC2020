package not.hub.aoc2020.day9;

import not.hub.aoc2020.Solver;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static not.hub.aoc2020.day9.EncodingError1.calcNumber;


public class EncodingError2 extends Solver<List<BigInteger>, BigInteger> {

    private static BigInteger bruteforce(List<BigInteger> input, BigInteger part1) {
        BigInteger result = null;
        for (int n = 0; n < input.size(); n++) {
            var numN = input.get(n);
            var sum = BigInteger.ZERO.add(numN);
            List<BigInteger> operands = new ArrayList<>();
            operands.add(input.get(n));
            for (int m = n + 1; m < input.size(); m++) {
                var numM = input.get(m);
                operands.add(numM);
                sum = sum.add(numM);
                if (sum.equals(part1)) {
                    result = operands.stream().min(BigInteger::compareTo).orElseThrow().add(operands.stream().max(BigInteger::compareTo).orElseThrow());
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
        return bruteforce(input, calcNumber(input, preambleSize));
    }

    @Override
    public BigInteger solve(List<BigInteger> input) {
        return solve(input, 25);
    }

}

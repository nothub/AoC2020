package not.hub.aoc2020.day9;

import not.hub.aoc2020.Solver;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

import static not.hub.aoc2020.day9.EncodingError1.calcNumber;


public class EncodingError2 extends Solver<List<BigInteger>, BigInteger> {

    private static BigInteger optimized(List<BigInteger> input, BigInteger part1) {
        AtomicReference<BigInteger> part1Atomic = new AtomicReference<>(part1);
        AtomicReference<BigInteger> result = new AtomicReference<>();
        for (int n = 0; n < input.size(); n++) {
            AtomicReference<BigInteger> sum = new AtomicReference<>(BigInteger.ZERO.add(input.get(n)));
            List<BigInteger> operands = new ArrayList<>();
            operands.add(input.get(n));
            IntStream.range(n + 1, input.size()).boxed().map(input::get).forEach(m -> {
                operands.add(m);
                sum.set(sum.get().add(m));
                if (sum.get().equals(part1Atomic.get())) {
                    result.set(operands.stream().min(BigInteger::compareTo).orElseThrow().add(operands.stream().max(BigInteger::compareTo).orElseThrow()));
                }
            });
        }
        if (result.get() == null) {
            throw new IllegalStateException("No result found");
        }
        return result.get();
    }

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

    public BigInteger bruteforce(List<BigInteger> input, int preambleSize) {
        Set<BigInteger> range = getRange(input, calcNumber(input, preambleSize));
        return range.stream().min(BigInteger::compareTo).orElseThrow().add(range.stream().max(BigInteger::compareTo).orElseThrow());
    }

    @Override
    public BigInteger solve(List<BigInteger> input, int preambleSize) {
        BigInteger bruteforce = bruteforce(input, preambleSize);
        BigInteger optimized = optimized(input, calcNumber(input, preambleSize));
        if (!bruteforce.equals(optimized)) {
            throw new IllegalStateException("bruteforce != optimized");
        }
        return optimized;
    }

    @Override
    public BigInteger solve(List<BigInteger> input) {
        return solve(input, 25);
    }

}

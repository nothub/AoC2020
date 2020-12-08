package not.hub.aoc2020.day8;

import not.hub.aoc2020.Solver;

import java.util.List;
import java.util.stream.Collectors;

import static not.hub.aoc2020.day8.HandheldHalting1.compute;
import static not.hub.aoc2020.day8.HandheldHalting1.parse;
import static not.hub.aoc2020.day8.Instruction.Operation.*;

public class HandheldHalting2 extends Solver<List<String>, Integer> {

    private static Integer bruteforce(List<Instruction> broken) {
        for (int i = 0; i < broken.size(); i++) {
            if (broken.get(i).operation.equals(ACC)) {
                continue;
            }
            var program = broken.stream().map(Instruction::copy).collect(Collectors.toList());
            program.set(i, flip(program.get(i)));
            Result result = compute(program);
            if (result.halted) {
                return result.value;
            }
        }
        throw new IllegalStateException("No result found");
    }

    private static Instruction flip(Instruction ins) {
        switch (ins.operation) {
            case JMP:
                return new Instruction(NOP, ins.value);
            case NOP:
                return new Instruction(JMP, ins.value);
            default:
                throw new IllegalArgumentException("Instruction has ACC operation");
        }
    }

    @Override
    public Integer solve(List<String> input) {
        return bruteforce(parse(input));
    }

}

package not.hub.aoc2020.day8;

import not.hub.aoc2020.Solver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static not.hub.aoc2020.day8.HandheldHalting1.execute;
import static not.hub.aoc2020.day8.HandheldHalting1.parse;
import static not.hub.aoc2020.day8.Instruction.Operation.*;

public class HandheldHalting2 extends Solver<List<String>, Integer> {

    private static Integer bruteforce(List<Instruction> broken) {
        return IntStream.range(0, broken.size()).filter(i ->
                !broken.get(i).op.equals(ACC)
        ).boxed().map(i ->
                execute(flip(broken, i))
        ).filter(result ->
                result.halted
        ).mapToInt(result ->
                result.val
        ).findAny().orElseThrow();
    }

    private static List<Instruction> flip(List<Instruction> broken, int index) {
        var program = broken.stream().map(Instruction::copy).collect(Collectors.toList());
        var ins = program.get(index);
        switch (ins.op) {
            case JMP:
                ins = new Instruction(NOP, ins.val);
                break;
            case NOP:
                ins = new Instruction(JMP, ins.val);
                break;
            default:
                throw new IllegalArgumentException("Unknown operation: " + ins.op);
        }
        program.set(index, ins);
        return program;
    }

    @Override
    public Integer solve(List<String> input) {
        return bruteforce(parse(input));
    }

}

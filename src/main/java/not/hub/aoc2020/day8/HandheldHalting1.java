package not.hub.aoc2020.day8;

import not.hub.aoc2020.Solver;

import java.util.List;
import java.util.stream.Collectors;

public class HandheldHalting1 extends Solver<List<String>, Integer> {

    protected static List<Instruction> parse(List<String> input) {
        return input.stream().map(line -> line.split(" ")).map(result ->
                new Instruction(Instruction.Operation.valueOf(result[0].toUpperCase()), Integer.parseInt(result[1]))
        ).collect(Collectors.toList());
    }

    protected static Result execute(List<Instruction> program) {
        int head = 0;
        int accu = 0;
        while (head < program.size()) {
            var ins = program.get(head);
            if (ins.visited) {
                return new Result(accu, false);
            } else {
                ins.visited = true;
            }
            switch (ins.op) {
                case ACC:
                    accu += ins.val;
                    head++;
                    break;
                case JMP:
                    head += ins.val;
                    break;
                case NOP:
                    head++;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operation: " + ins.op);
            }
        }
        return new Result(accu, true);
    }

    @Override
    public Integer solve(List<String> input) {
        return execute(parse(input)).val;
    }

}

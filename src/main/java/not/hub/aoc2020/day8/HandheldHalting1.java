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

    protected static Result compute(List<Instruction> program) {
        var trackables = program.stream().map(ins ->
                new Trackable(ins, false)
        ).collect(Collectors.toList());
        int head = 0;
        int accu = 0;
        while (head < trackables.size()) {
            var trackable = trackables.get(head);
            if (trackable.visited) {
                return new Result(accu, false);
            } else {
                trackables.set(head, new Trackable(trackable.instruction, true));
            }
            switch (trackable.instruction.operation) {
                case ACC:
                    accu += trackable.instruction.value;
                    head++;
                    break;
                case JMP:
                    head += trackable.instruction.value;
                    break;
                case NOP:
                    head++;
                    break;
            }
        }
        return new Result(accu, true);
    }

    @Override
    public Integer solve(List<String> input) {
        return compute(parse(input)).value;
    }

}

package not.hub.aoc2020.day8;

import not.hub.aoc2020.Solver;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HandheldHalting1 extends Solver<List<String>, Integer> {

    protected static final Pattern pattern = Pattern.compile("(acc|jmp|nop)\\s([+|-]{1}\\d+)");

    static List<Instruction> parse(List<String> input) {
        return input.stream().map(line -> pattern.matcher(line).results().map(result ->
                new Instruction(Instruction.Operation.valueOf(result.group(1).toUpperCase()), Integer.parseInt(result.group(2)))
        ).collect(Collectors.toList())).flatMap(Collection::stream).collect(Collectors.toList());
    }

    static Result compute(List<Instruction> program) {
        var trackables = program.stream().map(ins ->
                new AbstractMap.SimpleEntry<>(ins, false)
        ).collect(Collectors.toList());
        int head = 0;
        int accu = 0;
        int halt = trackables.size();
        while (head < trackables.size()) {
            if (halt <= 0) {
                throw new IllegalStateException("Maximum iterations reached.");
            }
            var trackable = trackables.get(head);
            if (trackable.getValue()) {
                return new Result(accu, false);
            } else {
                trackable.setValue(true);
                trackables.set(head, trackable);
            }
            switch (trackable.getKey().op) {
                case ACC:
                    accu += trackable.getKey().val;
                    head++;
                    break;
                case JMP:
                    head += trackable.getKey().val;
                    break;
                case NOP:
                    head++;
                    break;
            }
            halt--;
        }
        return new Result(accu, true);
    }

    @Override
    public Integer solve(List<String> input) {
        return compute(parse(input)).value;
    }

}

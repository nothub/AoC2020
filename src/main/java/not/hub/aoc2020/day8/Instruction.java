package not.hub.aoc2020.day8;

class Instruction {

    final Operation operation;
    final int value;

    public Instruction(Operation operation, int value) {
        this.operation = operation;
        this.value = value;
    }

    public Instruction copy() {
        return new Instruction(operation, value);
    }

    enum Operation {
        ACC, JMP, NOP
    }

}

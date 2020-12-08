package not.hub.aoc2020.day8;

class Instruction {

    final Operation op;
    final int val;

    public Instruction(Operation op, int val) {
        this.op = op;
        this.val = val;
    }

    public Instruction copy() {
        return new Instruction(op, val);
    }

    enum Operation {
        ACC, JMP, NOP
    }

}

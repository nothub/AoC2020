package not.hub.aoc2020.day8;

class Trackable {

    final Instruction instruction;
    boolean visited;

    public Trackable(Instruction instruction, boolean visited) {
        this.instruction = instruction;
        this.visited = visited;
    }

}

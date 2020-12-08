package not.hub.aoc2020.day8;

class Trackable {

    final Instruction ins;
    boolean visited;

    public Trackable(Instruction ins, boolean visited) {
        this.ins = ins;
        this.visited = visited;
    }

}

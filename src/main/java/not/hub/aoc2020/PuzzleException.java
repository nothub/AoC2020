package not.hub.aoc2020;

import java.util.function.Supplier;

public class PuzzleException extends IllegalStateException {

    public PuzzleException(String s) {
        super(s);
    }

    public PuzzleException(String message, Throwable cause) {
        super(message, cause);
    }

}

package not.hub.aoc.day4;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.HashMap;
import java.util.Map;

public class PassportProcessing1 extends Solver<String, Integer> {

    static final String linebreak = "\\r?\\n|\\r";

    @Override
    public Integer solve(String input) {

        Logger.info("Day 4: Passport Processing - Part 1");

        int numValid = 0;

        for (String raw : input.split("((" + linebreak + ")\\d*)+(" + linebreak + ")")) {

            Map<String, String> passport = new HashMap<>();

            for (String pair : raw.replaceAll(linebreak, " ").split(" ")) {
                String[] data = pair.split(":");
                passport.put(data[0], data[1]);
            }

            if (checkValidity(passport)) {
                numValid++;
            }

        }

        return numValid;

    }

    private boolean checkValidity(Map<String, String> passport) {
        return passport.containsKey("byr")
                && passport.containsKey("iyr")
                && passport.containsKey("eyr")
                && passport.containsKey("hgt")
                && passport.containsKey("hcl")
                && passport.containsKey("ecl")
                && passport.containsKey("pid");
    }

}

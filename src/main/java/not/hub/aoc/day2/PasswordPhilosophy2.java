package not.hub.aoc.day2;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.regex.Matcher;

import static not.hub.aoc.day2.PasswordPhilosophy1.pattern;

public class PasswordPhilosophy2 extends Solver<String, Integer> {

    @Override
    public Integer solve(String input) {

        Logger.info("Day 2: Password Philosophy - Part 2");

        int numValid = 0;

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            char chr = matcher.group(3).charAt(0);
            String pass = matcher.group(4);
            char a = pass.charAt(Integer.parseInt(matcher.group(1)) - 1);
            char b = pass.charAt(Integer.parseInt(matcher.group(2)) - 1);
            if (chr == a || chr == b) {
                if (a != b) {
                    numValid++;
                }
            }
        }

        Logger.info("Result: " + numValid);
        return numValid;

    }

}

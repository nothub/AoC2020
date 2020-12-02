package not.hub.aoc.day2;

import not.hub.aoc.utils.InputParser;
import org.tinylog.Logger;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordPhilosophy2 {

    private static final List<String> input = InputParser.getStringList("inputs/day2");

    private static final Pattern pattern = Pattern.compile("(\\d+)-(\\d+)\\s(\\w): (\\w+)");

    public static void main(String[] args) {

        Logger.info("Day 2: Password Philosophy - Part 2");

        int numValid = 0;

        for (String line : input) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                char chr = matcher.group(3).charAt(0);
                String pass = matcher.group(4);
                char a = pass.charAt(Integer.parseInt(matcher.group(1)) - 1);
                char b = pass.charAt(Integer.parseInt(matcher.group(2)) - 1);
                if (a == chr || b == chr) {
                    if (a != b) {
                        numValid++;
                    }
                }
            }

        }

        Logger.info("Result: " + numValid);

    }

}

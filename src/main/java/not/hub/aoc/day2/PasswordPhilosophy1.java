package not.hub.aoc.day2;

import not.hub.aoc.utils.InputParser;
import org.tinylog.Logger;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordPhilosophy1 {

    private static final List<String> input = InputParser.getStringList("inputs/day2");

    private static final Pattern pattern = Pattern.compile("(\\d+)-(\\d+)\\s(\\w): (\\w+)");

    public static void main(String[] args) {

        Logger.info("Day 2: Password Philosophy - Part 1");

        int numValid = 0;

        for (String line : input) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                String pass = matcher.group(4);
                long count = pass.chars().filter(c -> c == matcher.group(3).charAt(0)).count();
                if (count >= Integer.parseInt(matcher.group(1)) && count <= Integer.parseInt(matcher.group(2))) {
                    numValid++;
                }
            }

        }

        Logger.info("Result: " + numValid);

    }

}

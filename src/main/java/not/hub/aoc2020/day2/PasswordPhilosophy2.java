package not.hub.aoc2020.day2;

import not.hub.aoc2020.Solver;

import static not.hub.aoc2020.day2.PasswordPhilosophy1.pattern;

public class PasswordPhilosophy2 extends Solver<String, Integer> {

    @Override
    public Integer solve(String input) {

        var numValid = 0;

        var matcher = pattern.matcher(input);
        while (matcher.find()) {
            var chr = matcher.group(3).charAt(0);
            var pass = matcher.group(4);
            if (chr == pass.charAt(Integer.parseInt(matcher.group(1)) - 1) ^ chr == pass.charAt(Integer.parseInt(matcher.group(2)) - 1)) {
                numValid++;
            }
        }

        return numValid;

    }

}

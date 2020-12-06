package not.hub.aoc2020.day4;

import not.hub.aoc2020.Solver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static not.hub.aoc2020.Globals.LINESEPRE;

public class PassportProcessing1 extends Solver<String, Integer> {

    protected static List<Map<String, String>> parsePassports(String input) {
        List<Map<String, String>> passports = new ArrayList<>();
        for (var raw : input.split("((" + LINESEPRE + ")\\d*)+(" + LINESEPRE + ")")) {
            Map<String, String> passport = new HashMap<>();
            for (var pair : raw.replaceAll(LINESEPRE, " ").split(" ")) {
                var data = pair.split(":");
                passport.put(data[0], data[1]);
            }
            passports.add(passport);
        }
        return passports;
    }

    @Override
    public Integer solve(String input) {
        return (int) parsePassports(input).stream().filter(this::checkValidity).count();
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

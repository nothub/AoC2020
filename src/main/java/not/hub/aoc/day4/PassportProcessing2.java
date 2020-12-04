package not.hub.aoc.day4;

import not.hub.aoc.Solver;
import org.tinylog.Logger;

import java.util.Map;

import static not.hub.aoc.day4.PassportProcessing1.parsePassports;

public class PassportProcessing2 extends Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        Logger.info("Day 4: Passport Processing - Part 2");
        int passports = (int) parsePassports(input).stream().filter(this::checkValidity).count();
        Logger.info("Result: " + passports);
        return passports;
    }

    private boolean checkValidity(Map<String, String> passport) {

        try {

            // byr (Birth Year) - four digits; at least 1920 and at most 2002.
            int byr = Integer.parseInt(passport.get("byr"));
            if (byr < 1920 || byr > 2002) {
                return false;
            }

            // iyr (Issue Year) - four digits; at least 2010 and at most 2020.
            int iyr = Integer.parseInt(passport.get("iyr"));
            if (iyr < 2010 || iyr > 2020) {
                return false;
            }

            // eyr (Expiration Year) - four digits; at least 2020 and at most 2030.
            int eyr = Integer.parseInt(passport.get("eyr"));
            if (eyr < 2020 || eyr > 2030) {
                return false;
            }

            // hgt (Height) - a number followed by either cm or in:
            //    If cm, the number must be at least 150 and at most 193.
            //    If in, the number must be at least 59 and at most 76.
            String hgtRaw = passport.get("hgt");
            if (hgtRaw.length() < 4 || hgtRaw.length() > 5) {
                return false;
            }
            int hgt = Integer.parseInt(hgtRaw.substring(0, hgtRaw.length() - 2));
            if (hgtRaw.endsWith("cm")) {
                if (hgt < 150 || hgt > 193) {
                    return false;
                }
            } else if (hgtRaw.endsWith("in")) {
                if (hgt < 59 || hgt > 76) {
                    return false;
                }
            } else {
                return false;
            }

            // hcl (Hair Color) - a # followed by exactly six characters 0-9 or a-f.
            String hcl = passport.get("hcl");
            if (hcl.replaceAll("#[0-9a-f]{6}", "").length() > 0) {
                return false;
            }

            // ecl (Eye Color) - exactly one of: amb blu brn gry grn hzl oth.
            String ecl = passport.get("ecl");
            if (!(ecl.equals("amb") || ecl.equals("blu") || ecl.equals("brn") || ecl.equals("gry") || ecl.equals("grn") || ecl.equals("hzl") || ecl.equals("oth"))) {
                return false;
            }

            // pid (Passport ID) - a nine-digit number, including leading zeroes.
            String pid = passport.get("pid");
            if (pid.replaceAll("[0-9]{9}", "").length() > 0) {
                return false;
            }

        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }

        return true;

    }

}

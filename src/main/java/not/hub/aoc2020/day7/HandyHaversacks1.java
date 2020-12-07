package not.hub.aoc2020.day7;

import not.hub.aoc2020.Solver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static not.hub.aoc2020.Globals.LB;

public class HandyHaversacks1 extends Solver<String, Long> {

    protected static final Pattern pattern = Pattern.compile("^(.+) contain (.+)\\.$", Pattern.MULTILINE);
    protected static final String shiny_gold = "shiny gold bag";
    protected static final String empty = "no other bag";

    protected static boolean containsGold(String bag, Map<String, Map<String, Integer>> bags) {
        return bag.equals(shiny_gold) || bags.get(bag).entrySet().stream().anyMatch(inner ->
                containsGold(inner.getKey(), bags));
    }

    protected static Map<String, Map<String, Integer>> parse(String input) {
        Map<String, Map<String, Integer>> bags = new HashMap<>();
        Arrays.stream(input.replaceAll("bags", "bag").split(LB)).forEach(raw -> {
            Matcher matcher = pattern.matcher(raw);
            while (matcher.find()) {
                String name = matcher.group(1);
                if (!bags.containsKey(name)) {
                    bags.put(name, new HashMap<>());
                }
                Set.of(matcher.group(2).split(", ")).forEach(rule -> {
                    if (!rule.equals(empty)) {
                        bags.get(name).put(rule.substring(2), Integer.parseInt(rule.substring(0, 1)));
                    }
                });
            }
        });
        return bags;
    }

    @Override
    public Long solve(String input) {
        var bags = parse(input);
        return bags.keySet().stream().filter(name ->
                !name.equals(shiny_gold)
        ).filter(name -> containsGold(name, bags)).count();
    }

}

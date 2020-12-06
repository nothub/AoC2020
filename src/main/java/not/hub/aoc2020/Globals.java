package not.hub.aoc2020;

import java.util.function.IntPredicate;
import java.util.regex.Pattern;

public class Globals {

    public static final String LB = "\\r?\\n|\\r";
    public static final String LB_SECT = "\\r?\\n{2,}|\\r{2,}";
    public static final IntPredicate LB_PRED = c -> Pattern.compile(LB).matcher(Character.toString(c)).matches();
    public static final IntPredicate LB_SECT_PRED = c -> Pattern.compile(LB_SECT).matcher(Character.toString(c)).matches();

}

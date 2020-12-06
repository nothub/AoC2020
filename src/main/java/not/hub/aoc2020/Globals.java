package not.hub.aoc2020;

import java.util.function.IntPredicate;
import java.util.regex.Pattern;

public interface Globals {

    String LB = "\\r?\\n|\\r";
    String LB_MULTI = "\\r?\\n{2,}|\\r{2,}";
    Pattern LB_PAT = Pattern.compile(LB);
    IntPredicate LB_PRED = c -> LB_PAT.matcher(Character.toString(c)).matches();

}

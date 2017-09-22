import java.util.regex.Pattern;

/**
 * Created by trankhai on 9/22/17.
 */
public class BinaryRegexp {
    public static Pattern multipleOf3() {
        return Pattern.compile("(1(01*0)*1|0)*");
    }

}

import java.util.Arrays;

/**
 * Created by trankhai on 9/12/17.
 */
public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(i -> isInArray(array2, i))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }

    private static boolean isInArray(String[] array, String compareStr){
        for (String str :array) {
            if (str.indexOf(compareStr) >= 0)
                return true;
        }
        return false;
    }
}

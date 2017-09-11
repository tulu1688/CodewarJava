/**
 * Created by trankhai on 9/11/17.
 */
public class DuplicateEncoder {
    static String encode(final String word){
        String lowerWord = word.toLowerCase();
        return lowerWord.chars()
                .mapToObj(ch -> (char) ch)
                .map(ch -> isMultipleOccur(lowerWord, ch) ? ')' : '(')
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    static boolean isMultipleOccur(String str, int c) {
        int firstOccurs = str.indexOf(c);
        if (firstOccurs < 0)
            return false;
        return str.indexOf(c, firstOccurs + 1) >= 0;
    }
}

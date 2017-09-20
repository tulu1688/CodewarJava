import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by trankhai on 9/20/17.
 */
public class RomanNumeralsEncoderTest {
    private RomanNumeralsEncoder conversion = new RomanNumeralsEncoder();

    @Test
    public void shouldCovertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.convert(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.convert(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.convert(6));
    }
}

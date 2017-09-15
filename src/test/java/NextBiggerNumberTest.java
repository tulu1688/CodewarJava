import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class NextBiggerNumberTest {
    @Test
    public void basicTests() {
        assertEquals(21, NextBiggerNumber.nextBiggerNumber(12));
        assertEquals(531, NextBiggerNumber.nextBiggerNumber(513));
        assertEquals(2071, NextBiggerNumber.nextBiggerNumber(2017));
        assertEquals(441, NextBiggerNumber.nextBiggerNumber(414));
        assertEquals(414, NextBiggerNumber.nextBiggerNumber(144));
    }
}

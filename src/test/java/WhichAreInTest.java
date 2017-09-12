import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by trankhai on 9/12/17.
 */
public class WhichAreInTest {
    @Test
    public void test1() {
        String a[] = new String[]{ "live", "arp", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}

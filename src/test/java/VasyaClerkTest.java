import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by trankhai on 9/13/17.
 */
public class VasyaClerkTest {
    @Test
    public void TestVasyaClerk(){
        assertEquals("YES",VasyaClerk.tickets(new int[] {25, 25, 50}));
        assertEquals("NO",VasyaClerk.tickets(new int []{25, 100}));
    }
}

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by trankhai on 9/15/17.
 */
public class FindTheSmallestTest {
    private static void testing(long n, String res) {
        assertEquals(res,
                Arrays.toString(FindTheSmallest.smallest(n)));
    }
    @Test
    public void test() {
        System.out.println("Basic Tests smallest");
        testing(261235, "[126235, 2, 0]");
        testing(209917, "[29917, 0, 1]");
        testing(285365, "[238565, 3, 1]");
        testing(296837, "[239687, 4, 1]");
    }
}

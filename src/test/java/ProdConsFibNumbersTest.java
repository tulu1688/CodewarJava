import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

/**
 * Created by trankhai on 9/15/17.
 */
public class ProdConsFibNumbersTest {
    @Test
    public void test1() {
        long[] r = new long[] {55, 89, 1};
        assertArrayEquals(r, ProdConsFibNumbers.productFib(4895));
    }
    @Test
    public void test2() {
        long[] r = new long[] {89, 144, 0};
        assertArrayEquals(r, ProdConsFibNumbers.productFib(5895));
    }
}

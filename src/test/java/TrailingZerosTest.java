import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by trankhai on 9/11/17.
 */
public class TrailingZerosTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(TrailingZeros.zeros(0), is(0));
        assertThat(TrailingZeros.zeros(6), is(1));
        assertThat(TrailingZeros.zeros(14), is(2));
    }
}

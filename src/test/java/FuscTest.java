import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by trankhai on 9/15/17.
 */
public class FuscTest {
    @Test
    public void testFusc() {
        Assert.assertEquals(0, Fusc.fusc(0));
        Assert.assertEquals(1, Fusc.fusc(1));
        Assert.assertEquals(21, Fusc.fusc(85));
    }

    @Test
    public void testBigIntegerFusc()
    {
        BigInteger twoPThous = BigInteger.valueOf(2).pow(1000);
        Assert.assertEquals(BigInteger.ZERO, Fusc.fusc(BigInteger.ZERO));
        Assert.assertEquals(BigInteger.ONE, Fusc.fusc(BigInteger.ONE));
        Assert.assertEquals(BigInteger.valueOf(1001), Fusc.fusc(twoPThous.add(BigInteger.ONE)));
        Assert.assertEquals(BigInteger.valueOf(1000), Fusc.fusc(twoPThous.subtract(BigInteger.ONE)));
        Assert.assertEquals(BigInteger.valueOf(2996), Fusc.fusc(twoPThous.add(BigInteger.valueOf(5))));
        Assert.assertEquals(BigInteger.valueOf(7973), Fusc.fusc(twoPThous.add(BigInteger.valueOf(21))));
    }

    @Test
    public void testFindExponential(){
        Assert.assertEquals(6, Fusc.findExponential(BigInteger.valueOf(64)));
        Assert.assertEquals(6, Fusc.findExponential(BigInteger.valueOf(65)));
        Assert.assertEquals(5, Fusc.findExponential(BigInteger.valueOf(63)));
    }
}

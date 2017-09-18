import java.math.BigInteger;

/**
 * Created by trankhai on 9/15/17.
 */
public class Fusc {
    public static int fusc(int n) {
        if (n <= 1)
            return n;
        if (n % 2 == 0)
            return fusc(n/2);
        else
            return fusc(n/2) + fusc(n/2 + 1);
    }

    public static BigInteger fusc(BigInteger n) {
        if (n.equals(BigInteger.ONE))
            return BigInteger.ONE;
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ZERO;

        int exp = (int)(Math.log(n.doubleValue()) / Math.log(2));
        BigInteger twoExp = BigInteger.valueOf(2).pow(exp);
        if (n.equals(twoExp))
            return BigInteger.ONE;
        if (n.equals(twoExp.add(BigInteger.ONE)))
            return BigInteger.ONE.add(BigInteger.valueOf(exp));
        if (n.equals(twoExp.subtract(BigInteger.ONE)))
            return BigInteger.valueOf(exp);

        BigInteger[] bigIntegers = n.divideAndRemainder(BigInteger.valueOf(2));
        if (bigIntegers[1].equals(BigInteger.ZERO))
            return fusc(bigIntegers[0]);
        else
            return fusc(bigIntegers[0]).add(fusc(bigIntegers[0].add(BigInteger.ONE)));
    }

    public static int findExponential(BigInteger n){
        return (int) Math.floor(Math.log(n.doubleValue()) / Math.log(2));
    }
}

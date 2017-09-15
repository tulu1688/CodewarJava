import java.util.ArrayList;
import java.util.List;

/**
 * Created by trankhai on 9/13/17.
 */
public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        long max = m > n ? m : n;
        long min = m > n ? n : m;

        if (m<=0 || n <= 0)
            return null;

        List<Long> primeList = new ArrayList<>();
        primeList.add(2L);
        long lastPrime = 2;

        for (long i = 3; i<=max; i++) {
            boolean isPrime = true;

            for (Long prime : primeList) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (lastPrime >= min && i - lastPrime == g) {
                    return new long[] {lastPrime, i};
                }

                primeList.add(i);
                lastPrime = i;
            }
        }

        return null;
    }
}

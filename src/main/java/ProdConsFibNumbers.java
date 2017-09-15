/**
 * Created by trankhai on 9/15/17.
 */
public class ProdConsFibNumbers {
    public static long[] productFib(long prod) {
        long lowLastFib = 0L;
        long hiLastFib = 1L;

        while (lowLastFib * hiLastFib < prod) {
            long nexFib = lowLastFib + hiLastFib;

            lowLastFib = hiLastFib;
            hiLastFib = nexFib;

            if (lowLastFib * hiLastFib == prod) {
                return new long[] {lowLastFib, hiLastFib, 1};
            }
        }

        return new long[] {lowLastFib, hiLastFib, 0};
    }
}

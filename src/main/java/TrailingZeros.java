/**
 * Created by trankhai on 9/11/17.
 */
public class TrailingZeros {
    public static int zeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }
        return res;
    }
}

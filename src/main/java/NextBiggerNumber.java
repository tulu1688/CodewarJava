import java.util.ArrayList;
import java.util.List;

public class NextBiggerNumber {
    public static long nextBiggerNumber(long n) {
        List<Integer> digits = new ArrayList<Integer>();

        long m = n;
        while (m > 0) {
            digits.add((int) (m % 10));
            m /= 10;
        }

        boolean gotNextNumber = false;
        for (int k = 1; k < digits.size(); k++) {
            // Find min swapable digit
            int min = 10;
            int minIndex = -1;
            for (int i=0;i<k;i++){
                if (digits.get(i) > digits.get(k)) {
                    if (digits.get(i) < min) {
                        min = digits.get(i);
                        minIndex = i;
                    }
                }

                if (min != 10) {
                    int tmp = digits.get(k);
                    digits.set(k, min);
                    digits.set(minIndex,tmp);
                    gotNextNumber = true;
                    break;
                }
            }
        }

        if (gotNextNumber) {
            long ret = 0;
            for (int i=digits.size()-1;i>=0;i--){
                ret = ret * 10 + digits.get(i);
            }
            return ret;
        } else {
            return -1;
        }
    }
}

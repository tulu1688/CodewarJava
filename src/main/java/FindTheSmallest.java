import java.util.ArrayList;
import java.util.List;

/**
 * Created by trankhai on 9/15/17.
 */
public class FindTheSmallest {
    public static long[] smallest(long n) {
        List<Integer> digits = new ArrayList<>();

        while (n>0){
            int digit = (int) (n%10);
            digits.add(0,digit);
            n /= 10;
        }

        int[] indexes = smallestIndex(digits, 0);
        if (indexes == null)
            return null;
        else {
            long ret = 0;

            if (indexes[0] > indexes[1])
                digits.add(indexes[1], digits.remove(indexes[0]));
            else
                digits.add(indexes[0], digits.remove(indexes[1]));

            for (int i=0;i<digits.size();i++){
                ret = ret * 10 + digits.get(i);
            }

            return new long[]{ret, indexes[0], indexes[1]};
        }
    }

    private static int[] smallestIndex(List<Integer> digits, int startIndex) {
        List<Integer> subList = digits.subList(startIndex, digits.size());
        if (digits.size() == 1)
            return null;

        int minVal = subList.stream().mapToInt(Integer::intValue).min().getAsInt();
        int index = subList.indexOf(new Integer(minVal));
        while (index < subList.size() && minVal == subList.get(index + 1))
            index ++;

        if (index == 0) {
            return smallestIndex(digits, startIndex + 1);
        } else {
            if (minVal == 0 && startIndex == 0) {
                return new int[] {startIndex, index + startIndex};
            }
            return new int[]{index + startIndex, startIndex};
        }
    }
}

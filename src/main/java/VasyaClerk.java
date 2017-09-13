import java.util.ArrayList;
import java.util.List;

/**
 * Created by trankhai on 9/13/17.
 */
public class VasyaClerk {
    public static String tickets(int[] peopleInLine) {
        List<Integer> cashList = new ArrayList<>();
        for (int cash : peopleInLine) {
            cashList.add(cash);

            if (cash == 50) {
                if (payBackable(cashList, 25) > 0)
                    cashList.remove(new Integer(25));
                else return "NO";
            } else if (cash == 100) {
                if (payBackable(cashList, 50) > 0 && payBackable(cashList, 25) > 0) {
                    cashList.remove(new Integer(25));
                    cashList.remove(new Integer(50));
                } else if (payBackable(cashList, 25) > 2) {
                    for (int j = 0; j < 3; j++)
                        cashList.remove(new Integer(25));
                } else {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    private static long payBackable(List<Integer> cashList, int value) {
        return cashList.stream().filter(i -> i == value).count();
    }
}

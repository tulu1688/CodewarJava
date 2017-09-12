import java.util.ArrayList;
import java.util.List;

/**
 * Created by trankhai on 9/11/17.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] lst = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> testList = new ArrayList<>();
        for (Integer i : lst)
            testList.add(i);

        List<Integer> josephus = Josephus.josephusPermutation(testList, 3);
        josephus.stream().forEach(i -> System.out.println(i));

    }
}

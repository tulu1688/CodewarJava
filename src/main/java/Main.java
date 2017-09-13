import java.util.ArrayList;
import java.util.List;

/**
 * Created by trankhai on 9/11/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(25);
        list.add(50);
        list.add(25);
        list.add(50);
        list.add(100);

        list.remove(new Integer(50));

        list.stream().forEach(i -> System.out.println(i));
    }
}

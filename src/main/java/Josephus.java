import java.util.ArrayList;
import java.util.List;

/**
 * Created by trankhai on 9/12/17.
 */
public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        int i=0;
        List<T> ret = new ArrayList<T>();

        while(!items.isEmpty()){
            T item = null;
            int len = items.size();

            if (i+k < len) {
                item = items.remove(i + k - 1);
                i = i+k-1;
            } else {
                item = items.remove((i + k - 1) % len);
                i = (i + k - 1) % len;
            }

            ret.add(item);
        }

        return ret;
    }
}

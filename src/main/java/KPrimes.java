import java.util.ArrayList;
import java.util.List;

/**
 * Created by trankhai on 9/13/17.
 */
public class KPrimes {
    // TODO Ignore this kata. Too hard to understand

    public static long[] countKprimes(int k, long start, long end) {
        List<Long> primeList = getPrimeList(end);

        List<ArrayList<Long>> groupList = new ArrayList<>();
        for (int i=0;i<k;i++) {
            if (i==0) {
                for (Long p : primeList) {
                    ArrayList<Long> group = new ArrayList<Long>();
                    group.add(p);
                    groupList.add(group);
                }
            } else {
                List<ArrayList<Long>> oldList = groupList;
                List<ArrayList<Long>> newList = new ArrayList<>();

                for (Long p : primeList) {
                    for (ArrayList<Long> g : oldList) {
                        if (!g.contains(p) && (p > g.get(g.size() - 1))) {
                            ArrayList<Long> group = new ArrayList<Long>(g);
                            group.add(p);
                            newList.add(group);
                        }
                    }
                    groupList = newList;
                }
            }
        }

        ArrayList<Long> kPrimeList = new ArrayList<>();
        for (ArrayList<Long> group : groupList)
            kPrimeList.add(group.stream().mapToLong(Long::longValue).sum());

        kPrimeList.stream().filter(i -> i <= end && i >= start).mapToLong(l->l).sorted().distinct().forEach(i -> System.out.println(i));

        return kPrimeList.stream().filter(i -> i <= end && i >= start).mapToLong(l->l).distinct().toArray();
    }

//    public int puzzle(int s) {
//        // your code
//    }

//    private static boolean isKprime(long n, List<Long> primeList, int k){
//        if (k==1) {
//            return primeList.indexOf(n) > -1;
//        } else {
//            for (int i=0;i<primeList.size();i++) {
//                List<>
//
//                if ()
//            }
//        }
//    }

    public static List<Long> getPrimeList(long n){
        List<Long> primeList = new ArrayList<>();
        primeList.add(2L);

        for (long i = 3; i<=n; i++) {
            boolean isPrime = true;

            for (Long prime : primeList) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeList.add(i);
            }
        }

        return primeList;
    }
}

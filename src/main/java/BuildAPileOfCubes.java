/**
 * Created by trankhai on 9/12/17.
 */
public class BuildAPileOfCubes {
    // 1^3+2^3+…+n^3 = (1+2+…+n)^2
    public static long findNb(long m) {
        long sqrtM = (long) Math.sqrt(m);
        if (sqrtM * sqrtM != m)
            return -1;

        long sqrtK = (long) Math.floor(Math.sqrt(sqrtM*2));
        if (sqrtK * (sqrtK+1) != sqrtM * 2)
            return -1;

        return sqrtK;
    }
}

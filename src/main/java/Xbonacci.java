public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        if (n<= 0)
            return new double[0];

        double ret[] = new double[n];
        for (int i=0;i<n;i++) {
            ret[i] = (i < 3) ? s[i] : (ret[i-1] + ret[i-2] + ret[i-3]);
        }

        return ret;
    }
}
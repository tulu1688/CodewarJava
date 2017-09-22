/**
 * Created by trankhai on 9/21/17.
 */
public class LongestCommonSubsequence {
    public static String lcs(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            return "";

        int n = a.length();
        int m = b.length();
        int[][] mem = new int[n][m];

        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                mem[i][j] = -1;

        // Compute lsc length and set to mem
        lsc_len(a,b,0,0,mem);

        String ret = "";
        int i=0;
        int j=0;
        while (i<n && j<m) {
            if (a.charAt(i) == b.charAt(j)) {
                ret = ret + a.charAt(i);
                j++;
                i++;
            } else if (i+1 < n && j+1<m) {
                if (mem[i][j+1] >= mem[i+1][j]) {
                    j++;
                }
                else i++;
            } else if (i+1 == n-1 && j+1 <m){
                j++;
            } else if (i+1<n && j+1==m) {
                i++;
            } else break;
        }

        return ret;
    }

    private static int lsc_len(String a,String b, int i, int j, final int[][] memory){
        if (i >= a.length() || j >= b.length())
            return 0;

        if (memory[i][j] < 0) {
            if (a.charAt(i) == b.charAt(j))
                memory[i][j] = 1 + lsc_len(a, b, i + 1, j + 1, memory);
            else
                memory[i][j] = Math.max(
                        lsc_len(a, b, i, j + 1, memory),
                        lsc_len(a, b, i + 1, j, memory));
        }
        return memory[i][j];
    }
}

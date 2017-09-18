import java.math.BigInteger;

/**
 * Created by trankhai on 9/11/17.
 */
public class Main {
    static int[][] sudoku = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
    };

    public static void main(String[] args) {
        BuildAPileOfCubes.findNb(1000);
        DuplicateEncoder.encode("  sdllwwwffeekksf");
        FindTheSmallest.smallest(1245);
        GapInPrimes.gap(5,1000,5000);
        VasyaClerk.tickets(new int[]{25,25,50,50,100,25});
        TrailingZeros.zeros(1000);
        ProdConsFibNumbers.productFib(4895);
        ValidBraces.isValid("()");
        SudokuValidator.check(sudoku);
        Fusc.fusc(BigInteger.valueOf(2).pow(1000));
        Runes.isValidExpression("-1--2=1");
    }
}

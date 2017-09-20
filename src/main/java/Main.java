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

    static int[][] board   = new int[][] {new int[] {3, 0, 1},
            new int[] {3, 0, 1},
            new int[] {0, 2, 1},
            new int[] {0, 2, 0}};
    static int[][] attacks = new int[][] {new int[] {2,1},new int[] {2,2},new int[] {3,2},new int[] {3,3}};

    static int[][] pyramid = new int[][]{{75},
            {95, 64},
            {17, 47, 82},
            {18, 35, 87, 10},
            {20, 4, 82, 47, 65},
            {19, 1, 23, 75, 3, 34},
            {88, 2, 77, 73, 7, 63, 67},
            {99, 65, 4, 28, 6, 16, 70, 92},
            {41, 41, 26, 56, 83, 40, 80, 70, 33},
            {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
            {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
            {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
            {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
            {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
            {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23},
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
        BattleShips.damagedOrSunk(board, attacks);
        LongestSlideDown.longestSlideDown(pyramid);
        RomanNumeralsEncoder.convert(2000);
    }
}

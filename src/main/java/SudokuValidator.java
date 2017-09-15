import java.util.Arrays;
import java.util.stream.IntStream;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        System.out.println(sudoku[8].length);
        // Vertical check
        for (int i=0;i<9;i++)
            if (!isValidSudokuArray(sudoku[i]))
                return false;
        // Horizontal check
        for (int i=0;i<9;i++){
            int[] ar = new int[9];
            for (int j=0;j<9;j++)
                ar[j] = sudoku[j][i];
            if(!isValidSudokuArray(ar))
                return false;
        }
        // Small square check
        for (int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                int[] ar = new int[9];
                for (int si=0;si<3;si++)
                    for (int sj=0;sj<3;sj++)
                        ar[si*3+sj]=sudoku[i*3+si][j*3+sj];
                if (!isValidSudokuArray(ar))
                    return false;
            }
        return true;
    }

    private static boolean isValidSudokuArray(int[] array){
        if (array.length != 9)
            return false;

        IntStream stream = Arrays.stream(array);
        return stream.distinct().filter(i -> i<=9 && i>=1).count() == 9;
    }
}

/**
 * Created by trankhai on 9/20/17.
 */
public class RomanNumeralsEncoder {
    public static String convert(int n) {
        String[][] symbols = new String[][]{{"I","V","X"},{"X","L","C"},{"C","D","M"},{"M","?","?"}};
        String result = "";

        int symbolGrade = 0;
        while (n>0) {
            if (symbolGrade > 3)
                return "";
            int d = n % 10;

            switch (d) {
                // case 0: result = symbols[symbolGrade][2] + result;break;
                case 1: result = symbols[symbolGrade][0] + result;break;
                case 2: result = symbols[symbolGrade][0] + symbols[symbolGrade][0] + result;break;
                case 3: result = symbols[symbolGrade][0] + symbols[symbolGrade][0] + symbols[symbolGrade][0] + result;break;
                case 4: result = symbols[symbolGrade][0] + symbols[symbolGrade][1] + result;break;
                case 5: result = symbols[symbolGrade][1] + result;break;
                case 6: result = symbols[symbolGrade][1] + symbols[symbolGrade][0] + result;break;
                case 7: result = symbols[symbolGrade][1] + symbols[symbolGrade][0] + symbols[symbolGrade][0] + result;break;
                case 8: result = symbols[symbolGrade][1] + symbols[symbolGrade][0] + symbols[symbolGrade][0] + symbols[symbolGrade][0] + result;break;
                case 9: result = symbols[symbolGrade][0] + symbols[symbolGrade][2] + result;break;
            }

            symbolGrade ++;
            n/=10;
        }

        return result;
    }
}

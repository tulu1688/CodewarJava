import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by trankhai on 9/20/17.
 */
public class RPNCalculator {
    public static double evaluate(String expr) {
        String[] parts = expr.split("\\s");
        List<String> numberOperatorList = new ArrayList<>(Arrays.asList(parts));

        if (numberOperatorList.isEmpty())
            return 0.0;
        if (numberOperatorList.get(0).length() == 0)
            return 0.0;

        while (findFirstOperator(numberOperatorList) >= 0){
            int index = findFirstOperator(numberOperatorList) - 2;
            double d1 = Double.parseDouble(numberOperatorList.remove(index));
            double d2 = Double.parseDouble(numberOperatorList.remove(index));
            String op = numberOperatorList.remove(index);
            if (op.equals("+")){
                numberOperatorList.add(index, "" + (d1 + d2));
            } else if (op.equals("-")) {
                numberOperatorList.add(index, "" + (d1 - d2));
            } else if (op.equals("*")) {
                numberOperatorList.add(index, "" + (d1 * d2));
            } else if (op.equals("/")) {
                numberOperatorList.add(index, "" + (d1 / d2));
            }
        }
        return Double.parseDouble(numberOperatorList.get(numberOperatorList.size()-1));
    }

    private static int findFirstOperator(List<String> strs){
        List<Integer> indexes = new ArrayList<>();
        if (strs.indexOf("+") > -1)
            indexes.add(strs.indexOf("+"));
        if (strs.indexOf("-") > -1)
            indexes.add(strs.indexOf("-"));
        if (strs.indexOf("*") > -1)
            indexes.add(strs.indexOf("*"));
        if (strs.indexOf("/") > -1)
            indexes.add(strs.indexOf("/"));

        if (indexes.isEmpty())
            return -1;
        return indexes.stream().mapToInt(Integer::intValue).min().getAsInt();
    }
}

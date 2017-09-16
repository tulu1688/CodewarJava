public class Runes {
    public static int solveExpression( final String expression ) {
        for (int i=0;i<10;i++){
            if (expression.indexOf("" + i)>=0)
                continue;
            String testExpression = expression.replaceAll("\\?","" + i);
            if (isValidExpression(testExpression))
                return i;
        }

        return -1;
    }

    public static boolean isValidExpression(String expression){
        String parts[] = expression.split("=");
        String leftExp = parts[0];

        if (parts[1].length() > 1 && parts[1].charAt(0) == '0')
            return false;

        long rightVal = Long.parseLong(parts[1]);
        int index;

        if ((index = leftExp.indexOf('*')) > 0) {
            long firstNumber = Long.parseLong(leftExp.substring(0,index));
            long secondNumber = Long.parseLong(leftExp.substring(index + 1));
            return firstNumber * secondNumber == rightVal;
        } else if ((index = leftExp.indexOf('+')) > 0) {
            long firstNumber = Long.parseLong(leftExp.substring(0,index));
            long secondNumber = Long.parseLong(leftExp.substring(index + 1));
            return firstNumber + secondNumber == rightVal;
        } else {
            if (leftExp.indexOf('-') == 0) {
                index = leftExp.indexOf('-', 1);
            } else {
                index = leftExp.indexOf('-');
            }
            long firstNumber = Long.parseLong(leftExp.substring(0,index));
            long secondNumber = Long.parseLong(leftExp.substring(index + 1));
            return firstNumber - secondNumber == rightVal;
        }
    }
}

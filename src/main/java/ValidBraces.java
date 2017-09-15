import java.util.Stack;

/**
 * Created by trankhai on 9/15/17.
 */
public class ValidBraces {
    public static boolean isValid(String braces) {
        Stack<Integer> stack = new Stack<>();

        braces.chars().forEach(i -> {
            if (i=='{' || i == '[' || i == '(')
                stack.push(i);
            else if (!stack.isEmpty() &&
                    ((stack.peek() == '{' && i == '}') ||
                    (stack.peek() == '[' && i == ']') ||
                    (stack.peek() == '(' && i == ')')))
                stack.pop();
            else
                stack.push(i);
        });

        return stack.isEmpty();
    }
}

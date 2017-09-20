## [Reverse polish notation calculator](http://www.codewars.com/kata/reverse-polish-notation-calculator/java)

Your job is to create a calculator which evaluates expressions in [Reverse Polish notation](http://en.wikipedia.org/wiki/Reverse_Polish_notation).

For example expression `5 1 2 + 4 * + 3 -` (which is equivalent to `5 + ((1 + 2) * 4) - 3` in normal notation) should evaluate to `14`.

Note that for simplicity you may assume that there are always spaces between numbers and operations, e.g. `1 3 +` expression is valid, but `1 3+` isn't.

Empty expression should evaluate to `0`.

Valid operations are `+`, `-`, `*`, `/`.

You may assume that there won't be exceptional situations (like stack underflow or division by zero).

## Best code
``` 
import java.util.Stack;

public class Calc {

  public double evaluate(String expr) {
    if (expr.equals("")) {
      return 0;
    }
  
    Stack<Double> stack = new Stack<Double>();
    String[] atoms = expr.split(" ");
    
    for (String atom: atoms) {
      Double a, b;
      switch (atom) {
        case "+": stack.push(stack.pop() + stack.pop()); break;
        case "-": b = stack.pop(); a = stack.pop(); stack.push(a - b); break;
        case "*": stack.push(stack.pop() * stack.pop()); break;
        case "/": b = stack.pop(); a = stack.pop(); stack.push(a / b); break;
        default:
          stack.push(Double.parseDouble(atom));
      }
    }
    
    return stack.pop();
  }
}
```
package recursive;
/**
 * Write a method that determines if a given mathematical expression (stored in a String) 
 * has balanced parenthesis. For example “(a+b*(4+(9/c)))” is balanced 
 * but “a)(b” and “((9+3)” are not.
 */
public class BalancedParenthesis {

    public boolean isBalanced(String expression) {
        return isValid(expression, 0, 0);

    }

    private boolean isValid(String expression, int index, int count) {
        if (index >= expression.length()) {
            return count == 0;
        }
        char ch = expression.charAt(index);
        if (ch == '(') {
            return isValid(expression, index+1, count+1);
        } else if (ch == ')') {
            if (count == 0) {
                return false;
            }
            return isValid(expression, index+1, count-1);
        } else {
            return isValid(expression, index+1, count);
        }
    }
    
}
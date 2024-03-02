package recursive;

/**
 * A function to test if a string has any number of 'a's followed by
 * any number of 'b's
 * For example: "aaaab" "bbb" "aa" are valid
 * "bbbba" "abab" "abbba" are invalid
 */
public class StringPattern {

    public boolean checkString(String expression) {
        return checkHelp(expression, 0, false);
    }

    private boolean checkHelp(String expression, int index, boolean hasB) {
        if (index >= expression.length()) {
            return true;
        }
        char ch = expression.charAt(index);
        if (hasB && ch == 'a') {
            return false;
        } else if (ch == 'b') {
            hasB = true;
        }
        return checkHelp(expression, index+1, hasB); 
    }
    
}

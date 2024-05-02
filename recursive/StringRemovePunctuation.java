package recursive;

/**
 * Given a string, return a new one that does not include punctuation
 */
public class StringRemovePunctuation {

    public String remove(String expression) {
        return removeHelp(expression, 0);

    }

    private String removeHelp(String expression, int index) {
        if (index >= expression.length()) {
            return "";
        }
        char ch = expression.charAt(index);
        if (ch == '.' || ch == ',' || ch == '?' || ch == ' ' || ch == '!') {
            return removeHelp(expression, index+1);
        }
        return ch + removeHelp(expression, index+1);
    }
    
}
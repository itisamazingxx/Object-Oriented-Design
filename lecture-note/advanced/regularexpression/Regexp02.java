package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp02 {

    public static void main(String[] args) {
        String content = "abc($abc(abc(";
        Pattern pattern = Pattern.compile("\\(");
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
    
}

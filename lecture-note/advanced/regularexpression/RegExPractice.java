package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPractice {

    public static void main(String[] args) {
        // Works for ‘abbb’, ‘acabbac’, ‘a’, ‘ac’, but not ‘bbb’, ‘cabbac’, ‘b’, ‘bc’, ‘c’, ‘cb’, nor ‘’
        Pattern pattern = Pattern.compile("a.*");
        Matcher matcher = pattern.matcher("cabbac");

        // Works for a String that contains exactly 10000 continuous ‘ab’s
        Pattern pattern2 = Pattern.compile("(ab){10000}");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("ab");
        }
        String content2 = sb.toString();
        Matcher matcher2 = pattern2.matcher(content2);

        // Works for a String that contains only numeric values
        Pattern pattern3 = Pattern.compile("^[0-9]+$");
        Matcher matcher3 = pattern3.matcher("12345");

        boolean matchesFound = matcher3.matches(); // 检查整个字符串是否符合某个格式

        if (matchesFound) {
            System.out.println("Matches found");
        } else {
            System.out.println("Matches not found");
        }
    }

}



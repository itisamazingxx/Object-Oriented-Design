import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的应用实例
 */
public class Regexp_ {
    public static void main(String[] args) {
        Postnum example1 = new Postnum();
        example1.validPostnum();
    }
}

class Postnum {

    public void validPostnum() {
        // 是否以1-9开头的6位数邮政编码
        // String content = "123456";
        // String regStr = "^[1-9]{6}$"; // "^[1-9]\\d{5}$"

        // 以1-9开头的5-10位数
        // String content = "123456";
        // String regStr = "^[1-9]\\d{4,9}$";

        // 手机号码 以13, 15, 18开头的11位数
        String content = "13706362092";
        String regStr = "^1[3|5|8]\\d{9}$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        boolean isFound = matcher.matches();
        if (isFound) {
            System.out.println("Is a match!");
        } else {
            System.out.println("Doesn't match!");
        }
    }
    
}

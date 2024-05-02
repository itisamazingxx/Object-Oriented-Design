package recursive;

public class BinaryNumConvert {

    public String convert(int x) {
        if (x == 0) {
            return "0";
        } else if (x == 1) {
            return "1";
        }
        return convert(x / 2) + String.valueOf(x % 2);
    }
    
}

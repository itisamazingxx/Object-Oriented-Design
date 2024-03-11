public class MonkeyPeach {
    public static void main(String[] args) {
        Recursive t = new Recursive();
        int res = t.peach(8);
        System.out.println("Monkeypeach result: " + res);
    }
}

/**
 * 有一堆桃子，猴子第一条吃了其中的一半，并再多吃了一个
 * 以后猴子每天都吃其中的一半，然后再多吃一个，直到第十天想再吃时，发现只有一个桃子了
 * 最初有多少个?
 */
class Recursive {
    public int peach(int n) {
        if (n == 10) {
            return 1;
        }
        return (peach(n + 1) + 1) * 2;
    }
}
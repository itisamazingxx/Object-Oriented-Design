import java.time.LocalDateTime;

public class Tweet {
    private static int global_Time = 0;
    private int id;
    public int time;

    public Tweet(int id) {
        this.id = id;
        this.time = ++global_Time;
    }

    public int getTweetId() {
        return this.id;
    }
}

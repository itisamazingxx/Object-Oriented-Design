import java.util.LinkedList;

public class User {
    private int userId;
    private LinkedList<Tweet> tweets;

    public User(int userId) {
        this.userId = userId;
        this.tweets = new LinkedList<>();
    }

    public void postTweets(int tweetId) {
        Tweet newTweet = new Tweet(tweetId);
        this.tweets.addFirst(newTweet);
    }

    public LinkedList<Tweet> getTweets() {
        return this.tweets;
    }
}

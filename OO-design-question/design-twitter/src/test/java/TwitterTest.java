import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwitterTest {

    private Twitter twitter;

    @BeforeEach
    void setUp() {
        twitter = new Twitter();
    }

    @Test
    void postTweets() {
        twitter.postTweets(1, 1);
        twitter.postTweets(2, 2);
        twitter.postTweets(1, 3);
        twitter.postTweets(2, 4);
        User user1 = twitter.getUser(1);
        User user2 = twitter.getUser(2);
        assertEquals(2, user1.getTweets().size());
        assertEquals(2, user2.getTweets().size());
    }

    @Test
    void follow() {
        twitter.follow(1, 2);
        twitter.follow(2,1);
        twitter.follow(1, 3);
        assertEquals(2, twitter.followings.get(1).size());
    }

    @Test
    void unfollow() {
        twitter.follow(1, 2);
        twitter.follow(1, 3);
        twitter.follow(1, 5);
        twitter.unfollow(1, 3);
        assertEquals(2, twitter.followings.get(1).size());
    }

    @Test
    void getNewsFeed() {
        twitter.postTweets(1, 1);
        List<Integer> result = twitter.getNewsFeed(1);
        assertEquals(Arrays.asList(1), result);

        twitter.follow(2, 1);
        List<Integer> result2 = twitter.getNewsFeed(2);
        assertEquals(Arrays.asList(1), result);

    }
}
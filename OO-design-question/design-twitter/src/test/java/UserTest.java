import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    void setUp() {
        user = new User(1);
    }

    @Test
    void postTweets() {
        user.postTweets(2);
        user.postTweets(3);
        assertEquals(3, user.getTweets().getFirst().getTweetId());
    }

    @Test
    void getTweets() {
        user.postTweets(1);
        assertEquals(1, user.getTweets().size());

    }
}
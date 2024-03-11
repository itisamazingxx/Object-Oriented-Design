import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TweetTest {
    private Tweet tweet;

    @BeforeEach
    void setUp() {
        tweet = new Tweet(1);
    }

    @Test
    void getTweetId() {
        assertEquals(1, tweet.getTweetId());
    }
}
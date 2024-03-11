import java.util.*;


public class Twitter {
    private HashMap<Integer, User> users;
    public HashMap<Integer, HashSet<Integer>> followings, followers;

    public Twitter() {
        this.users = new HashMap<>();
        this.followings = new HashMap<>();
        this.followers = new HashMap<>();
    }

    public User getUser(int userId) {
        return this.users.get(userId);
    }

    private void containsAddUser(int userId) {
        if (this.users.containsKey(userId)) {
            return;
        }
        User user = new User(userId);
        this.users.put(userId, user);
    }

    void postTweets(int userId, int tweetId) {
        containsAddUser(userId);
        User user = this.getUser(userId);
        user.postTweets(tweetId);
    }

    public void follow(int followerId, int followeeId) {
        containsAddUser(followeeId);
        containsAddUser(followeeId);

        if (!this.followings.containsKey(followerId)) {
            this.followings.put(followerId, new HashSet<Integer>() {
            });
        }
        if (!this.followers.containsKey(followeeId)) {
            this.followers.put(followeeId, new HashSet<Integer>());
        }
        this.followings.get(followerId).add(followeeId);
        this.followers.get(followeeId).add(followerId);
    }

    public void unfollow(int followerId, int followeeId) {

        if (this.followings.containsKey(followerId)) {
            this.followings.get(followerId).remove(followeeId);
        }
        if (this.followers.containsKey(followeeId)) {
            this.followers.get(followeeId).remove(followerId);
        }
    }

    /**
     * Retrives the 10 most recent tweet IDs in the user's new feeds
     */
    public List<Integer> getNewsFeed(int userId) {
        if (!this.users.containsKey(userId)) {
            return new ArrayList<>();
        }

        PriorityQueue<Tweet> q = new PriorityQueue<>(new Comparator<Tweet>() {
            @Override
            public int compare(Tweet o1, Tweet o2) {
                return o2.time - o1.time;
            }
            // 根据更大的时间戳进行排序
        });

        // 添加自己的推文
        User user = users.get(userId);
        q.addAll(user.getTweets());

        // 添加关注人的推文
        HashSet<Integer> followeeId = this.followings.get(userId);
        if (followeeId != null) {
            for (int id : followeeId) {
                User followee = this.users.get(id);
                if (followee != null) {
                    q.addAll(followee.getTweets());
                }
            }
        }

        List<Integer> resultFeed = new ArrayList<>();
        while (!q.isEmpty() && resultFeed.size() < 10) {
            resultFeed.add(q.poll().getTweetId());
        }
        return resultFeed;
    }
}

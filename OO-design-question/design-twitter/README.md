## Design Twitter

**主要实现功能**
1. `void postTweet(int userId, int tweetId)`
2. `List<Integer> getNewsFeed(int userId)`
3. `void follow(int followerId, int followeeId)`
4. `void unfollow(int followerId, int followeeId)`

Class Twitter:
```
Stores all user's information

Corresponding follower & followee relationship
```

整体结构是链表保存tweets HashMap存储对应关系





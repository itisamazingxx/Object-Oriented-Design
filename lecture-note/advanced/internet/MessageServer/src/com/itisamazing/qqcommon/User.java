package com.itisamazing.qqcommon;

import java.io.Serializable;

/**
 ** 表示一个用户信息
 */
public class User implements Serializable {
    private String userId; // 表示用户id
    private String password;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

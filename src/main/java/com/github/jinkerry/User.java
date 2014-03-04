package com.github.jinkerry;

/**
 * User: jinfeng
 * Date: 14-3-4
 * Time: 下午4:50
 */
public class User {
    private String username;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

}

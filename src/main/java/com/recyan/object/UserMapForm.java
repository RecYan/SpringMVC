package com.recyan.object;

import java.util.Map;


/**
 * Created by Yan_Jiang on 2018/8/5.
 */
public class UserMapForm {
    private Map<String,User> users;

    @Override
    public String toString() {
        return "UserMapForm{" +
                "users=" + users +
                '}';
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }
}

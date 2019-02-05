package com.codepath.apps.restclienttemplate.models;

import org.json.JSONObject;

public class User {

    public String name;
    public long uid;
    public String screenName;
    public String profileImageUrl;

    public static User fromJson(JSONObject jsonObject) {
        User user = new User();

        return user;

    }
}

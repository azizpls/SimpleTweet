package com.codepath.apps.restclienttemplate.models;

import com.codepath.apps.restclienttemplate.models.TimeFormatter.TimeFormatter;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class Tweet {

    public String body;
    public Long uid;
    public String createdAt;
    public User user;
    public String timeStamp;

    // empty constructor needed by the Parceler library
    public Tweet() {

    }


    public String getFormattedTime() {
        return TimeFormatter.getTimeDifference("created_at");
    }

    public static Tweet fromJson(JSONObject jsonObject) throws JSONException {
        Tweet tweet = new Tweet();
        tweet.body = jsonObject.getString("text");
        tweet.uid = jsonObject.getLong("id");
        tweet.createdAt = jsonObject.getString("created_at");
        tweet.user = User.fromJson(jsonObject.getJSONObject("user"));
        tweet.timeStamp = TimeFormatter.getTimeDifference("created_at");


        return tweet;
    }
}

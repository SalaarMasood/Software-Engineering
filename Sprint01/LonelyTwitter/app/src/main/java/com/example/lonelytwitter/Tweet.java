package com.example.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;

    // constructors
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    // getters and setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    // setter for message
    public void setMessage(String message) {
        // assinging message to this.message
        this.message = message;
    }

    public abstract Boolean isImportant();
}
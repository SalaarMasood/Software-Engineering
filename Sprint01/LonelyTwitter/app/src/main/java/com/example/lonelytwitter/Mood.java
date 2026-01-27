package com.example.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date date;

    // constructors
    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    // getters and setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();
}
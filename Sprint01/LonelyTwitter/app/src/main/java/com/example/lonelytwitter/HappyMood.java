package com.example.lonelytwitter;

import java.util.Date;

public class HappyMood extends Mood {

    // constructors
    public HappyMood() {
        super();
    }

    public HappyMood(Date date) {
        super(date);
    }

    // overriding for happy mood
    @Override
    public String getMood() {
        return "Happy";
    }
}
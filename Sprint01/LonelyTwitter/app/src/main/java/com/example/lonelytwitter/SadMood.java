package com.example.lonelytwitter;

import java.util.Date;

public class SadMood extends Mood {

    // constructors
    public SadMood() {
        super();
    }

    public SadMood(Date date) {
        super(date);
    }

    // overriding for sad mood
    @Override
    public String getMood() {
        return "Sad"; 
    }
}
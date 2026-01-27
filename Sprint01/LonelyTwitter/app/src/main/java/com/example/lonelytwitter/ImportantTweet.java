package com.example.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {

    // constructors

    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        // imp tweets are important so return true
        return Boolean.TRUE;
    }
}
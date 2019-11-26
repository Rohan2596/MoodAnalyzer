package com.bridgelabz;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if(message.equals("I am in Sad Mood"))
            return "SAD";
        if (message.equals("I am in Any Mood"))
        return "HAPPY";

        return null;
    }
}

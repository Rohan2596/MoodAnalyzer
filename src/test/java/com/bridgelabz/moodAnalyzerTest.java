package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class moodAnalyzerTest {

    private static MoodAnalyzer moodAnalyzer;

    @Test
    public void given_message_shouldReturn_SAD(){
        moodAnalyzer=new MoodAnalyzer();
        String returnMessage=moodAnalyzer.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",returnMessage);

    }

    @Test
    public void given_message_shouldReturn_HAPPY(){
        moodAnalyzer=new MoodAnalyzer();
        String returnMessage=moodAnalyzer.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY",returnMessage);
    }

}

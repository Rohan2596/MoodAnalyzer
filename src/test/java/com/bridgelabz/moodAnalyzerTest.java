package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class moodAnalyzerTest {

    private static MoodAnalyzer moodAnalyzer;

    @Test
    public void given_message_shouldReturn_SAD(){
        moodAnalyzer=new MoodAnalyzer("I am in Sad Mood");

        String returnMessage=moodAnalyzer.analyseMood();
        System.out.println(returnMessage);
        Assert.assertEquals("SAD",returnMessage);

    }

    @Test
    public void given_message_shouldReturn_HAPPY(){
        moodAnalyzer=new MoodAnalyzer("I am  in Any Mood");
        String returnMessage=moodAnalyzer.analyseMood();
        System.out.println(returnMessage);
        Assert.assertEquals("HAPPY",returnMessage);
    }

}

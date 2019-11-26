package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class moodAnalyzerTest {

    private static MoodAnalyzer moodAnalyzer;

    @Test
    public void given_message_shouldReturn_SAD(){
        moodAnalyzer=new MoodAnalyzer("I am in Sad Mood");
        try {
            String returnMessage = moodAnalyzer.analyseMood();
            System.out.println(returnMessage);
        }catch (MoodAnalysisException m) {
            Assert.assertEquals("MOOD",m.getMessage());
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,m.exceptionType);

        }
    }

    @Test
    public void given_message_shouldReturn_HAPPY(){
        moodAnalyzer=new MoodAnalyzer("I am  in Any Mood");
        try {
            String returnMessage = moodAnalyzer.analyseMood();
            System.out.println(returnMessage);
        }catch (MoodAnalysisException m){
        Assert.assertEquals("MOOD",m.getMessage());
        Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,m.exceptionType);

        }
    }

    @Test
    public void given_message_ShouldReturn_Happy_noparameter_Contructors(){
        moodAnalyzer=new MoodAnalyzer();
        try {
            String returnMessage = moodAnalyzer.analyseMood();
            System.out.println(returnMessage);
        }catch (MoodAnalysisException m) {

            Assert.assertEquals("MOOD", m.getMessage());
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,m.exceptionType);
        }
    }

    @Test
    public void given_message_isEmpty(){
        moodAnalyzer=new  MoodAnalyzer("");
        try {
            String returnMessage = moodAnalyzer.analyseMood();
            System.out.println(returnMessage);
        }catch (MoodAnalysisException m) {

            Assert.assertEquals("MOOD", m.getMessage());
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,m.exceptionType);
        }
    }

}

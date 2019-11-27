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

    @Test
    public void given_moodAnalyser_whenProper_shouldReturnObject(){
        try {
            moodAnalyzer=MoodAnalyzerFactory.createMoodAnalyser("I am in Happy message");
            String returnMessage = moodAnalyzer.analyseMood();
            Assert.assertEquals(new MoodAnalyzer("I am in Happy message"),moodAnalyzer);
            System.out.println("heii");
        }catch (MoodAnalysisException m){
//            Assert.assertEquals("MOOD", m.getMessage());
            System.out.println("sddf");
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_CLASSFOUND,m.exceptionType);
        }
    }


    @Test
    public void given_moodAnalyser_emptyObject(){
        try{
            moodAnalyzer=MoodAnalyzerFactory.createMoodAnalyser();
            String returnMessage = moodAnalyzer.analyseMood();
            Assert.assertEquals(new MoodAnalyzer(),moodAnalyzer);

        }catch (MoodAnalysisException m){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,m.exceptionType);

        }
    }
    @Test
    public void given_methodName_check(){
        try{
            moodAnalyzer=MoodAnalyzerFactory.createMethodMoodAnalyser("I am in HAPPY message");
            String returnMessage=moodAnalyzer.analyseMood();
            Assert.assertEquals(new MoodAnalyzer("I am in Happy Message"),moodAnalyzer);

        }catch(MoodAnalysisException m){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,m.exceptionType);

        }
    }

}

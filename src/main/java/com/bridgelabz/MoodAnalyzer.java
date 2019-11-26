package com.bridgelabz;

import java.util.EmptyStackException;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String message){
        this.message=message;

    }
    public String analyseMood() throws MoodAnalysisException {

        try{
        if(message.contains("Sad"))
            return "SAD";
        return "HAPPY";
        }catch (NullPointerException e){
         throw new MoodAnalysisException("MOOD", MoodAnalysisException.ExceptionType.ENTERED_NULL);
        }catch (EmptyStackException e){
            throw  new MoodAnalysisException("MOOD", MoodAnalysisException.ExceptionType.ENTERED_EMPTY );
        }

    }

}

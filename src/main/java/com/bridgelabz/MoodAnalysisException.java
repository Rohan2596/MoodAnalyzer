package com.bridgelabz;

public class MoodAnalysisException extends  Exception {
    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY
    }
    ExceptionType exceptionType;
    public MoodAnalysisException( String exceptionMessage,ExceptionType exceptionType){
        super(exceptionMessage);
        this.exceptionType=exceptionType;

    }

}

package com.bridgelabz;

public class MoodAnalysisException extends  Exception {
    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY,NO_SUCH_CLASSFOUND,NO_SUCH_METHOD
    }
    ExceptionType exceptionType;
    public MoodAnalysisException( String exceptionMessage,ExceptionType exceptionType){
        super(exceptionMessage);
        this.exceptionType=exceptionType;

    }
    public MoodAnalysisException(ExceptionType exceptionType){
        this.exceptionType=exceptionType;
    }


}

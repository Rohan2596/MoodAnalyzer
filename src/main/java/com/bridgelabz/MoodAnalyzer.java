package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String message){
        this.message=message;

    }
    public String analyseMood() {

        try{
        if(message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }catch (NullPointerException n){
        return "HAPPY";
        }
    }
}

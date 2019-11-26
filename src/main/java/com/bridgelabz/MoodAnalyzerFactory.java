package com.bridgelabz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyzerFactory {
    public static MoodAnalyzer createMoodAnalyser(String message)  throws  MoodAnalysisException{
        try{
          Class<?> moodAnalyzer=Class.forName("com.bridgelabz.MoodAnalyzer");
       Constructor<?> moodConstructor=moodAnalyzer.getConstructor(String.class);
      Object moodObject= moodConstructor.newInstance(message);
     return (MoodAnalyzer) moodObject;
         }catch(ClassNotFoundException e){
        throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASSFOUND);
    }catch (NoSuchMethodException e){
            throw new MoodAnalysisException( "MOOD",MoodAnalysisException.ExceptionType.NO_SUCH_METHOD);
    }catch (InstantiationError e){
        e.printStackTrace();
    }catch (IllegalAccessError e){
        e.printStackTrace();
    }catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}

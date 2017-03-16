package com.example.paulius.hsquiz;

/**
 * Created by Paulius on 2017-03-03.
 */

public class GoblinsQuestionLibrary {
    private String allQustion[] = {
            ""

    };

    private int allPhoto[]= {




    };
    private String allChoices[][]={
            {"","","",""}

    };

    private String allAnswer[]={
            ""
    };

    public String GetQuestion(int a){
        String Question = allQustion[a];
        return Question;
    }

    public int GetPhoto(int a){
        int Photo = allPhoto[a];
        return Photo;
    }

    public String getChoices1(int a){
        String Choices1 = allChoices[a][0];
        return Choices1;
    }

    public String getChoices2(int a){
        String Choices2 = allChoices[a][1];
        return Choices2;
    }

    public String getChoices3(int a){
        String Choices3 = allChoices[a][2];
        return Choices3;
    }

    public String getChoices4(int a){
        String Choices4 = allChoices[a][3];
        return Choices4;
    }

    public String getAnwer(int a){
        String Answer = allAnswer[a];
        return Answer;
    }
    public int GetSize() {
        int Size = allAnswer.length;
        return Size;
    }
}

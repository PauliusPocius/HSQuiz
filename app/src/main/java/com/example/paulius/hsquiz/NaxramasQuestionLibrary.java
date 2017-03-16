package com.example.paulius.hsquiz;

/**
 * Created by Paulius on 2017-02-14.
 */

public class NaxramasQuestionLibrary {

    private String allQustion[] = {
            "This minion health?",
            "This card rarity?",
            "Which boss has this hero power?",
            "Minion attack?",
            "This card rarity?",
            "How many secret Naxxramas has?",
            "Minion attack and health?",
            "Minion mana cost?",
            "Naxxramas cardback?",
            "This card rarity?",
            "Which boss has this weapon?",
            "Minion attack and health?",
            "This card name?",
            "Minion mana cost?",
            "How many wings Naxxramas has?",
            "Which boss has this hero power?",
            "Minion attack and health?",
            "This card name?",
            "This card mana cost?",
            "This card rarity?",
            ""



    };

    private int allPhoto[]= {
            R.drawable.baron,R.drawable.egg,R.drawable.maexna_power,R.drawable.kelthuzad,R.drawable.cultist,R.drawable.secrets,
            R.drawable.stalag,R.drawable.weblord,R.drawable.naxxramas_cardback,R.drawable.wailing,R.drawable.hook,R.drawable.thadius,
            R.drawable.reincarnate,R.drawable.stoneskin,R.drawable.wings,R.drawable.patchwerk,R.drawable.feugen,R.drawable.loatheb,
            R.drawable.poison_seeds,R.drawable.dancing_sword,R.drawable.hook



    };
    private String allChoices[][]={
            {"7","6","8","5"},
            {"common","epic","rare","legendary"},
            {"grobbulus","anub'rekhan","patchwerk","maexxna"},
            {"7","8","6","5"},
            {"common","epic","rare","legendary"},
            {"1","2","3","0"},
            {"4/7","7/4","7/5","5/7"},
            {"1","3","4","2"},
            {"1","2","3","4"},
            {"common","epic","rare","legendary"},
            {"Gluth","anub'rekhan","Grobbulus","Patchwerk"},
            {"11/11","12/12","12/11","11/12"},
            {"Ancestral Healing","Revive","Reincarnate","Resurrect"},
            {"2","3","4","1"},
            {"4","7","6","5"},
            {"Grobbulus","Patchwerk","Gluth","Sapphiron"},
            {"4/7","7/4","7/5","5/7"},
            {"Grobbulus","Bolvar","Loatheb","Baron"},
            {"4","3","5","6"},
            {"common","epic","rare","legendary"},
            {"","","",""},


    };

    private String allAnswer[]={
            "7","rare","maexnna","6","common","2","7/4","2","3","rare","Patchwerk","11/11","Reincarnate","3","5","Patchwerk","4/7","Loatheb","4","common",""
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
        int Size = allQustion.length;
        return Size;
    }
}

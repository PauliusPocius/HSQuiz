package com.example.paulius.hsquiz;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by Paulius on 2017-01-19.
 */

public class BasicsQuestionLibrary {

    private String allQustion[] = {
            "Minion mana cost?",
            "Which class has this card?",
            "This card rarity?",
            "Jaraxxus weapon name?",
            "Minion battlecry?",
            "Name of this card?",
            "Attack and health of this minion?",
            "Overload of this card?",
            "This card rarity?",
            "Minion mana cost?",
            "How much dream cards Ysera has?",
            "Type of this card?",
            "Minion attack?",
            "Paladin hero power name?",
            "This card rarity?",
            "Overload next turn?",
            "Attack and health after your 3 turns?",
            "Minion mana cost?",
            "Name of this card?",
            "Number of hunters secret's?",
            "Weapon durability?",
            "Priest hero power name in shadowform?",
            "Vanish mana cost with preparation?",
            "This card rarity?",
            "Name of this card?",
            ""

    };

    private int allPhoto[]= {
        R.drawable.sea_giant,R.drawable.longbow,R.drawable.kidnapper,R.drawable.fury, R.drawable.elune,R.drawable.felguar,R.drawable.knight,R.drawable.elemental,
            R.drawable.entity,R.drawable.beast,R.drawable.ysera,R.drawable.youngdragon,R.drawable.cenarius, R.drawable.reinforce,R.drawable.infernal,R.drawable.overload,
            R.drawable.gruul, R.drawable.sister,R.drawable.nightblade, R.drawable.hunter_secret, R.drawable.justice, R.drawable.shadow_form, R.drawable.vanish,R.drawable.captain,
            R.drawable.bestial_wrath,R.drawable.bestial_wrath



};
    private String allChoices[][]={
            {"9","8","10","12"},
            {"warrior","hunter","paladin","shaman"},
            {"common","epic","rare","basic card"},
            {"bloody hook","blood fury","bloody blade"," bloody strike"},
            {"Restore 4 health to your hero","Restore 2 Health to all friendly characters","Restore 2 Health to all friendly minions","Restore 3 health to your hero"},
            {"Demolisher","Wrathguard","Felguard","Voidguard"},
            {"4/5","5/4","5/6","5/5"},
            {"2","3","4","1"},
            {"epic","common","basic card","rare"},
            {"5","7","8","6"},
            {"4","3","5","6"},
            {"None","Dragon","Beast","Pirate"},
            {"7","6","8","5"},
            {"Reinforce","Recruit","Conscript","Strengthen"},
            {"common","basic card","rare","epic"},
            {"5","4","6","7"},
            {"11","13","10","12"},
            {"2","4","1","3"},
            {"masterblade","shadowblade","nightblade","darkblade"},
            {"4","5","3","6"},
            {"4","3","5","6"},
            {"mind spike","mind strike","mind shatter","shadow spike"},
            {"3","0","1","4"},
            {"rare","common","basic card","epic"},
            {"animal wrath","bestial wrath"," bestial vengeance","animal vengeance"},
            {"animal wrath","bestial wrath"," bestial vengeance","animal vengeance"},

    };

    private String allAnswer[]={
            "10", "hunter", "epic","blood fury","Restore 4 health to your hero","Felguard","4/5","3",
            "common","6","5","Beast","5","Reinforce","basic card","5","12","3","nightblade","5","5","mind shatter","3",
            "epic","bestial wrath",""
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

package com.example.paulius.hsquiz;

/**
 * Created by Paulius on 2017-01-23.
 */

public class RankLibrary {

    private int AllranksPhoto[]={
        R.drawable.rank1, R.drawable.rank1,R.drawable.rank2,R.drawable.rank3,R.drawable.rank4,R.drawable.rank5,R.drawable.rank1tr,R.drawable.rank7,R.drawable.rank8,
            R.drawable.rank9,R.drawable.rank10,R.drawable.rank11,R.drawable.rank12,R.drawable.rank13,R.drawable.rank14,R.drawable.rank15,
            R.drawable.rank16,R.drawable.rank17,R.drawable.rank18,R.drawable.rank19,R.drawable.rank20,R.drawable.rank21,R.drawable.rank22,
            R.drawable.rank23,R.drawable.rank24,R.drawable.rank25,

    };
    public int GetPhoto(int a){
        int Photo = AllranksPhoto[a];
        return Photo;
    }
}

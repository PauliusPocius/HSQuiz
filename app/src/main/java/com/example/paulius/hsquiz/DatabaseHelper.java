package com.example.paulius.hsquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static java.sql.Types.INTEGER;


public class DatabaseHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME ="HSQUIZ";

    private static final String TABLE_RANK ="Ranks";

    private static final String COL1 = "name";
    private static final String COl2 = "rank";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_RANK +" (name TEXT, rank INTEGER)");
        db.execSQL("insert into " + TABLE_RANK +" (name,rank)" + "values('Basics',25),('Naxramas',20),('GVG',25)");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RANK);
        onCreate(db);
    }
    public Cursor Select(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor =db.rawQuery("Select rank from " + TABLE_RANK +" where name = ?;", new String []{"Basics"});
        return cursor;
    }
    public Cursor naxramas(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor =db.rawQuery("Select rank from " + TABLE_RANK +" where name = ?;", new String []{"Naxramas"});
        return cursor;
    }
    public Cursor gvg(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor =db.rawQuery("Select rank from " + TABLE_RANK +" where name = ?;", new String []{"GVG"});
        return cursor;
    }
    public boolean Update(String name, String rank){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COl2, rank);
        db.update(TABLE_RANK, contentValues, "name = ?", new String[]{name});
        return true;
    }

}


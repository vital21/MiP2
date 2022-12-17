package com.example.mip;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DbSQLite extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME= "wood";
    public static final String TABLE_WOOD="Wood";
    public static final String KEY_ID="_id";
    public static final String KEY_NAME="name";
    public static final String KEY_RESULT="result";
    public static final String KEY_DATE="date";
   // DbSQLite dbSQLite;

    public DbSQLite(@Nullable Context context ) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase Db) {
        Db.execSQL("create table " + TABLE_WOOD + "("+ KEY_ID + " integer primary key,"+ KEY_NAME + " text," + KEY_RESULT + " text, "+ KEY_DATE + " text" + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists " + TABLE_WOOD);
        onCreate(sqLiteDatabase);
    }
    public void db(String result, String theme, DbSQLite dbSQLite){
       // dbSQLite = new DbSQLite(this);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String Date= formatter.format(date);
        SQLiteDatabase database = dbSQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DbSQLite.KEY_NAME, theme);
        contentValues.put(DbSQLite.KEY_RESULT,result);
        contentValues.put(DbSQLite.KEY_DATE,Date);
        database.insert(DbSQLite.TABLE_WOOD,null,contentValues);
    }
}

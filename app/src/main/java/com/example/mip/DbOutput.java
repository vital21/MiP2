package com.example.mip;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.mip.DbSQLite;

public class DbOutput {
    public void outputDb(DbSQLite dbSQLite){

        SQLiteDatabase database = dbSQLite.getWritableDatabase();
        Cursor cursor = database.query(DbSQLite.TABLE_WOOD,null,null,null,null,null,null);
        if(cursor.moveToFirst()){
            int idIndex = cursor.getColumnIndex(DbSQLite.KEY_ID);
            int nameId = cursor.getColumnIndex(DbSQLite.KEY_NAME);
            int resultId = cursor.getColumnIndex(DbSQLite.KEY_RESULT);
            int dateId= cursor.getColumnIndex(DbSQLite.KEY_DATE);
            do{
                Log.d("mLog", "ID = " + cursor.getInt(idIndex) + ", name - " + cursor.getString(nameId)+ ", result = " + cursor.getString(resultId) + ", date - "+cursor.getString(dateId));
            }while (cursor.moveToNext());
        }
        else {
            Log.d("database","no database");
        }
        cursor.close();
    }
}

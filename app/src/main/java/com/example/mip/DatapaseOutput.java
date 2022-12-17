package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class DatapaseOutput extends AppCompatActivity {
    DbSQLite dbSQLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datapase_output);
        Bundle bundle =getIntent().getExtras();
        int out = (int) bundle.get("out");
        dbSQLite = new DbSQLite(this);
        ArrayList<String> output;

        ScrollView scrollView = new ScrollView(this);
        TextView textView = new TextView(this);
        if(out ==1){
            output=outStringBd(dbSQLite);
            textView.setText(outString(output));

        }
        if(out ==2){
            output=outStringBdGidroterm(dbSQLite);
            textView.setText(outString(output));

        }
        if(out ==3){
            output=outStringBdOborud(dbSQLite);
            textView.setText(outString(output));

        }
        if(out ==4){
            output=outStringBdLesProiz(dbSQLite);
            textView.setText(outString(output));
        }
        if(out ==5){
            output=outStringBdTehnilPro(dbSQLite);
            textView.setText(outString(output));
        }
        if(out ==6){
            Clear(dbSQLite);
            Intent intent=new Intent(this,menuBdOut.class);
            startActivity(intent);
        }

        textView.setLayoutParams( new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setBackgroundColor(Color.rgb(252,235,181));
        scrollView.setBackgroundColor(Color.rgb(252,235,181));
        textView.setTextSize(26);
        scrollView.addView(textView);
        setContentView(scrollView);
    }
    public ArrayList<String> outStringBd(DbSQLite dbSQLite){
        ArrayList<String> result = new ArrayList<String>();
        SQLiteDatabase database = dbSQLite.getWritableDatabase();
        Cursor cursor = database.query(DbSQLite.TABLE_WOOD,null,null,null,null,null,null);
        if(cursor.moveToFirst()){
            int idIndex = cursor.getColumnIndex(DbSQLite.KEY_ID);
            int nameId = cursor.getColumnIndex(DbSQLite.KEY_NAME);
            int resultId = cursor.getColumnIndex(DbSQLite.KEY_RESULT);
            int dateId= cursor.getColumnIndex(DbSQLite.KEY_DATE);
            do{
                result.add ("Номер = " + cursor.getInt(idIndex) + ", Тема расчета - " + cursor.getString(nameId)+ ", Результат = " + cursor.getString(resultId) + ", Дата - "+cursor.getString(dateId));
            }while (cursor.moveToNext());
        }
        else {
            Log.d("database","no database");
        }
        cursor.close();
        return result;
    }
    public  ArrayList<String> outStringBdLesProiz(DbSQLite dbSQLite){
        ArrayList<String> result = new ArrayList<String>();
        SQLiteDatabase database = dbSQLite.getWritableDatabase();
        Cursor cursor = database.rawQuery("Select * from wood where name in('Диаметр бревна на середине его длины','Ёмкость штабеля круглого леса на бирже сырья','Габаритный обьем штабеля') ",null);
        if(cursor.moveToFirst()){
            int idIndex = cursor.getColumnIndex(DbSQLite.KEY_ID);
            int nameId = cursor.getColumnIndex(DbSQLite.KEY_NAME);
            int resultId = cursor.getColumnIndex(DbSQLite.KEY_RESULT);
            int dateId= cursor.getColumnIndex(DbSQLite.KEY_DATE);
            do{
                result.add ("Номер = " + cursor.getInt(idIndex) + ", Тема расчета - " + cursor.getString(nameId)+ ", Результат = " + cursor.getString(resultId) + ", Дата - "+cursor.getString(dateId));
            }while (cursor.moveToNext());
        }
        else {
            Log.d("database","no database");
        }
        cursor.close();
        return result;

    }
    public  ArrayList<String> outStringBdTehnilPro(DbSQLite dbSQLite){
        ArrayList<String> result = new ArrayList<String>();
        SQLiteDatabase database = dbSQLite.getWritableDatabase();
        Cursor cursor = database.rawQuery("Select * from wood where name in('Ширина сырой доски','Расчет площади сортировочной части бассейна','Расчет сортировочной площадки') ",null);
        if(cursor.moveToFirst()){
            int idIndex = cursor.getColumnIndex(DbSQLite.KEY_ID);
            int nameId = cursor.getColumnIndex(DbSQLite.KEY_NAME);
            int resultId = cursor.getColumnIndex(DbSQLite.KEY_RESULT);
            int dateId= cursor.getColumnIndex(DbSQLite.KEY_DATE);
            do{
                result.add ("Номер = " + cursor.getInt(idIndex) + ", Тема расчета - " + cursor.getString(nameId)+ ", Результат = " + cursor.getString(resultId) + ", Дата - "+cursor.getString(dateId));
            }while (cursor.moveToNext());
        }
        else {
            Log.d("database","no database");
        }
        cursor.close();
        return result;
    }
    public  ArrayList<String> outStringBdGidroterm(DbSQLite dbSQLite){
        ArrayList<String> result = new ArrayList<String>();
        SQLiteDatabase database = dbSQLite.getWritableDatabase();
        Cursor cursor = database.rawQuery("Select * from wood where name in('Число оборотов камеры в течении года') ",null);
        if(cursor.moveToFirst()){
            int idIndex = cursor.getColumnIndex(DbSQLite.KEY_ID);
            int nameId = cursor.getColumnIndex(DbSQLite.KEY_NAME);
            int resultId = cursor.getColumnIndex(DbSQLite.KEY_RESULT);
            int dateId= cursor.getColumnIndex(DbSQLite.KEY_DATE);
            do{
                result.add ("Номер = " + cursor.getInt(idIndex) + ", Тема расчета - " + cursor.getString(nameId)+ ", Результат = " + cursor.getString(resultId) + ", Дата - "+cursor.getString(dateId));
            }while (cursor.moveToNext());
        }
        else {
            Log.d("database","no database");
        }
        cursor.close();
        return result;

    }
    public  ArrayList<String> outStringBdOborud(DbSQLite dbSQLite){
        ArrayList<String> result = new ArrayList<String>();
        SQLiteDatabase database = dbSQLite.getWritableDatabase();
        Cursor cursor = database.rawQuery("Select * from wood where name in('Число оборотов ведомого шкива в ременной передаче') ",null);
        if(cursor.moveToFirst()){
            int idIndex = cursor.getColumnIndex(DbSQLite.KEY_ID);
            int nameId = cursor.getColumnIndex(DbSQLite.KEY_NAME);
            int resultId = cursor.getColumnIndex(DbSQLite.KEY_RESULT);
            int dateId= cursor.getColumnIndex(DbSQLite.KEY_DATE);
            do{
                result.add ("Номер = " + cursor.getInt(idIndex) + ", Тема расчета - " + cursor.getString(nameId)+ ", Результат = " + cursor.getString(resultId) + ", Дата - "+cursor.getString(dateId));
            }while (cursor.moveToNext());
        }
        else {
            Log.d("database","no database");
        }
        cursor.close();
        return result;

    }
    public void Clear(DbSQLite dbSQLite){
        SQLiteDatabase database = dbSQLite.getWritableDatabase();
        database.delete(DbSQLite.TABLE_WOOD,null,null);
    }
    public String outString(ArrayList<String> output){
        String resultOutput = "";
        for(int i =0; i < output.size();i++ ){
            resultOutput=String.join("\n",resultOutput,output.get(i));
        }
        return  resultOutput;
    }
}
package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LesProiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_proiz);
    }

    public void newLesProiz1_1Activity(View view){
        Intent intent=new Intent(this, LesProiz1.class);
        startActivity(intent);
    }
    public void newLesProiz1_2Activity(View view){
        Intent intent=new Intent(this, les_proiz2.class);
        startActivity(intent);
    }
    public void newLesProiz1_3Activity(View view){
        Intent intent=new Intent(this, LesProiz3.class);
        startActivity(intent);
    }
}
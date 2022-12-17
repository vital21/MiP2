package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Oborudovanie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oborudovanie);
    }
    public void newOborud_1Activity(View view){
        Intent intent=new Intent(this, Oborud_1.class);
        startActivity(intent);
    }
    public void newOborud_2Activity(View view){
        Intent intent=new Intent(this, Oborudovanie2.class);
        startActivity(intent);
    }

}
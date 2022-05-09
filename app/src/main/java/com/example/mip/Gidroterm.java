package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gidroterm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gidroterm);
    }
    public void newGidroterm1_1Activity(View view){
        Intent intent=new Intent(this, Gidroterm_1.class);
        startActivity(intent);
    }
}
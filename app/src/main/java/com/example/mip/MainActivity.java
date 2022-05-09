package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void newGidrotermActivity(View view){
        Intent intent=new Intent(this,Gidroterm.class);
        startActivity(intent);
    }
    public void newEconomActivity(View view){
        Intent intent=new Intent(this,Econom.class);
        startActivity(intent);
    }
    public void newLesProizActivity(View view){
        Intent intent=new Intent(this,LesProiz.class);
        startActivity(intent);
    }
    public void newOborudActivity(View view){
        Intent intent=new Intent(this,Oborudovanie.class);
        startActivity(intent);
    }
    public void newTehnolPoActivity(View view){
        Intent intent=new Intent(this,TehnolPro.class);
        startActivity(intent);
    }

}
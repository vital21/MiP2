package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TehnolPro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tehnol_pro);
    }
    public void newTehnolPro1_1Activity(View view){
        Intent intent=new Intent(this, TehnolPro1.class);
        startActivity(intent);
    }
    public void newTehnolPro1_2Activity(View view){
        Intent intent=new Intent(this, TehnolPro2.class);
        startActivity(intent);
    }
    public void newTehnolPro1_3Activity(View view){
        Intent intent=new Intent(this, TehnolPro3.class);
        startActivity(intent);
    }
}
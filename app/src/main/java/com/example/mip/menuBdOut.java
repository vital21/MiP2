package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuBdOut extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bd_out);

    }
    public void clickBd1(View view){
        Intent intent=new Intent(this,DatapaseOutput.class);
        intent.putExtra("out",1);
        startActivity(intent);
    }
    public void clickBd2(View view){
        Intent intent=new Intent(this,DatapaseOutput.class);
        intent.putExtra("out",2);
        startActivity(intent);
    }
    public void clickBd3(View view){
        Intent intent=new Intent(this,DatapaseOutput.class);
        intent.putExtra("out",3);
        startActivity(intent);
    }
    public void clickBd4(View view){
        Intent intent=new Intent(this,DatapaseOutput.class);
        intent.putExtra("out",4);
        startActivity(intent);
    }
    public void clickBd5(View view){
        Intent intent=new Intent(this,DatapaseOutput.class);
        intent.putExtra("out",5);
        startActivity(intent);
    }
    public void clickBd6(View view){
        Intent intent=new Intent(this,DatapaseOutput.class);
        intent.putExtra("out",6);
        startActivity(intent);
    }
}
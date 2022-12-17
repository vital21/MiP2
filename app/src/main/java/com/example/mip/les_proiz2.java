package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class les_proiz2 extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private Button button;
    private static final String theme = "Ёмкость штабеля круглого леса на бирже сырья";
    DbSQLite dbSQLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_proiz2);
        dbSQLite= new DbSQLite(this);
       textView=findViewById(R.id.outputText);
        editText=findViewById(R.id.edit_1_input2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=0;
                double answer;
                try {
                    if( editText.getText().length()==0){
                        throw new Exception();
                    }
                    String inputOne = editText.getText().toString();

                    a = Double.valueOf(inputOne);
                    if((a>0 && a<1000 )) {
                        answer=formula(a);
                        inputOne=Double.toString(answer);
                        textView.setText(inputOne+"(v)");
                        dbSQLite.db(inputOne,theme,dbSQLite);

                    }
                    else{
                        String exeption="Ошибка ввода, введите снова";
                        textView.setText(exeption);
                    }


                }
                catch(Exception e){
                    String exeption="Поле пустое";
                    textView.setText(exeption);

                }
            }
        });
    }
    public static double formula( double b){
        double answer=0;
        answer= b*0.5;
        return answer;
    }
}
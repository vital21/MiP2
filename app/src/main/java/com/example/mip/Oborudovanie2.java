package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Oborudovanie2 extends AppCompatActivity {
    private EditText editText_1;
    private EditText editText_2;
    private EditText editText_3;
    private TextView textView;
    private Button button;
    private static final String theme = "Расчет числа оборотов зубчатого колеса червячной передачи";
    DbSQLite dbSQLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oborudovanie2);
        dbSQLite= new DbSQLite(this);
        textView = findViewById(R.id.outputText3_2);
        editText_1 = findViewById(R.id.edit_3_2_input1);
        editText_2 = findViewById(R.id.edit_3_2_input2);
        editText_3 = findViewById(R.id.edit_3_2_input3);
        button = findViewById(R.id.button_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double L = 0;
                double H = 0;
                double l = 0;
                double answer;
                try {
                    if (editText_1.getText().length() == 0 || editText_2.getText().length() == 0 || editText_3.getText().length() == 0) {
                        throw new Exception();
                    }
                    String input_L = editText_1.getText().toString();
                    String input_H = editText_2.getText().toString();
                    String input_l = editText_3.getText().toString();
                    String answer_string = "";


                    L = Double.valueOf(input_L);
                    H = Double.valueOf(input_H);
                    l = Double.valueOf(input_l);


                    if ((L > 0 && H > 0 && l > 0) && (H < 1000 && L < 1000 && l < 1000)) {
                        answer = formula(L, H, l);
                        answer_string = Double.toString(answer);
                        textView.setText(answer_string + "(об)");
                        dbSQLite.db(answer_string,theme,dbSQLite);

                    } else {
                        String exeption = "Ошибка ввода, введите снова";
                        textView.setText(exeption);
                    }

                } catch (Exception e) {
                    String exeption = "Поле пустое";
                    textView.setText(exeption);

                }


            }
        });
    }
    public static double formula(double L, double H, double l){
        double answer=0;
        answer= (L*H)/l;
        return answer;
    }
}
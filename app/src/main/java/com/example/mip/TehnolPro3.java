package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TehnolPro3 extends AppCompatActivity {
    private EditText editText_1;
    private EditText editText_2;
    private EditText editText_3;
    private EditText editText_4;
    private EditText editText_5;
    private TextView textView;
    private Button button;
    private static final String theme = "Расчет сортировочной площадки";
    DbSQLite dbSQLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tehnol_pro3);
        dbSQLite= new DbSQLite(this);
        textView=findViewById(R.id.outputText3_2);
        editText_1=findViewById(R.id.edit_3_2_input1);
        editText_2=findViewById(R.id.edit_3_input3_b);
        editText_3=findViewById(R.id.edit_3_input3_t);
        editText_4=findViewById(R.id.edit_3_input3_a);
        editText_5=findViewById(R.id.edit_3_input3_r);
        button=findViewById(R.id.button_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double p=0;
                double b=0;
                double t=0;
                double a=0;
                double r=0;
                double answer;
                try {
                    if(editText_1.getText().length()== 0 || editText_2.getText().length()==0 || editText_3.getText().length()==0){
                        throw new Exception();
                    }
                    String input_p = editText_1.getText().toString();
                    String input_b = editText_2.getText().toString();
                    String input_t = editText_3.getText().toString();
                    String input_a = editText_4.getText().toString();
                    String input_r = editText_5.getText().toString();
                    String answer_string="";


                    p = Double.valueOf(input_p);
                    b = Double.valueOf(input_b);
                    t = Double.valueOf(input_t);
                    a = Double.valueOf(input_a);
                    r = Double.valueOf(input_r);


                    if((p>0 && b>0 && t >0 && a>0 &&  r>0) && (p<1000 && b<1000 && t <1000 && a<1000 && r <1000)) {
                        answer=formula(p,b,t,a,r);
                        answer_string=Double.toString(answer);
                        textView.setText(answer_string+"(м)");
                        dbSQLite.db(answer_string,theme,dbSQLite);

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
    public static double formula(double p, double b, double t, double a, double r){
        double answer=0;
        answer= p+b+t+a+r;
        return answer;
    }
}
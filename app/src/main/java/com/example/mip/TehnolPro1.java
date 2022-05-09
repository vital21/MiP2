package com.example.mip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TehnolPro1 extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tehnol_pro1);
        textView=findViewById(R.id.OutputText_2_1);
        editText=findViewById(R.id.edit_4_input_1_1);
        editText2=findViewById(R.id.edit_4_input_1_2);
        button=findViewById(R.id.button_2_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=0;
                double b=0;
                double answer;
                try {
                    if(editText.getText().length()== 0 || editText2.getText().length()==0){
                        throw new Exception();
                    }
                    String inputOne = editText.getText().toString();
                    String inputOne2 = editText2.getText().toString();


                    a = Double.valueOf(inputOne);
                    b = Double.valueOf(inputOne2);


                    if((a>0 && b>0) && (a<1000 && b<1000) && a>=b) {
                        answer=formula(a,b);
                        inputOne=Double.toString(answer);
                        textView.setText(inputOne+"(см)");

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
    public static double formula(double a, double b){
        double answer=0;
        answer= Math.sqrt((a*a)-(b*b));
        return answer;
    }
}
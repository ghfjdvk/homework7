package com.example.ghfjd_000.a1118;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Et1,Et2;
    Button Btn1,Btn2,Btn3,Btn4;
    String num1,num2;
    TextView TextResult;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et1 = (EditText) findViewById(R.id.editText);
        Et2 = (EditText) findViewById(R.id.editText2);
        Btn1 = (Button) findViewById(R.id.button);
        Btn2 = (Button) findViewById(R.id.button2);
        Btn3 = (Button) findViewById(R.id.button3);
        Btn4 = (Button) findViewById(R.id.button4);
        TextResult = (TextView) findViewById(R.id.textView);


        Btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = Et1.getText().toString();
                num2 = Et2.getText().toString();
                result = Integer.parseInt(num1)+Integer.parseInt(num2);

                TextResult.setText("계산결과:"+result);
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = Et1.getText().toString();
                num2 = Et2.getText().toString();
                result = Integer.parseInt(num1)-Integer.parseInt(num2);

                TextResult.setText("계산결과:"+result);
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = Et1.getText().toString();
                num2 = Et2.getText().toString();
                result = Integer.parseInt(num1)*Integer.parseInt(num2);

                TextResult.setText("계산결과:"+result);
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = Et1.getText().toString();
                num2 = Et2.getText().toString();
                result = Integer.parseInt(num1)/Integer.parseInt(num2);

                TextResult.setText("계산결과:"+result);
            }
        });

    }
}

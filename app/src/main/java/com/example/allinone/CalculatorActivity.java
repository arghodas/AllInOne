package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private ImageView addButton, subButton,mulButton,divButton;
    private TextView result;
    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        this.setTitle("Calculator");

        editText1= (EditText) findViewById(R.id.inputText_1);
        editText2= (EditText)findViewById(R.id.inputText_2);
        addButton= findViewById(R.id.addButton);
        subButton= findViewById(R.id.subButton);
        mulButton= findViewById(R.id.mulButton);
        divButton= findViewById(R.id.divButton);
        result= (TextView) findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    num1=Integer.parseInt(editText1.getText().toString());
                    num2=Integer.parseInt(editText2.getText().toString());
                    result_num=num1+num2;
                    result.setText("Result " +String.valueOf(result_num));
                }catch(Exception e){
                    Toast.makeText(CalculatorActivity.this,"You are not allowed to do that",Toast.LENGTH_SHORT).show();

                }

            }
        });
        subButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    num1=Integer.parseInt(editText1.getText().toString());
                    num2=Integer.parseInt(editText2.getText().toString());
                    result_num=num1-num2;
                    result.setText("Result " +String.valueOf(result_num));
                }catch(Exception e){
                    Toast.makeText(CalculatorActivity.this,"You are not allowed to do that",Toast.LENGTH_SHORT).show();

                }

            }
        });
        mulButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    num1=Integer.parseInt(editText1.getText().toString());
                    num2=Integer.parseInt(editText2.getText().toString());
                    result_num=num1*num2;
                    result.setText("Result " +String.valueOf(result_num));
                }catch(Exception e){
                    Toast.makeText(CalculatorActivity.this,"You are not allowed to do that",Toast.LENGTH_SHORT).show();

                }

            }
        });
        divButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    num1=Integer.parseInt(editText1.getText().toString());
                    num2=Integer.parseInt(editText2.getText().toString());
                    result_num=num1/num2;
                    result.setText("Result " +String.valueOf(result_num));
                }catch(Exception e){
                    Toast.makeText(CalculatorActivity.this,"You are not allowed to do that",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
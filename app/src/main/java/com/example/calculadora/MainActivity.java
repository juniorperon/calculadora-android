package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1,num2,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_somar=(Button)findViewById(R.id.btn_soma);
        Button btn_subtrair=(Button)findViewById(R.id.btn_subtrai);
        Button btn_multiplicar=(Button)findViewById(R.id.btn_multiplica);
        Button btn_dividir=(Button)findViewById(R.id.btn_divide);

        TextView txt_resultado=(TextView)findViewById(R.id.txt_resultado);
        EditText int_num1=(EditText)findViewById(R.id.int_num1);
        EditText int_num2=(EditText)findViewById(R.id.int_num2);

        btn_somar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1=Double.parseDouble(int_num1.getText().toString());
                num2=Double.parseDouble(int_num2.getText().toString());
                resultado=num1+num2;
                txt_resultado.setText(String.valueOf(resultado));
            }
        });

        btn_subtrair.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1=Double.parseDouble(int_num1.getText().toString());
                num2=Double.parseDouble(int_num2.getText().toString());
                resultado=num1-num2;
                txt_resultado.setText(String.valueOf(resultado));
            }
        });

        btn_multiplicar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1=Double.parseDouble(int_num1.getText().toString());
                num2=Double.parseDouble(int_num2.getText().toString());
                resultado=num1*num2;
                txt_resultado.setText(String.valueOf(resultado));
            }
        });

        btn_dividir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1=Double.parseDouble(int_num1.getText().toString());
                num2=Double.parseDouble(int_num2.getText().toString());
                resultado=num1/num2;
                txt_resultado.setText(String.valueOf(resultado));
            }
        });

    }
}
package com.example.calculadorajavaandroid;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView resultext;

    private Button sumarbtn;
    private Button restarbtn;
    private Button multbtn;
    private Button dividbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        resultext = findViewById(R.id.resultext);
        sumarbtn = findViewById(R.id.sumarbtn);
        restarbtn = findViewById(R.id.restarbtn);
        multbtn = findViewById(R.id.multbtn);
        dividbtn = findViewById(R.id.dividbtn);

        sumarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String valor1 = et1.getText().toString();
                    String valor2 = et2.getText().toString();

                    double nro1 = Double.parseDouble(valor1);
                    double nro2 = Double.parseDouble(valor2);
                    double result = nro1+nro2;
                    String resultado = String.valueOf(result);

                    resultext.setText("Resultado: "+resultado);
                }catch(NumberFormatException exception){
                    error();
                }
            }
        });

        restarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String valor1 = et1.getText().toString();
                    String valor2 = et2.getText().toString();

                    double nro1 = Double.parseDouble(valor1);
                    double nro2 = Double.parseDouble(valor2);
                    double result = nro1-nro2;
                    String resultado = String.valueOf(result);

                    resultext.setText("Resultado: "+resultado);
                }catch (NumberFormatException exception){
                    error();
                }
            }
        });

        multbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String valor1 = et1.getText().toString();
                    String valor2 = et2.getText().toString();

                    double nro1 = Double.parseDouble(valor1);
                    double nro2 = Double.parseDouble(valor2);
                    double result = nro1*nro2;
                    String resultado = String.valueOf(result);

                    resultext.setText("Resultado: "+resultado);
                }catch (NumberFormatException exception){
                   error();
                }
            }
        });

        dividbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                try {
                    String valor1 = et1.getText().toString();
                    String valor2 = et2.getText().toString();

                    double nro1 = Double.parseDouble(valor1);
                    double nro2 = Double.parseDouble(valor2);
                    double result = nro1/nro2;
                    String resultado = String.valueOf(result);

                    resultext.setText("Resultado: "+resultado);
                }catch (NumberFormatException exception){
                    error();
                }
            }
        });
    }

    void error(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Error");
        builder.setMessage("Input incorrecto");
        builder.setNegativeButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();

    }
}
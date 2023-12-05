package com.example.calculadorajavaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView resultext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        resultext = findViewById(R.id.resultext);
    }

    public void sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);
        double result = nro1+nro2;
        String resultado = String.valueOf(result);

        resultext.setText("Resultado: "+resultado);
    }

    public void restar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);
        double result = nro1-nro2;
        String resultado = String.valueOf(result);

        resultext.setText("Resultado: "+resultado);
    }

    public void mult(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);
        double result = nro1*nro2;
        String resultado = String.valueOf(result);

        resultext.setText("Resultado: "+resultado);
    }

    public void dividir(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);
        double result = nro1/nro2;
        String resultado = String.valueOf(result);

        resultext.setText("Resultado: "+resultado);
    }

}
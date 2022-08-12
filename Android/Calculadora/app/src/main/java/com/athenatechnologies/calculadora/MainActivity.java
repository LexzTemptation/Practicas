package com.athenatechnologies.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button suma;
    private Button resta;
    private Button multiplicaicion;
    private Button division;
    private TextView num1;
    private TextView num2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultado  = findViewById(R.id.resultado);
        suma = findViewById(R.id.suma);
    }

    private void suma(View view)
    {
        float resultadoNum = Float.parseFloat(num1.getText().toString()) + Float.parseFloat(num2.getText().toString());
        resultado.setText(resultadoNum + " ");
    }
    private void resta(View view)
    {
        float resultado = Float.parseFloat(num1.getText().toString()) - Float.parseFloat(num2.getText().toString());
    }
    private void mult(View view)
    {
        float resultado = Float.parseFloat(num1.getText().toString()) * Float.parseFloat(num2.getText().toString());
    }
    private void div(View view)
    {
        float resultado = Float.parseFloat(num1.getText().toString()) / Float.parseFloat(num2.getText().toString());
    }

}
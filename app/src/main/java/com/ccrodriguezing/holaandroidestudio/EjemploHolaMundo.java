package com.ccrodriguezing.holaandroidestudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EjemploHolaMundo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_hola_mundo);
    }
    public void sumar(View myView){
        EditText myTexto1 = (EditText) findViewById(R.id.editText);
        EditText myTexto2 = (EditText) findViewById(R.id.editText2);
        EditText myTexto3 = (EditText) findViewById(R.id.editText3);
        int num1= Integer.parseInt(myTexto1.getText().toString());
        int num2= Integer.parseInt(myTexto2.getText().toString());
        int x= num1+num2;

        myTexto3.setText("El resultado es"+x);
    }
    public void restar(View myView){
        EditText myTexto1 = (EditText) findViewById(R.id.editText);
        EditText myTexto2 = (EditText) findViewById(R.id.editText2);
        EditText myTexto3 = (EditText) findViewById(R.id.editText3);
        int num1= Integer.parseInt(myTexto1.getText().toString());
        int num2= Integer.parseInt(myTexto2.getText().toString());
        int x= num1-num2;

        myTexto3.setText("El resultado es"+x);
    }
    public void convertir(View myView){
        EditText myTexto1 = (EditText) findViewById(R.id.editText);
        EditText myTexto2 = (EditText) findViewById(R.id.editText2);
        EditText myTexto3 = (EditText) findViewById(R.id.editText3);
        int num1= Integer.parseInt(myTexto1.getText().toString());
        int num2= Integer.parseInt(myTexto2.getText().toString());
        int x= (num1*9/5)+32;

        myTexto3.setText("El resultado es"+x);
    }
}

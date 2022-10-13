package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textoPantalla1;
    private Formulario formul;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoPantalla1 = findViewById(R.id.textView);
        formul = new Formulario("bmw",2022,"verde","WBJ208",2,2500);
    }
public void irAEncuesta (View View){
        Intent i = new Intent(this,Encuesta.class);
        startActivity(i);
    }
}

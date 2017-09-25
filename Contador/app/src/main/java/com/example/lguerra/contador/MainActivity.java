package com.example.lguerra.contador;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaracion de variables
    public int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
    }

    // Metodos de los botones

    public void incrementa (View vista){
        contador++;
        mostrarResultado();
    }

    public void decrementa (View vista){
        contador--;
        mostrarResultado();
    }

    public void reset (View vista){
        contador = 0;
        mostrarResultado();
    }

    public void mostrarResultado(){
        TextView textoResultado = (TextView) findViewById(R.id.showCount);
        textoResultado.setText("" + contador);

    }




}

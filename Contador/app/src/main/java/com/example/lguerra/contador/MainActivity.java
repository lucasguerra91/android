package com.example.lguerra.contador;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaracion de variables
    public int contador;
    TextView texto_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        texto_resultado = (TextView) findViewById(R.id.showCount);
    }

    // Metodos de los botones

    public void incrementa (View vista){
        contador++;
        texto_resultado.setText("" + contador);
    }

    public void decrementa (View vista){
        contador--;
        if (contador<0){
            CheckBox negativos = (CheckBox) findViewById(R.id.negativos);
            if (!negativos.isChecked()){
                   contador = 0;
            }
        }
        texto_resultado.setText("" + contador);
    }

    public void reset (View vista){
        // Recupero el editText y lo guardo en una variable
        EditText numero_reset = (EditText) findViewById(R.id.n_reseteo);

        // Asigno ese valor a contador
        contador = Integer.parseInt(numero_reset.getText().toString());
        
        // Limpio la variable
        numero_reset.setText("");

        // Reseteo el campo resultado con el numero cargado
        texto_resultado.setText(""+contador);

    }





    /* Este metodo no contempla el checkbox de los negativos
    public void mostrarResultado(){
        TextView textoResultado = (TextView) findViewById(R.id.showCount);
        textoResultado.setText("" + contador);

    }
    */




}

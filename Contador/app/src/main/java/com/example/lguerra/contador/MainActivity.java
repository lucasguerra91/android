package com.example.lguerra.contador;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.view.inputmethod.InputMethodManager;
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

        // Asigno ese valor a contador capturando errores, como por ejemplo que no se cambie el valor de 0
        try{contador = Integer.parseInt(numero_reset.getText().toString());
        }catch (Exception e){
            contador = 0;
        }


        // Limpio la variable
        numero_reset.setText("");

        // Reseteo el campo resultado con el numero cargado
        texto_resultado.setText(""+contador);

        InputMethodManager miteclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        // Buscar en la Api
        miteclado.hideSoftInputFromWindow(numero_reset.getWindowToken() , 0  );



    }





    /* Este metodo no contempla el checkbox de los negativos
    public void mostrarResultado(){
        TextView textoResultado = (TextView) findViewById(R.id.showCount);
        textoResultado.setText("" + contador);

    }
    */




}

package com.example.usuario.lollyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    EditText edditText;
    TextView textView;

    //Declaración de variables a enviar
    private EditText campoNombre;
    private Button botonEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancia de parámetros a enviar
        campoNombre = (EditText) findViewById(R.id.nombre);
        botonEnviar = (Button)findViewById(R.id.enviar);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Objeto para enviar datos de una clase a otra
                Intent i = new Intent(MainActivity.this,MainActivity2Activity.class);
                //Variables a enviar, identificador y valor
                i.putExtra("nombre",campoNombre.getText()+"");
                startActivity(i);
            }
        });

    }

    public void onClic(View view){
        edditText =(EditText) findViewById(R.id.editText);
        textView =(TextView) findViewById(R.id.textView);

        String s = edditText.getText().toString();

        textView.setText("Hola" +s);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

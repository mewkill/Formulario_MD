package com.example.usuario.lollyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2Activity extends Activity {
    private TextView campoNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        campoNombre = (TextView)findViewById(R.id.nombreRecibido);

        //Capturamos los valores recibidos
        String nombre = getIntent().getStringExtra("nombre");

        //Asignamos valores a los textField
        campoNombre.setText(nombre);



        /*Bundle parametros = getIntent().getExtras();
        String s = parametros.getString("Nombre");

        TextView tv_contenido =(TextView) findViewById(R.id.textView);
        tv_contenido.setText(s);*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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

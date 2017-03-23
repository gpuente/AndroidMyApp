package com.guillermopuente.myapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.guillermopuente.myapp.model.Alumno;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Alumno alumno = new Alumno();
        alumno.setNombre("Guillermo Puente");
        alumno.setFechaNacimiento(new Date());
        alumno.setNumeroCuenta(115632114);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Nombre del alumno: " + alumno.getNombre(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    /*
    *---------------------------------------------------------------
    * Enviar Datos
    *---------------------------------------------------------------
    *
    * Obtiene el dato ingresado en el view EditText name y lo imprime dentro de un mensaje Toast
    *
    */
    public void enviarDatos(View view){
        EditText edtNombre = (EditText) findViewById(R.id.name);
        String nombre = edtNombre.getText().toString();

        Toast.makeText(getBaseContext(), "Felicidades tu nombre es " + nombre, Toast.LENGTH_LONG).show();
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

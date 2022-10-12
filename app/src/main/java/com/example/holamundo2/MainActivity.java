package com.example.holamundo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText paterno =findViewById(R.id.editTextTextPersonName);
        EditText materno =findViewById(R.id.editTextTextPersonName2);
        EditText nombre =findViewById(R.id.editTextTextPersonName3);
        EditText colegio =findViewById(R.id.editTextTextPersonName5);
        EditText carrera =findViewById(R.id.editTextTextPersonName6);
        EditText fecha1 =findViewById(R.id.editTextDate);
        Button registrar = findViewById(R.id.button);
        Button listar = findViewById(R.id.button2);

        ArrayList<String> lista=new ArrayList<String>();

        registrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String paterno1 = paterno.getText().toString();
                String materno1 = materno.getText().toString();
                String nombre1 = nombre.getText().toString();
                String colegio1 = colegio.getText().toString();
                String carrera1 = carrera.getText().toString();
                String fecha2 = fecha1.getText().toString();
                Log.d("","Apellido Paterno: "+paterno1+" -- Apellido Materno: "+materno1+" -- nombre: "+nombre1+" -- Fecha de Nacimeinto: "+fecha2+" -- Colegio: "+colegio1+" -- Carrera: "+carrera1);
                lista.add("Apellido Paterno: "+paterno1+" -- Apellido Materno: "+materno1+" -- nombre: "+nombre1+" -- Fecha de Nacimeinto: "+fecha2+" -- Colegio: "+colegio1+" -- Carrera: "+carrera1);

            }
        });

        listar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                for (int i=0; i<lista.size();i++){
                    Log.i("", "" + lista.get(i) );
                }
            }
        });
    }
}
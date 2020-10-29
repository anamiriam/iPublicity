package com.example.ipublicity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_datos);
    }

    public void Iniciar(View view) {
        Intent iniciar = new Intent(this, DatosGuardados.class);
        startActivity(iniciar);
    }

}
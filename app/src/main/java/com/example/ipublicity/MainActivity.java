package com.example.ipublicity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //metodo para el boton iniciar
    public void Iniciar(View view){
        Intent iniciar = new Intent(this, AceptarRechazar.class);
        startActivity(iniciar);
    }
}
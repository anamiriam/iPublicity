package com.example.ipublicity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cupon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupon);

    }
    public void Iniciar(View view) {
        Intent iniciar = new Intent(this, ConceptoCupon.class);
        startActivity(iniciar);
    }
}
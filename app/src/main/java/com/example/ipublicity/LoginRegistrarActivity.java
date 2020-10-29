package com.example.ipublicity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginRegistrarActivity extends AppCompatActivity {

    Button btn_aceptarcuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_registrar);

        btn_aceptarcuenta=findViewById(R.id.btn_aceptarcuenta);

        btn_aceptarcuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginRegistrarActivity.this, "Información guardada con éxito", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginRegistrarActivity.this, MenuActivity.class));
                finish();
            }
        });
    }
}

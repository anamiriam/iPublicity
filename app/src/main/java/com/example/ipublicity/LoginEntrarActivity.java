package com.example.ipublicity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginEntrarActivity extends AppCompatActivity {
    Button btn_entrar_cuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_entrar);

        btn_entrar_cuenta=findViewById(R.id.btn_entrar_cuenta);

        btn_entrar_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginEntrarActivity.this, MenuActivity.class));
                finish();
            }
        });
    }
}

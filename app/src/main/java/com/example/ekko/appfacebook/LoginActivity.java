package com.example.ekko.appfacebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;
    Button buttonCreateAcount;
    Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextEmail  = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword  = (EditText) findViewById(R.id.editTextPassword);

        buttonCreateAcount = (Button)findViewById(R.id.ButtonCreateAcount);
        buttonLogin = (Button)findViewById(R.id.ButtonLogIn);

        editTextEmail.setFocusable(false);
        editTextPassword.setFocusable(false);

        editTextEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,Login2Actiity.class);
                startActivity(i);
            }
        });
        editTextPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,Login2Actiity.class);
                startActivity(i);
            }
        });

        buttonCreateAcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });



    }

    void irMenu(){
        Intent i = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(i);
    }
}

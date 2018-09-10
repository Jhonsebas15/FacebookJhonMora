package com.example.ekko.appfacebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Login2Actiity extends AppCompatActivity {

    Button buttonCreateAcount;
    Button buttonLogin2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2_actiity);

        buttonCreateAcount = (Button)findViewById(R.id.CreateAccountButton2);
        buttonLogin2 = (Button)findViewById(R.id.loginButton2);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        buttonCreateAcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();

            }
        });
        buttonLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();

            }
        });

    }

    void ShowToast(String text){
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }
    void irMenu(){
        Intent i = new Intent(Login2Actiity.this,MainActivity.class);
        startActivity(i);
    }
}

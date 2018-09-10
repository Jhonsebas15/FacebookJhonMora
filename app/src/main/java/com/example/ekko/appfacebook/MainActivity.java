package com.example.ekko.appfacebook;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ImageButton imageButtonMessenger;
    private LinearLayout linearContacto;
    private LinearLayout linearPrincipal;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    LinearLayout.LayoutParams paramsLinear1 = (LinearLayout.LayoutParams) linearPrincipal.getLayoutParams();
                    paramsLinear1.weight = 1f;
                    linearPrincipal.setLayoutParams(paramsLinear1);


                    LinearLayout.LayoutParams paramsLinear = (LinearLayout.LayoutParams) linearContacto.getLayoutParams();
                    paramsLinear.weight = 0f;
                    linearContacto.setLayoutParams(paramsLinear);


                    return true;
                case R.id.navigation_dashboard:
                    LinearLayout.LayoutParams paramsLinear3 = (LinearLayout.LayoutParams) linearContacto.getLayoutParams();
                    paramsLinear3.weight = 1f;
                    linearContacto.setLayoutParams(paramsLinear3);

                    LinearLayout.LayoutParams paramsLinear4 = (LinearLayout.LayoutParams) linearPrincipal.getLayoutParams();
                    paramsLinear4.weight = 0f;
                    linearPrincipal.setLayoutParams(paramsLinear4);


                    return true;
                case R.id.navigation_notifications:

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearContacto =(LinearLayout)findViewById(R.id.LayoutContactos);
        linearPrincipal =(LinearLayout)findViewById(R.id.LinearPrincipal);
        imageButtonMessenger = (ImageButton)findViewById(R.id.imageButtonMessengerApp);

        // cierra el teclado al inicar
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );

        //--------------------------------- incia con la ventana principal
        LinearLayout.LayoutParams paramsLinear1 = (LinearLayout.LayoutParams) linearPrincipal.getLayoutParams();
        paramsLinear1.weight = 1f;
        linearPrincipal.setLayoutParams(paramsLinear1);


        LinearLayout.LayoutParams paramsLinear = (LinearLayout.LayoutParams) linearContacto.getLayoutParams();
        paramsLinear.weight = 0f;
        linearContacto.setLayoutParams(paramsLinear);
        //----------------

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        imageButtonMessenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                PackageManager managerclock = getPackageManager();
                i = managerclock.getLaunchIntentForPackage("com.facebook.orca");
                i.addCategory(Intent.CATEGORY_LAUNCHER);
                startActivity(i);
            }
        });


    }
    void ShowToast(String text){
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }

}

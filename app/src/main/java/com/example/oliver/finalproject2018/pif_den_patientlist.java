package com.example.oliver.finalproject2018;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class pif_den_patientlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pif_den_patientlist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageButton add_den_btn=findViewById(R.id.btn_add_den_patient);

        add_den_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getApplication().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
                {
                    // Portrait Mode
                    Intent i1=new Intent(getApplicationContext(),add_den_p.class);
                    startActivity(i1);

                } else {
                    // Landscape Mode
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.den_placeholder, new den_p_Frag());
                    ft.commit();
                }
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}

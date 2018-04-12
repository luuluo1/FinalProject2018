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
import android.widget.ListView;

public class pif_opt_patientList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pif_opt_patient_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView opt_list=findViewById(R.id.list_opt_patients);

       ImageButton ib_add_opt=findViewById(R.id.btn_add_opt);

        ib_add_opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getApplication().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
                {
                    // Portrait Mode
                    Intent i1=new Intent(getApplicationContext(),add_opt_p.class);
                    startActivity(i1);

                } else {
                    // Landscape Mode
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.opt_placeholder, new opt_p_Frag());
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

}}

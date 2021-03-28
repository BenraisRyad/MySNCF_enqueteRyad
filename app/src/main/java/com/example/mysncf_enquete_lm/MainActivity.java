package com.example.mysncf_enquete_lm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private ImageButton imgRerA, imgRerB, imgRerC, imgRerD, imgRerE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.imgRerA =(ImageButton) findViewById(R.id.idRerA);
        this.imgRerB =(ImageButton) findViewById(R.id.idRerB);
        this.imgRerC =(ImageButton) findViewById(R.id.idRerC);
        this.imgRerD =(ImageButton) findViewById(R.id.idRerD);
        this.imgRerE =(ImageButton) findViewById(R.id.idRerE);
        this.imgRerA.setOnClickListener(this);
        this.imgRerB.setOnClickListener(this);
        this.imgRerC.setOnClickListener(this);
        this.imgRerD.setOnClickListener(this);
        this.imgRerE.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
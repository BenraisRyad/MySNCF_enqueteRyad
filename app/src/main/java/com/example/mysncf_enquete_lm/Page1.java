package com.example.mysncf_enquete_lm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Page1 extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup rgPonctualiter, rgPropreter;
    private Button btSuivant;
    private String rer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        this.btSuivant = (Button) findViewById(R.id.idSuivant1);
        this.rgPonctualiter = (RadioGroup) findViewById(R.id.idPonctualiter);
        this.rgPropreter = (RadioGroup ) findViewById (R.id.idPropreter);
        this.rer = this.getIntent().getStringExtra("rer").toString();

        this.btSuivant.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.idSuivant1)
        {
            // on calcule le score des réponse

            // on passe à la page suivante
            Intent unIntent = new Intent ( this, Page2.class);
            unIntent.putExtra("rer", this.rer);
            this.startActivity(unIntent);
        }
    }
}
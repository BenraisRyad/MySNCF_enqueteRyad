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
    private String rer, nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        this.btSuivant = (Button) findViewById(R.id.idSuivant1);
        this.rgPonctualiter = (RadioGroup) findViewById(R.id.idPonctualiter);
        this.rgPropreter = (RadioGroup ) findViewById (R.id.idPropreter);
        this.rer = this.getIntent().getStringExtra("rer").toString();
        this.nom = this.getIntent().getStringExtra("nom").toString();
        this.btSuivant.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.idSuivant1)
        {
            // on calcule le score des réponse
            int score =0;
                    switch (this.rgPonctualiter.getCheckedRadioButtonId())
                    {
                        case R.id.idPonctualiter1 : score = 16; break;
                        case R.id.idPonctualiter2 : score = 12; break;
                        case R.id.idPonctualiter3 : score = 8; break;
                    }
                    SNCF.getEnquete(this.rer).getCandidat(this.nom).ajouterReponse("ponctualiter", score);

            score =0;
            switch (this.rgPropreter.getCheckedRadioButtonId())
            {
                case R.id.idPropreter1 : score = 16; break;
                case R.id.idPropreter2 : score = 12; break;
                case R.id.idPropreter3 : score = 8; break;
            }
            SNCF.getEnquete(this.rer).getCandidat(this.nom).ajouterReponse("propreter", score);


            // on passe à la page suivante
            Intent unIntent = new Intent ( this, Page2.class);
            unIntent.putExtra("rer", this.rer);
            unIntent.putExtra("nom", this.nom);
            this.startActivity(unIntent);
        }
    }
}
package com.example.mysncf_enquete_lm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Page2 extends AppCompatActivity implements View.OnClickListener
{
    private RadioGroup rgInformatique, rgService;
    private Button btTerminer;
    private String rer, nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        this.rgInformatique = (RadioGroup) findViewById(R.id.idInformation);
        this.rgService = (RadioGroup) findViewById(R.id.idService);
        this.btTerminer = (Button ) findViewById (R.id.idTerminer);
        this.rer = this.getIntent().getStringExtra("rer").toString();
        this.nom = this.getIntent().getStringExtra("nom").toString();

        this.btTerminer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.idTerminer)
        {
            // on calcule le score des réponse
            int score =0;
            switch (this.rgInformatique.getCheckedRadioButtonId())
            {
                case R.id.idInformation1 : score = 16; break;
                case R.id.idInformation2 : score = 12; break;
                case R.id.idInformation3 : score = 8; break;
            }
            SNCF.getEnquete(this.rer).getCandidat(this.nom).ajouterReponse("Information", score);

            score =0;
            switch (this.rgService.getCheckedRadioButtonId())
            {
                case R.id.idService1 : score = 16; break;
                case R.id.idService2 : score = 12; break;
                case R.id.idService3 : score = 8; break;
            }
            SNCF.getEnquete(this.rer).getCandidat(this.nom).ajouterReponse("Service", score);

            // on passe à la page suivante
            Intent unIntent = new Intent(this, Fin.class);
            unIntent.putExtra("rer", this.rer);
            unIntent.putExtra("nom",this.nom);
            this.startActivity(unIntent);
        }
    }
}
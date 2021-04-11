package com.example.mysncf_enquete_lm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Fin extends AppCompatActivity implements View.OnClickListener {
    private TextView tvTitre;
    private ImageView imgSmiley;
    private Button btResultats ;
    private String rer, nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin);
        this.btResultats = (Button) findViewById(R.id.idResultats);
        this.tvTitre = (TextView) findViewById(R.id.idTitre);
        this.imgSmiley = (ImageView) findViewById(R.id.idSmiley);
        this.rer = this.getIntent().getStringExtra("rer").toString();
        this.nom = this.getIntent().getStringExtra("nom").toString();
        this.btResultats.setOnClickListener(this);

        float moyenne =SNCF.getEnquete(this.rer).getCandidat(this.nom).moyenne();
        this.tvTitre.setText(this.nom + "Merci d'avoir participer, vous avez eu"+ moyenne);

        if (moyenne <= 10 ){
            this.imgSmiley.setImageResource(R.drawable.smiley_3);
        }
        else if (moyenne <=14)
        {
            this.imgSmiley.setImageResource(R.drawable.smiley_2);
        }
        else
        {
            this.imgSmiley.setImageResource(R.drawable.smiley_1);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.idResultats)
        {
            Intent unIntent = new Intent(this, Resultats.class);
            unIntent.putExtra("rer", this.rer);
            this.startActivity(unIntent);
        }

    }
}
package com.example.mysncf_enquete_lm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Resultats extends AppCompatActivity implements View.OnClickListener {
    private ListView lvResultats;
    private Button btRetour;
    private String rer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultats);
        this.btRetour = (Button) findViewById(R.id.idRetour) ;
        this.lvResultats = (ListView) findViewById(R.id.idListe);
        this.rer = this.getIntent().getStringExtra("rer").toString();
        this.btRetour.setOnClickListener(this);
        //remplir la ListeView
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.idRetour)
        {
            Toast.makeText(this, "Merci d'avoir participer", Toast.LENGTH_LONG).show();
            Intent unIntent = new Intent(this, MainActivity.class);
            this.startActivity(unIntent);
        }

    }
}
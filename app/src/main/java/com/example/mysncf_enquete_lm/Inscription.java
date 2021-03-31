package com.example.mysncf_enquete_lm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Inscription extends AppCompatActivity implements View.OnClickListener
{

        private EditText txtNom, txtPrenom ;
        private Spinner spAge, spFrequence ;
        private Button btParticiper ;
        private String rer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        this.txtNom = (EditText) findViewById(R.id.idNom);
        this.txtPrenom = (EditText) findViewById(R.id.idPrenom);
        this.spAge = (Spinner) findViewById(R.id.idAge);
        this.spFrequence = (Spinner) findViewById(R.id.idFrequence);
        this.rer = this.getIntent().getStringExtra("rer").toString();
        this.btParticiper = (Button) findViewById(R.id.idParticiper);
        this.btParticiper.setOnClickListener(this);

        // remplir le spinner age
        ArrayList <String> lesAges = new ArrayList<>();
        lesAges.add ("moi de 18ans");
        lesAges.add ("18 ans - 35 ans");
        lesAges.add ("35 ans - 65 ans");
        lesAges.add ("plus de  65ans");
        ArrayAdapter unAdapterAge = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, lesAges);
        this.spAge.setAdapter(unAdapterAge);

        // remplir le spinner Frequence
        ArrayList <String> lesFrequence = new ArrayList<>();
        lesAges.add ("quotidienne");
        lesAges.add ("hebdomadaire");
        lesAges.add ("mensuelle");
        lesAges.add ("annuelle");
        ArrayAdapter unAdapterFrequence = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, lesFrequence);
        this.spAge.setAdapter(unAdapterFrequence);
     }

    @Override
    public void onClick(View v)
    //revoir pour comprendre
    {
        if (v.getId() == R.id.idParticiper)
        {
            String nom = this.txtNom.getText().toString();
            String prenom = this.txtPrenom.getText().toString();
            String age = this.spAge.getSelectedItem().toString();
            String frequence = this.spFrequence.getSelectedItem().toString();

            //on inscrit le candidat.

            //et après on passe l'entente.
        }

    }
}
package com.ceri.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        Intent intent = getIntent();

        TextView tvNom = (TextView) findViewById(R.id.tvNom);
        ImageView ivImage = (ImageView) findViewById(R.id.ivImage);
        TextView tvEspeVie = (TextView) findViewById(R.id.tvEspeVie);
        TextView tvPediodeGest = (TextView) findViewById(R.id.tvPediodeGest);
        TextView tvPoidsNaissance = (TextView) findViewById(R.id.tvPoidsNaissance);
        TextView tvPoidsAdulte = (TextView) findViewById(R.id.tvPoidsAdulte);
        EditText etStatutCons = (EditText) findViewById(R.id.etStatutCons);
        Button btnSauvegarder = (Button) findViewById(R.id.btnSauvegarder);
        
        String nom = intent.getStringExtra("AnimalName");
        Animal animal = AnimalList.getAnimal(nom);

        tvNom.setText(nom);
        ivImage.setImageResource(getResources().getIdentifier(animal.getImgFile(),"drawable",getPackageName()));
        tvEspeVie.setText(animal.getStrHightestLifespan());
        tvPediodeGest.setText(animal.getStrGestationPeriod());
        tvPoidsNaissance.setText(animal.getStrBirthWeight());
        tvPoidsAdulte.setText(animal.getStrAdultWeight());
        etStatutCons.setText(animal.getConservationStatus());

        btnSauvegarder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                String nom = ((TextView) findViewById(R.id.tvNom)).getText().toString();
                String statut = ((TextView) findViewById(R.id.etStatutCons)).getText().toString();
                AnimalList.getAnimal(nom).setConservationStatus(statut);
            }
        });
    }
}

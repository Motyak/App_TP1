package com.ceri.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        Intent intent = getIntent();
        TextView tv = (TextView) findViewById(R.id.text_view);
        tv.setText(intent.getStringExtra("AnimalName"));
    }
}

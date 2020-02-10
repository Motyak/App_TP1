package com.ceri.tp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private String[] labels = AnimalList.getNameArray();
//    private ArrayList<String> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView rvAnimaux = findViewById(R.id.rvAnimaux);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, labels);
        rvAnimaux.setAdapter(adapter);
        rvAnimaux.setLayoutManager(new LinearLayoutManager(this));
        rvAnimaux.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rvAnimaux.setHasFixedSize(true);//
    }
}

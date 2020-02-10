package com.ceri.tp1;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";

    private Context context;
    private String[] labels;


    public RecyclerViewAdapter(Context context, String[] labels) {
        this.context = context;
        this.labels = labels;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        String item = labels[position];
        Animal animal = AnimalList.getAnimal(item);

        ((ViewHolder) holder).image.setImageResource(context.getResources().getIdentifier(animal.getImgFile()+"_icon","drawable",context.getPackageName()));
        ((ViewHolder) holder).nom.setText(item);
        ((ViewHolder) holder).parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on : "+labels[position]);
//                Toast.makeText(context, labels[position],Toast.LENGTH_LONG).show();

                Intent intent = new Intent(v.getContext(),AnimalActivity.class);
                intent.putExtra("AnimalName",labels[position]);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return labels.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView nom;
        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            nom = itemView.findViewById(R.id.label);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }
}

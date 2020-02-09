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


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvAnimaux = (RecyclerView) findViewById(R.id.rvAnimaux);
        rvAnimaux.setHasFixedSize(true);
        rvAnimaux.setLayoutManager(new LinearLayoutManager(this));
        rvAnimaux.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rvAnimaux.setAdapter(new IconicAdapter());
    }

    class IconicAdapter extends RecyclerView.Adapter<RowHolder> {
        @Override
        public RowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new RowHolder(getLayoutInflater().inflate(R.layout.row, parent, false));
        }

        @Override
        public void onBindViewHolder(RowHolder holder, int position) {
            holder.bindModel(AnimalList.getNameArray()[position]);
        }

        @Override
        public int getItemCount() {
            return AnimalList.getNameArray().length;
        }
    }

    static class RowHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView label = null;
        ImageView icon = null;

        RowHolder(View row) {
            super(row);

            label = (TextView) row.findViewById(R.id.label);
            icon = (ImageView) row.findViewById(R.id.icon);
        }

        @Override
        public void onClick(View v) {
            String item = label.getText().toString();
            System.out.println(item);//
//            Intent intent = new Intent(MainActivity.this,AnimalActivity.class);
//            intent.putExtra("AnimalName",item);
//            startActivity(intent);
        }

        void bindModel(String item) {
            label.setText(item);
        }
    }
}

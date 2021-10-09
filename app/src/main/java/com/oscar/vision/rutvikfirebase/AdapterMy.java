package com.oscar.vision.rutvikfirebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterMy extends RecyclerView.Adapter<AdapterMy.Hodler> {

    MainActivity a;

    public AdapterMy(MainActivity activity){
        a = activity;
    }

    @NonNull
    @Override
    public Hodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Hodler(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Hodler holder, int position) {
        holder.t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.callMethod();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class Hodler extends RecyclerView.ViewHolder{

        TextView t;

        public Hodler(@NonNull View itemView) {
            super(itemView);

            t = itemView.findViewById(R.id.textView);
        }
    }

}

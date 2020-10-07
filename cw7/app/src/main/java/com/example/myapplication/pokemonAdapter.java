package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class pokemonAdapter extends RecyclerView.Adapter {
    ArrayList<pokemon> list;
    Context context;

    public pokemonAdapter(ArrayList<pokemon> list,Context context){
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img.setImageResource(list.get(position).getImage());
        ((ViewHolder)holder).name.setText(list.get(position).getName());
        ((ViewHolder)holder).number.setText(list.get(position).getTotal()+"");

    }

    @Override
    public int getItemCount() {
        return list.size();

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView name;
        public TextView number;
        public View view;
        public View total;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            total = itemView.findViewById(R.id.textView2);
            number = itemView.findViewById(R.id.textView4);

        }
    }
}

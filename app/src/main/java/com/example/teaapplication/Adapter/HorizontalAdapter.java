package com.example.teaapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaapplication.Model.TeaModels;
import com.example.teaapplication.R;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.TeaViewHolder> {

    List<TeaModels> teaModelsList;
    Context context;

    public HorizontalAdapter(List<TeaModels> teaModelsList, Context context) {
        this.teaModelsList = teaModelsList;
        this.context = context;
    }

    @NonNull
    @Override
    public TeaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.myitemlist_1, parent, false);
        return new TeaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TeaViewHolder holder, int position) {
        TeaModels teaModels = teaModelsList.get(position);
        holder.textView.setText(teaModels.getTeaname());
        holder.imageView.setImageResource(teaModels.getTeaimage());
    }

    @Override
    public int getItemCount() {
        return teaModelsList.size();
    }

    public static class TeaViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public TeaViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.teanames);
            imageView = itemView.findViewById(R.id.teaimage);
        }
    }
}
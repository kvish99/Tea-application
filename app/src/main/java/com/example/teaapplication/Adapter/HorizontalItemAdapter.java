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

public class HorizontalItemAdapter extends RecyclerView.Adapter<HorizontalItemAdapter.TeaViewHolder> {

    List<TeaModels> teaModelsList;
    Context context;

    public HorizontalItemAdapter(List<TeaModels> teaModelsList, Context context) {

        this.teaModelsList = teaModelsList;
        this.context = context;
    }

    @NonNull
    @Override
    public HorizontalItemAdapter.TeaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.myitemlist_2, parent, false);
        return new TeaViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalItemAdapter.TeaViewHolder holder, int position) {
        TeaModels teaModels = teaModelsList.get(position);
        holder.textView1.setText(teaModels.getTeaname());
      //  holder.textView2.setText(teaModels.getTeaname());
        holder.imageView.setImageResource(teaModels.getTeaimage());

    }

    @Override
    public int getItemCount() {
        return teaModelsList.size();
    }

    public static class TeaViewHolder extends RecyclerView.ViewHolder {

        TextView textView1,textView2;

        ImageView imageView;


        public TeaViewHolder(@NonNull View itemView) {
            super(itemView);


            textView1 = itemView.findViewById(R.id.list2);
         //   textView2 = itemView.findViewById(R.id.listitem2);
            imageView = itemView.findViewById(R.id.imagelist2);


        }
    }
}

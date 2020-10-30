package com.example.travel.accommodation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.travel.R;

import java.util.List;

public class AccommodationAdapter extends  RecyclerView.Adapter<AccommodationAdapter.MyViewHolder>{
    private List<Accommodation> accommodationList;

    public AccommodationAdapter(List<Accommodation> accommodationList){
        this.accommodationList = accommodationList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.accommodation_item,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Accommodation accommodation = accommodationList.get(position);
        holder.name2.setText(accommodation.getName2());
        holder.explanation2.setText(accommodation.getExplantation2());
        holder.a_picture.setImageResource(accommodation.getA_picture());
    }

    @Override
    public int getItemCount() {
        return accommodationList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView a_picture;
        public TextView name2, explanation2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            a_picture = itemView.findViewById(R.id.a_picture);
            name2 = itemView.findViewById(R.id.name2);
            explanation2 = itemView.findViewById(R.id.explantation2);

        }
    }
}

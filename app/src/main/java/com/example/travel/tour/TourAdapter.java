package com.example.travel.tour;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travel.R;

import java.util.List;

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.MyViewHolder>{
    private List<Tour> tourList;

    public TourAdapter(List<Tour> tourList){
        this.tourList = tourList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tour_item,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Tour tour = tourList.get(position);
        holder.name.setText(tour.getName());
        holder.country.setText(tour.getCountry());
        holder.explanation.setText(tour.getExplanation());
    }

    @Override
    public int getItemCount() {
        return tourList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name, country, explanation;
        public ImageView tour_picture;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tour_picture = itemView.findViewById(R.id.tour_picture);
            name = itemView.findViewById(R.id.name);
            country = itemView.findViewById(R.id.country);
            explanation = itemView.findViewById(R.id.explanation);
        }

    }

}

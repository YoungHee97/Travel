package com.example.travel.tour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.travel.R;

import java.util.ArrayList;
import java.util.List;

public class Tour_list extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Tour> tourList = new ArrayList<>();
    private TourAdapter tAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        recyclerView = findViewById(R.id.recycler_view);
        tAdapter = new TourAdapter(tourList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new ItemDeco(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(tAdapter);
        prepareTourData();
    }

    private void prepareTourData(){
        Tour tour = new Tour("에펠탑","프랑스","파리에서 가장 높은 건축물이며, 매년 수백만 명이 방문할 만큼 세계적인 유료 관람지이다.");
        tourList.add(tour);

        tour = new Tour("타지마할","인도","아름답다");
        tourList.add(tour);

        tour = new Tour("마추 픽추","페루","아름답다");
        tourList.add(tour);

        tAdapter.notifyDataSetChanged();
    }
}
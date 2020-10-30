package com.example.travel.accommodation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.travel.R;

import java.util.ArrayList;
import java.util.List;

public class Accommodation_list extends AppCompatActivity {
    private RecyclerView recyclerView2;
    private List<Accommodation> accommodationList = new ArrayList<>();
    private AccommodationAdapter aAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accommodation_list);
        recyclerView2 = findViewById(R.id.recycler_view2);
        aAdapter = new AccommodationAdapter(accommodationList);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView2.setAdapter(aAdapter);
        prepareTourData2();
    }

    private  void prepareTourData2(){
        Accommodation accommodation = new Accommodation(R.drawable.a_1,"그랜드 하얏트 - 프레지덴셜 스위트","유수의 국빈 및 유명인사들이 방문한 곳으로 초고층에서 서울 도심 전망을 즐길 수 있는 객실 면적 325㎡ 의 호텔 최고급 스위트입니다. 개인 휘트니스룸 및 서재, 드레스룸과 주방, 다이닝룸 등 목적에 맞는 개별 공간의 효율성이 돋보이며, 시대를 거스르지 않는 아름다움을 즐길 수 있는 공간입니다.");
        accommodationList.add(accommodation);

        aAdapter.notifyDataSetChanged();
    }

}
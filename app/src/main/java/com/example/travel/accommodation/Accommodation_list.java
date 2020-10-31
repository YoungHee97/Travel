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
        Accommodation accommodation = new Accommodation(R.drawable.a_1,"그랜드 하얏트 - 프레지덴셜 스위트",
                "유수의 국빈 및 유명인사들이 방문한 곳으로 초고층에서 서울 도심 전망을 즐길 수 있는 객실 면적 325㎡ 의 호텔 최고급 스위트입니다. 개인 휘트니스룸 및 서재, 드레스룸과 주방, 다이닝룸 등 목적에 맞는 개별 공간의 효율성이 돋보이며, 시대를 거스르지 않는 아름다움을 즐길 수 있는 공간입니다.");
        accommodationList.add(accommodation);

        accommodation = new Accommodation(R.drawable.a_2,"신라호텔 - 프레지덴셜 스위트",
                "프레지덴셜 스위트는 서울신라호텔 최고의 객실로 전세계 국빈과 VIP 고객만을 위한 객실 입니다.");
        accommodationList.add(accommodation);

        accommodation = new Accommodation(R.drawable.a_3,"버즈 알 아랍 주메이라",
                "중동의 두바이 호텔이고 바닷가와 좋은 야경을 감상할 수 있다.");
        accommodationList.add(accommodation);

        accommodation = new Accommodation(R.drawable.a_4,"Grand Hyatt - 프레지덴셜 스위트",
                "프레지 덴셜 스위트는 한강과 남산의 숨막히는 파노라마 전망을 제공하는 동시에 고급스럽고 주거의 편안함을 자아내는 세련되고 화려한 325 제곱미터 스위트입니다. 이 스페셜티 스위트는 드물고 친밀한 경험을 위해 서울의 고급스러운 숙박 시설의 새로운 기준을 설정하는 비할 데없는 웅장 함을 제공합니다.");
        accommodationList.add(accommodation);

        accommodation = new Accommodation(R.drawable.a_5,"times square - 발코니 스위트",
                "뉴욕의 멋진 경치와 최고급 서비스와 전세계 국빈과 VIP 고객만을 위한 객실 입니다.");
        accommodationList.add(accommodation);

        aAdapter.notifyDataSetChanged();
    }

}
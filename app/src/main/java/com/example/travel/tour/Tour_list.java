package com.example.travel.tour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

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
        final GestureDetector gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });

        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
    }

    private void prepareTourData(){
        Tour tour = new Tour(R.drawable.t_0,"에펠탑","프랑스",
                "https://www.agoda.com/ko-kr/travel-guides/france/paris/the-eiffel-tower-an-architectural-wonder-in-paris?cid=1844104",
                "격자 구조로 이루어져 파리에서 가장 높은 건축물이며, 매년 수백만 명이 방문할 만큼 세계적인 유료 관람지이다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_1,"타지마할","인도",
                "http://getabout.hanatour.com/archives/135887",
                "타지마할은 세계 불가사의 건축물이고 애틋한 설화가 존재하는 매우 아름다운 건축물이다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_2,"마추 픽추","페루",
                "https://www.agoda.com/ko-kr/blog/hiking-in-peru-beginner-to-advanced-treks-to-machu-picchu-beyond?cid=1844104",
                "잉카 문명의 도시와 대자연의 아름다움을 동시의 감상 할 수 있다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_3,"만리장성","중국",
                "http://www.shoestring.kr/shoecast/asia/49_great_wall/great_wall.html",
                "우주에서 관찰할 수 있는 유일한 건축물이다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_4,"빅 벤","영국",
                "https://nopdin.tistory.com/1903","" +
                "2020년까지 보수공사로 인한 종소리를 듣지 못하지만 멋있고 근엄한 건축물이다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_5,"스톤헨지","영국",
                "https://m.blog.naver.com/PostView.nhn?blogId=miri313&logNo=221034721481&proxyReferer=https:%2F%2Fwww.google.com%2F",
                "고대시대 건설된 스톤헨지는 죽은 사람을 위한 종교적 공간인 신성한 장소였다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_6,"알함브라 궁전","스페인",
                "http://blog.eztok.co.kr/trilingual/?p=723",
                "극도로 세련된 아름다움이 있어 높이 평가받는 건물이며 그리스도교 세계와 이슬람 세계의 건축이 절충이 된 건축물이다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_7,"페트라","요르단",
                "https://m.blog.naver.com/PostView.nhn?blogId=seoulpr7555&logNo=221178997345&proxyReferer=https:%2F%2Fwww.google.com%2F",
                "바위를 깎아 만든, 암벽에 세워진 도시로 페트라라는 뜻은 바위를 뜻한다. 아름다운 산악 도시이다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_8,"피사의 사탑","이탈리아",
                "https://m.blog.naver.com/PostView.nhn?blogId=skybluenr&logNo=221220436471&proxyReferer=https:%2F%2Fwww.google.com%2F",
                "현재의 기울기의 각도는 약 5.5도이고 기울기의 진행은 여러 차례의 보수공사로 멈추었다. 흔히 중세의 세계 7대 불가사의 중 하나로 불리고 있다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_9,"자금성","중국",
                "http://www.shoestring.kr/shoecast/asia/34_beijing/beijing.html",
                "명과 청 왕조의 궁궐이다. 자금성의 규모는 궁궐로는 세계 최대의 규모이다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_10,"아야 소피아","터키",
                "http://getabout.hanatour.com/archives/166033",
                "16세기에 스페인의 세비야 대성당이 세워지기 전까지 세계 최대의 성당이기도 했다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_11,"루브르 박물관","프랑스",
                "https://kr.france.fr/ko/paris/list/7-cles-pour-reussir-sa-visite-au-louvre",
                "<모나리자>, <밀로의 비너스>, <사모트라케의 니케>가 루브르 3대 대표작이 있다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_12,"자유의 여신상","미국",
                "https://m.blog.naver.com/PostView.nhn?blogId=kores_love&logNo=220549500175&proxyReferer=https:%2F%2Fwww.google.com%2F",
                "미국의 독립 100주년을 기념하기 위해 프랑스 국민들의 모금 운동으로 증정되었으며, 1886년에 완공되었다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_13,"노이슈반슈타인 성","독일",
                "https://calisol.tistory.com/241",
                "루트비히 2세가 바그너와 그의 오페라인 로엔그린에 푹 빠진 탓에 취미로 지은 성이다.");
        tourList.add(tour);

        tour = new Tour(R.drawable.t_14,"세인트 바 실의 성당","러시아",
                "https://toytvstory.tistory.com/919",
                "모스크바 대공국의 대공이었던 이반 4세가 러시아에서 카잔 칸을 몰아낸 것을 기념하며 봉헌한 성당이다.");
        tourList.add(tour);

        tAdapter.notifyDataSetChanged();
    }
}
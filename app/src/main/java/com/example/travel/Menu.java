package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.travel.accommodation.Accommodation_list;
import com.example.travel.tour.Tour_list;

public class Menu extends AppCompatActivity {
    ImageView image, image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        image = (ImageView) findViewById(R.id.tour);
        image2 = (ImageView) findViewById(R.id.accommodation);
        final Intent intent = new Intent(this, Tour_list.class);
        final Intent intent2 = new Intent(this, Accommodation_list.class);


        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });

    }
}
package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (TextView) findViewById(R.id.main_text);
        final Intent intent = new Intent(this, Menu.class);

        text.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(intent);
            }
        });
    }

}
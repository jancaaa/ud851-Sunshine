package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent in = getIntent();
        if (in != null){
            if (in.hasExtra("weatherForDay")){
                String weatherForDay = in.getStringExtra("weatherForDay");
                TextView weatherDetailTextView = (TextView) findViewById(R.id.detail_weather_tv);
                weatherDetailTextView.setText(weatherForDay);
            }
        }
    }
}
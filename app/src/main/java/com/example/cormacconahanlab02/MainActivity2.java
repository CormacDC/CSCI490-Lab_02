package com.example.cormacconahanlab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView moon;
    ImageView waterfall;

    int imageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        moon = findViewById(R.id.imageView2);
        moon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                imageID = R.drawable.supermoon;

                finish();
            }
        });

        waterfall = findViewById(R.id.imageView);
        waterfall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                imageID = R.drawable.waterfall;

                finish();
            }
        });
    }

    @Override
    public void finish(){
        Intent intent = new Intent();
        intent.putExtra("imageID", imageID);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
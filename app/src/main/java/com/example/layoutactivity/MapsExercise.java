package com.example.layoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MapsExercise extends AppCompatActivity {

    ImageView img_1, img_2, img_3, img_4, img_5, img_show;

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        img_1 = findViewById(R.id.img1);
        img_2 = findViewById(R.id.img2);
        img_3 = findViewById(R.id.img3);
        img_4 = findViewById(R.id.img4);
        img_5 = findViewById(R.id.img5);
        img_show = findViewById(R.id.imgShow);

        title = findViewById(R.id.imgTitle);

        img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("Banaue Rice Terraces");
                img_show.setImageResource(R.drawable.banaue_rice_terraces_street_view);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:16.93211720388675, 121.05761498301825"));
                startActivity(intent);
            }
        });

        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("Bantayan Paradice Beach");
                img_show.setImageResource(R.drawable.paradise_beach_bantayan_street_view);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:11.14708769793396, 123.77912501779635"));
                startActivity(intent);
            }
        });

        img_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("Oslob Whale Watching");
                img_show.setImageResource(R.drawable.oslob_whale_shark_watching_street_view);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:9.463451422802613, 123.37973407906152"));
                startActivity(intent);
            }
        });

        img_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("Boracay White Beach");
                img_show.setImageResource(R.drawable.white_beach_boracay_street_view);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:11.95286346142203, 121.92961394492139"));
                startActivity(intent);
            }
        });

        img_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("Siargao Tropical Temple");
                img_show.setImageResource(R.drawable.siargao_tropical_temple_street_view);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:9.801538179448054, 126.15834655408304"));
                startActivity(intent);
            }
        });

    }

}
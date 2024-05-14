package com.example.layoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLayout,btnButtons, btnCalc, btnMatch, btnIntents, btnMenu, btnMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLayout = findViewById(R.id.btnLayoutEx1);
        btnButtons = findViewById(R.id.btnButtonsEx2);
        btnCalc = findViewById(R.id.btnCalculator);
        btnMatch = findViewById(R.id.btnMatch3);
        btnIntents = findViewById(R.id.btnPassingIntents);
        btnMenu = findViewById(R.id.btnMenus);
        btnMaps = findViewById(R.id.btnOpeningMaps);

        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,
                        LayoutActivity.class);

                startActivity(intent1);
            }
        });

        btnButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,
                        ButtonExercise.class);

                startActivity(intent1);
            }
        });

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent);
            }
        });

        btnMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Match3.class);
                startActivity(intent);
            }
        });

        btnIntents.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent);
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuExercise.class);
                startActivity(intent);
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapsExercise.class);
                startActivity(intent);

            }
        });
    }
}
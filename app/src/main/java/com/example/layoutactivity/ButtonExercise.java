package com.example.layoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;

import java.util.Random;

public class ButtonExercise extends AppCompatActivity {

    Button btnOpen, btnToast, btnChangeBG, btnChangeBtnBG, btnDisappear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        btnOpen = findViewById(R.id.btn_open);
        btnToast = findViewById(R.id.btnToast);
        btnChangeBG = findViewById(R.id.btnChangeBG);
        btnChangeBtnBG = findViewById(R.id.btnChangeBtnBG);
        btnDisappear = findViewById(R.id.btnDisappear);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        ButtonExercise.this,
                        ReturnBtn.class);

                startActivity(intent1);
            }
        });

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "You pressed the button. Good Job!", Toast.LENGTH_SHORT).show();
            }
        });

        btnChangeBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(getRandomColor());
            }
        });

        btnChangeBtnBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChangeBtnBG.setBackgroundColor(getRandomColor());
            }
        });

        btnDisappear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) v;
                button.setVisibility(View.GONE);
            }
        });

    }

    private int getRandomColor(){
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        return Color.rgb(red, green, blue);
    }
}
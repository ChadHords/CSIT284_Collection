package com.example.layoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Match3 extends AppCompatActivity implements View.OnClickListener {

    Button[][] buttons = new Button[5][5];
    Button btnRestart;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3);

        int ctr = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                String buttonID = "btn_" + ctr;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
                buttons[i][j].setOnClickListener(this);
                ctr++;
            }
        }

        randomize();

        btnRestart = findViewById(R.id.btn_restart);

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Match3.this, "Restart", Toast.LENGTH_SHORT).show();
                randomize();
            }
        });
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(Match3.this, "Hello!", Toast.LENGTH_SHORT).show();
    }

    public int getRandomColor(int[] colors){
        Random rand = new Random();
        return colors[rand.nextInt(colors.length)];
    }

    public void randomize(){
        int[] colors = {Color.rgb(255, 235, 51), Color.rgb(42, 227, 0), Color.rgb(2, 121, 212), Color.rgb(214, 36, 0)};

        for (Button[] btn : buttons){
            for(Button button : btn){
                button.setBackgroundTintList(ColorStateList.valueOf(getRandomColor(colors)));
                if(button.getBackgroundTintList().getDefaultColor() == Color.rgb(255, 235, 51)){
                    button.setText("Y");
                }else if(button.getBackgroundTintList().getDefaultColor() == Color.rgb(42, 227, 0)){
                    button.setText("G");
                }else if(button.getBackgroundTintList().getDefaultColor() == Color.rgb(2, 121, 212)){
                    button.setText("B");
                }else if(button.getBackgroundTintList().getDefaultColor() == Color.rgb(214, 36, 0)){
                    button.setText("R");
                }
            }
        }
    }
}
package com.example.layoutactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MenuExercise extends AppCompatActivity {

    Button btnChanger;

    boolean smol = true;

    ConstraintLayout constri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnTransformingButton);

        constri = findViewById(R.id.constraint);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choice_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.mItemChange){
            Toast.makeText(this, "Edit Object Items is clicked", Toast.LENGTH_SHORT).show();

        } else if (item.getItemId() == R.id.mItemReset) {
            Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
            btnChanger.setText("Blueberry");
            btnChanger.setBackgroundColor(Color.rgb(45, 62, 214));
//            btnChanger.setHeight(350);
//            btnChanger.setWidth(350);
            btnChanger.setScaleY(1);
            btnChanger.setScaleX(1);
            btnChanger.setAlpha(1);
            btnChanger.setTextColor(Color.rgb(255,255,255));

        } else if (item.getItemId() == R.id.mItemExit) {
            finish();

        } else if (item.getItemId() == R.id.mItemChangeColor){
            Random random = new Random();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            btnChanger.setBackgroundColor(Color.rgb(red, green, blue));

        } else if (item.getItemId() == R.id.mItemChangeTextColor) {
            Random random = new Random();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);

            btnChanger.setTextColor(Color.rgb(red, green, blue));

        } else if (item.getItemId() == R.id.mItemChangeSize) {
//            ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) btnChanger.getLayoutParams();
            if(smol) {
//                btnChanger.setWidth(500);
//                btnChanger.setHeight(500);
                smol = false;
//                Toast.makeText(this, btnChanger.getWidth()+"", Toast.LENGTH_SHORT).show();
//                btnChanger.setLayoutParams(new ConstraintLayout.LayoutParams(500, 500));
                btnChanger.setScaleX(2);
                btnChanger.setScaleY(2);
            } else {
//                btnChanger.setWidth(350);
//                btnChanger.setHeight(350);
                btnChanger.setScaleX(3);
                btnChanger.setScaleY(3);
                smol = true;
//                Toast.makeText(this, btnChanger.getWidth()+"", Toast.LENGTH_SHORT).show();
//                btnChanger.setLayoutParams(new ConstraintLayout.LayoutParams(350, 350));
            }

            // Adjust constraints (example: center horizontally and vertically)
//            params.startToStart = ConstraintLayout.LayoutParams.PARENT_ID;
//            params.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID;
//            params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//            params.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;

        } else if (item.getItemId() == R.id.mItemChangeText) {
            String[] arr = {"Apple", "Banana", "Orange"};
            Random random = new Random();
            int n = random.nextInt(arr.length);
            btnChanger.setText(arr[n]);

        } else if (item.getItemId() == R.id.mItemChangeVisibility) {
//            if(btnChanger.getVisibility() == View.VISIBLE)
//                btnChanger.setVisibility(View.GONE);
//            else btnChanger.setVisibility(View.VISIBLE);

            if(btnChanger.getAlpha() == 0.5f){
                btnChanger.setAlpha(1f);
            } else {
                btnChanger.setAlpha(0.5f);
            }
        }

        return true;
    }
}
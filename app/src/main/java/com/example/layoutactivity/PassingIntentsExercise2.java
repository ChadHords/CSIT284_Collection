package com.example.layoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    TextView tFName, tLName, tGender, tBDate, tPNumber, tEmail, tCourse, tPrevSchool, tGFName, tGLName, tGRel, tGPNum;

    Button bReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        tFName = findViewById(R.id.txtFName);
        tLName = findViewById(R.id.txtLName);
        tGender = findViewById(R.id.txtGender);
        tBDate = findViewById(R.id.txtBDate);
        tPNumber = findViewById(R.id.txtPNumber);
        tEmail = findViewById(R.id.txtEmail);
        tCourse = findViewById(R.id.txtCourse);
        tPrevSchool = findViewById(R.id.txtPreviousSchool);
        tGFName = findViewById(R.id.txtGFName);
        tGLName = findViewById(R.id.txtGLName);
        tGRel = findViewById(R.id.txtGRelationship);
        tGPNum = findViewById(R.id.txtGPNumber);
        bReturn  = (Button) findViewById(R.id.btnReturn);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String pnum = intent.getStringExtra("pnum_key");
        String email = intent.getStringExtra("email_key");
        String course = intent.getStringExtra("course_key");
        String prevschool = intent.getStringExtra("prevschool_key");
        String gfname = intent.getStringExtra("gfname_key");
        String glname = intent.getStringExtra("glname_key");
        String grel = intent.getStringExtra("grel_key");
        String gpnum = intent.getStringExtra("gpnum_key");

        tFName.setText(fname);
        tLName.setText(lname);
        tGender.setText(gender);
        tBDate.setText(bdate);
        tPNumber.setText(pnum);
        tEmail.setText(email);
        tCourse.setText(course);
        tPrevSchool.setText(prevschool);
        tGFName.setText(gfname);
        tGLName.setText(glname);
        tGRel.setText(grel);
        tGPNum.setText(gpnum);

        bReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
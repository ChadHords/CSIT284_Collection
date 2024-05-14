package com.example.layoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class PassingIntentsExercise extends AppCompatActivity implements View.OnClickListener{
    
    EditText eFName, eLName, eBDate, eNum, eMail, eCourse, ePrevSchool, eGFName, eGLName, eGRel, eGNum;
    RadioButton rMale, rFemale, rOth;
    Button btnClear, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);
        
        eFName = findViewById(R.id.etxtFName);
        eLName = findViewById(R.id.etxtLName);
        rMale = findViewById(R.id.radMale);
        rFemale = findViewById(R.id.radFemale);
        rOth = findViewById(R.id.radOthers);
        eBDate = findViewById(R.id.etxtBdate);
        eNum = findViewById(R.id.etxtPhoneNumber);
        eMail = findViewById(R.id.etxtEmailAdd);
        eCourse = findViewById(R.id.etxtCourse);
        ePrevSchool = findViewById(R.id.etxtPreviousSchool);
        eGFName = findViewById(R.id.etxtGuardianFName);
        eGLName = findViewById(R.id.etxtGuardianLName);
        eGRel = findViewById(R.id.etxtGuardianRelationship);
        eGNum = findViewById(R.id.etxtGuardianContact);

        btnClear = (Button) findViewById(R.id.btnPIClear);
        btnSubmit = (Button) findViewById(R.id.btnPISubmit);

        btnSubmit.setOnClickListener(this);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eFName.setText("");
                eLName.setText("");
                rMale.setChecked(false);
                rFemale.setChecked(false);
                rOth.setChecked(false);
                eBDate.setText("");
                eNum.setText("");
                eMail.setText("");
                eCourse.setText("");
                ePrevSchool.setText("");
                eGFName.setText("");
                eGLName.setText("");
                eGRel.setText("");
                eGNum.setText("");
                Toast.makeText(PassingIntentsExercise.this, "All Cleared", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        String fName = eFName.getText().toString();
        String lName = eLName.getText().toString();

        String gender;
        if (rMale.isChecked()){
            gender = "Male";
        } else if (rFemale.isChecked()) {
            gender = "Female";
        } else if (rOth.isChecked()) {
            gender = "Others";
        }else{
            gender = "Unknown";
        }

        String bDate = eBDate.getText().toString();
        String pNumber = eNum.getText().toString();
        String emailAdd = eMail.getText().toString();
        String course = eCourse.getText().toString();
        String prevSchool = ePrevSchool.getText().toString();
        String gFName = eGFName.getText().toString();
        String gLName = eGLName.getText().toString();
        String gRel = eGRel.getText().toString();
        String gPNumber = eGNum.getText().toString();

        Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
        intent.putExtra("fname_key",fName);
        intent.putExtra("lname_key",lName);
        intent.putExtra("gender_key",gender);
        intent.putExtra("bdate_key",bDate);
        intent.putExtra("pnum_key",pNumber);
        intent.putExtra("email_key",emailAdd);
        intent.putExtra("course_key",course);
        intent.putExtra("prevschool_key",prevSchool);
        intent.putExtra("gfname_key",gFName);
        intent.putExtra("glname_key",gLName);
        intent.putExtra("grel_key",gRel);
        intent.putExtra("gpnum_key",gPNumber);

        startActivity(intent);
    }
}
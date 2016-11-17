package com.example.ogor.tmandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student_screen extends AppCompatActivity implements View.OnClickListener {

    Button showConsultationButton_S, searchTeacherButton, searchConsultationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_screen);
        setTitle("Mobile STT - Student section");

        showConsultationButton_S = (Button) findViewById(R.id.showConsultationButton_S);
        searchTeacherButton = (Button) findViewById(R.id.searchTeacherButton);
        searchConsultationButton = (Button) findViewById(R.id.searchConsultationButton);

        showConsultationButton_S.setOnClickListener(this);
        searchTeacherButton.setOnClickListener(this);
        searchConsultationButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.showConsultationButton_S:
                Intent intentShow2 = new Intent(this, ShowConsultationStudent.class);
                startActivity(intentShow2);
                break;

            case R.id.searchTeacherButton:
                Intent intentST = new Intent(this, SearchTeacher.class);
                startActivity(intentST);
                break;

            case R.id.searchConsultationButton:
                Intent intentSC = new Intent(this, SearchConsultation.class);
                startActivity(intentSC);
                break;
        }
    }
}

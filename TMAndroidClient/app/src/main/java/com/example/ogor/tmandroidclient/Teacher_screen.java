package com.example.ogor.tmandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teacher_screen extends AppCompatActivity implements View.OnClickListener {

    Button showConsultationButton, addConsultationButton, editConsultationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_screen);
        setTitle("Mobile STT - Teacher section");

        showConsultationButton = (Button) findViewById(R.id.showConsultationButton);
        addConsultationButton = (Button) findViewById(R.id.addConsultationButton);
        editConsultationButton = (Button) findViewById(R.id.editConsultationButton);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.showConsultationButton:
                Intent intentShow = new Intent(this, ShowConsultation.class);
                startActivity(intentShow);
                break;

            case R.id.addConsultationButton:
                Intent intentAdd = new Intent(this, AddConsultation.class);
                startActivity(intentAdd);
                break;

            case R.id.editConsultationButton:
                Intent intentEdit = new Intent(this, EditConsultation.class);
                startActivity(intentEdit);
                break;
        }
    }
}

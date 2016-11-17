package com.example.ogor.tmandroidclient;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddConsultation extends AppCompatActivity implements View.OnClickListener {

    Button addConsultationButton;
    EditText nameConsultationLabel, dateOfConsultationLabel, hourConsultationLabel, yearConsultationLabel, durationConsultationLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_consultation);
        setTitle("Mobile STT - Add Consultation");

        nameConsultationLabel = (EditText) findViewById(R.id.nameConsultationLabel);
        dateOfConsultationLabel = (EditText) findViewById(R.id.dateOfConsultationLabel);
        hourConsultationLabel = (EditText) findViewById(R.id.hourConsultationLabel);
        yearConsultationLabel = (EditText) findViewById(R.id.yearConsultationLabel);
        durationConsultationLabel = (EditText) findViewById(R.id.durationConsultationLabel);

        addConsultationButton = (Button) findViewById(R.id.addConsultationButton);

        addConsultationButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        Context context = getApplicationContext();

        switch (v.getId()) {
            case R.id.addConsultationButton:


                CharSequence text = "Successfully added!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
        }
    }
}

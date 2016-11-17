package com.example.ogor.tmandroidclient;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditConsultation extends AppCompatActivity implements View.OnClickListener {

    Button saveConsultationButton;
    EditText nameConsultationLabel_S, dateOfConsultationLabel_S, hourConsultationLabel_S, yearConsultationLabel_S, durationConsultationLabel_S;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_consultation);
        setTitle("Mobile STT - Edit my consultation");

        nameConsultationLabel_S = (EditText) findViewById(R.id.nameConsultationLabel_S);
        dateOfConsultationLabel_S = (EditText) findViewById(R.id.dateOfConsultationLabel_S);
        hourConsultationLabel_S = (EditText) findViewById(R.id.hourConsultationLabel_S);
        yearConsultationLabel_S = (EditText) findViewById(R.id.yearConsultationLabel_S);
        durationConsultationLabel_S = (EditText) findViewById(R.id.durationConsultationLabel_S);

        saveConsultationButton = (Button) findViewById(R.id.saveConsultationButton);

        saveConsultationButton.setOnClickListener(this);
}


    @Override
    public void onClick(View v) {

        Context context = getApplicationContext();

        switch (v.getId()) {
            case R.id.saveConsultationButton:


                CharSequence text = "Successfully saved changes!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
        }
    }
}

package com.example.ogor.tmandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // int id = item.getItemId();

        switch(item.getItemId())
        {
            case R.id.action_settings:
                startActivity(new Intent(this, Settings.class));
                break;
            case R.id.action_logout:
                Intent intentLogout = new Intent(this, MainScreen.class);
                startActivity(intentLogout);
                break;
            case R.id.action_back:
                finish();
                break;
        }

        // if (id == R.id.action_settings) {
        ///      return true;
        // }

        return super.onOptionsItemSelected(item);
    }
}

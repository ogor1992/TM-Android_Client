package com.example.ogor.tmandroidclient;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

        showConsultationButton.setOnClickListener(this);
        addConsultationButton.setOnClickListener(this);
        editConsultationButton.setOnClickListener(this);
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

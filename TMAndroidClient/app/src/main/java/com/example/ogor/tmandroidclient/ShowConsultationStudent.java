package com.example.ogor.tmandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ShowConsultationStudent extends AppCompatActivity implements View.OnClickListener {

    Button showListButton_S;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_consultation_student);
        setTitle("Mobile STT - My Consultation");

        showListButton_S = (Button) findViewById(R.id.showListButton_S);
        showListButton_S.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.showListButton_S:
                Intent intentListShow = new Intent(this, ListOfStudents.class);
                startActivity(intentListShow);
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

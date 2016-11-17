package com.example.ogor.tmandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowConsultation extends AppCompatActivity implements View.OnClickListener {

    TextView nameShowLabel, dayOfWeekShowLabel, hourShowLabel, yearShowLabel, durationShowLabel;
    Button showListButton, showListButton2, showListButton3, quantityButton, quantityButton2, quantityButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_consultation);
        setTitle("Mobile STT - My Consultation");

        nameShowLabel = (TextView) findViewById(R.id.nameShowLabel);
        dayOfWeekShowLabel = (TextView) findViewById(R.id.dayOfWeekShowLabel);
        hourShowLabel = (TextView) findViewById(R.id.hourShowLabel);
        yearShowLabel = (TextView) findViewById(R.id.yearShowLabel);
        durationShowLabel = (TextView) findViewById(R.id.durationShowLabel);

        showListButton = (Button) findViewById(R.id.showListButton);
        showListButton2 = (Button) findViewById(R.id.showListButton2);
        showListButton3 = (Button) findViewById(R.id.showListButton3);

        quantityButton = (Button) findViewById(R.id.quantityButton);
        quantityButton2 = (Button) findViewById(R.id.quantityButton2);
        quantityButton3 = (Button) findViewById(R.id.quantityButton3);


        showListButton.setOnClickListener(this);
        quantityButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.showListButton:
                Intent intentListShow = new Intent(this, ListOfStudents.class);
                startActivity(intentListShow);
                break;
            case R.id.showListButton2:
                Intent intentListShow2 = new Intent(this, ListOfStudents.class);
                startActivity(intentListShow2);
                break;
            case R.id.showListButton3:
                Intent intentListShow3 = new Intent(this, ListOfStudents.class);
                startActivity(intentListShow3);
                break;
            case R.id.quantityButton:
                setContentView(R.layout.activity_show_consultation2);
                quantityButton.setOnClickListener(null);
                quantityButton2 = (Button) findViewById(R.id.quantityButton2);
                quantityButton2.setOnClickListener(this);
                showListButton2 = (Button) findViewById(R.id.showListButton2);
                showListButton2.setOnClickListener(this);
                break;
            case R.id.quantityButton2:
                setContentView(R.layout.activity_show_consultation3);
                quantityButton2.setOnClickListener(null);
                quantityButton3 = (Button) findViewById(R.id.quantityButton3);
                quantityButton3.setOnClickListener(this);
                showListButton2 = (Button) findViewById(R.id.showListButton2);
                showListButton3 = (Button) findViewById(R.id.showListButton3);
                showListButton2.setOnClickListener(this);
                showListButton3.setOnClickListener(this);
                break;
            case R.id.quantityButton3:
                setContentView(R.layout.activity_show_consultation);
                quantityButton3.setOnClickListener(null);
                quantityButton = (Button) findViewById(R.id.quantityButton);
                quantityButton.setOnClickListener(this);
                showListButton2.setOnClickListener(null);
                showListButton3.setOnClickListener(null);
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

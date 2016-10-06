package com.example.ogor.tmandroidclient;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity implements View.OnClickListener {

    Button showDataButtonSettings, editDataButtonSettings, logoutButtonSettings, infoButtonSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTitle("Settings");

        showDataButtonSettings = (Button) findViewById(R.id.showDataButtonSettings);
        editDataButtonSettings = (Button) findViewById(R.id.editDataButtonSettings);
        logoutButtonSettings = (Button) findViewById(R.id.logoutButtonSettings);
        infoButtonSettings = (Button) findViewById(R.id.infoButtonSettings);

        showDataButtonSettings.setOnClickListener(this);
        editDataButtonSettings.setOnClickListener(this);
        logoutButtonSettings.setOnClickListener(this);
        infoButtonSettings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.showDataButtonSettings:
                break;
            case R.id.editDataButtonSettings:
                Intent intentEDIT = new Intent(this, EditUserData.class);
                startActivityForResult(intentEDIT, 1);
                break;
            case R.id.logoutButtonSettings:
                break;
            case R.id.infoButtonSettings:
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1)
        {
            if(resultCode == Activity.RESULT_OK)
            {
            }

            if(resultCode == Activity.RESULT_CANCELED)
            {
            }
        }
    }
}

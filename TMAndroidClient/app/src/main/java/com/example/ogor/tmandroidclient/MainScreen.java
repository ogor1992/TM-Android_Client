package com.example.ogor.tmandroidclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity implements View.OnClickListener {

    TextView signInLabel;
    Button signinButton;
    Toolbar toolbar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        signinButton = (Button) findViewById(R.id.siginButton);
        signInLabel = (TextView) findViewById(R.id.signInLabel);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        setSupportActionBar(toolbar);

        signinButton.setOnClickListener(this);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.fab:
                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                        //Here we can handle right down corner button :D
                break;
            case R.id.siginButton:
                Intent intentLOG = new Intent(this, Login.class);
                startActivityForResult(intentLOG, 1);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                signInLabel.setText("You are Sign in!");
            }

            if(resultCode == Activity.RESULT_CANCELED)
            {

            }
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

                break;
        }

       // if (id == R.id.action_settings) {
      ///      return true;
       // }

        return super.onOptionsItemSelected(item);
    }
}

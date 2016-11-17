package com.example.ogor.tmandroidclient;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchTeacher extends AppCompatActivity implements View.OnClickListener {

    Button searchButton2;
    EditText searchLabel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_teacher);
        setTitle("Mobile STT - Search Teacher");

        searchButton2 = (Button) findViewById(R.id.searchButton2);
        searchLabel2 = (EditText) findViewById(R.id.searchLabel2);

        searchButton2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        Context context = getApplicationContext();

        switch (v.getId()) {
            case R.id.searchButton2:


                CharSequence text = "Successfully searched!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
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

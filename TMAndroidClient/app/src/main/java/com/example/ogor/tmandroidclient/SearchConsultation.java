package com.example.ogor.tmandroidclient;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SearchConsultation extends AppCompatActivity implements View.OnClickListener {

    Button searchButton;
    EditText searchLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_consultation);
        setTitle("Mobile STT - Search Teacher");

        searchButton = (Button) findViewById(R.id.searchButton);
        searchLabel = (EditText) findViewById(R.id.searchLabel);

        searchButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Context context = getApplicationContext();

        switch (v.getId()) {
            case R.id.searchButton:


                CharSequence text = "Successfully searched!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
        }
    }
}

package com.example.ogor.tmandroidclient;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

}

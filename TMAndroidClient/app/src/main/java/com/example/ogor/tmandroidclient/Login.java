package com.example.ogor.tmandroidclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button loginButton;
    EditText usernameLabel, passwordLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");

        usernameLabel = (EditText) findViewById(R.id.usernameLabel);
        passwordLabel = (EditText) findViewById(R.id.passwordLabel);

        loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.loginButton)
        {
            //onClick need to be implemented
        }
    }
}

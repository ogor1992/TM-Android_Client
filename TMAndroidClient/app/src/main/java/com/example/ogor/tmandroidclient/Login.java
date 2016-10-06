package com.example.ogor.tmandroidclient;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button loginButton, registerButton;
    EditText usernameLabel, passwordLabel;
    TextView resultLabelFromReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");

        resultLabelFromReg = (TextView) findViewById(R.id.resultLabelFromReg);

        usernameLabel = (EditText) findViewById(R.id.usernameLabel);
        passwordLabel = (EditText) findViewById(R.id.passwordLabel);

        loginButton = (Button) findViewById(R.id.loginButton);
        registerButton = (Button) findViewById(R.id.registerButton);

        loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.loginButton:
                Intent returnIntentLOG = new Intent();

                //setResult(Activity.RESULT_CANCELED, returnIntent); //przypadek kiedy nie uda sie zalogowac :)
                setResult(Activity.RESULT_OK, returnIntentLOG);

                finish();
                break;
            case R.id.registerButton:
                Intent intentREG = new Intent(this, Register.class);
                startActivityForResult(intentREG, 1);
                //startActivity(new Intent(this, Register.class));
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                resultLabelFromReg.setText("Now you need to Log in!");
            }

            if(resultCode == Activity.RESULT_CANCELED)
            {
            }
        }

    }
}

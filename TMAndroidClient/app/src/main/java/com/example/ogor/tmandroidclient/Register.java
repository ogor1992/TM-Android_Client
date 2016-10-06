package com.example.ogor.tmandroidclient;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener {

    EditText usernameLabelReg, emailLabelReg, passwordLabelReg, passwordLabel2Reg;
    Button registerButtonReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle("Register");

        usernameLabelReg = (EditText) findViewById(R.id.usernameLabelReg);
        emailLabelReg = (EditText) findViewById(R.id.emailLabelReg);
        passwordLabelReg = (EditText) findViewById(R.id.passwordLabelReg);
        passwordLabel2Reg = (EditText) findViewById(R.id.passwordLabel2Reg);

        registerButtonReg = (Button) findViewById(R.id.registerButtonReg);
        registerButtonReg.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Context context = getApplicationContext();

        switch(v.getId()) {
            case R.id.registerButtonReg:
                Intent returnIntentREG = new Intent();
                //setResult(Activity.RESULT_CANCELED, returnIntent); //przypadek kiedy nie uda sie zalogowac :)
                setResult(Activity.RESULT_OK, returnIntentREG);
                finish();

                CharSequence text = "Successfully registered!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
        }
    }
}

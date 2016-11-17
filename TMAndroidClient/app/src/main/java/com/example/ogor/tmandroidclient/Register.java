package com.example.ogor.tmandroidclient;

import android.app.Activity;
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

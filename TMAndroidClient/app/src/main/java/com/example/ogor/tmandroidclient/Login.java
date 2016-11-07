package com.example.ogor.tmandroidclient;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ogor.tmandroidclient.API.Rest_Api;
import com.example.ogor.tmandroidclient.model.Rest_Model;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button loginButton, registerButton;
    EditText usernameLabel, passwordLabel;
    TextView resultLabelFromReg;
    TextView resultFromGSON;

    ProgressBar progressBar;
    String API = ""; /// need to fill this URL -API    /// BASE URL

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");

        resultLabelFromReg = (TextView) findViewById(R.id.resultLabelFromReg);
        resultFromGSON = (TextView) findViewById(R.id.resultFromGSON);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        usernameLabel = (EditText) findViewById(R.id.usernameLabel);
        passwordLabel = (EditText) findViewById(R.id.passwordLabel);

        loginButton = (Button) findViewById(R.id.loginButton);
        registerButton = (Button) findViewById(R.id.registerButton);

        loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);

        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        Context context = getApplicationContext();

        switch(v.getId()){
            case R.id.loginButton:

                String user = usernameLabel.getText().toString();
                progressBar.setVisibility(View.VISIBLE);

                RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(API).build();
                Rest_Api my_api = restAdapter.create(Rest_Api.class);

                my_api.getFeed(user, new Callback<Rest_Model>() {
                    @Override
                    public void success(Rest_Model rest_model, Response response) {
                        resultFromGSON.setText("User email: " + rest_model.getLoginEmail() + " Password: " + rest_model.getPassword());
                        progressBar.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        resultFromGSON.setText(error.getMessage());
                        progressBar.setVisibility(View.INVISIBLE);
                    }
                });



                ////////////////////////////////////////////////////////////////////////////////////////
                ///// SECTION BELOW WAS IN FIRST VERSION, NOW WE NEED TO MODIFY THIS SECTION ///////////
                ////////////////////////////////////////////////////////////////////////////////////////

                //Intent returnIntentLOG = new Intent();
                //////////////////setResult(Activity.RESULT_CANCELED, returnIntent); //przypadek kiedy nie uda sie zalogowac :)
               // setResult(Activity.RESULT_OK, returnIntentLOG);
                //finish();
                CharSequence text = "Successfully log in!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
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

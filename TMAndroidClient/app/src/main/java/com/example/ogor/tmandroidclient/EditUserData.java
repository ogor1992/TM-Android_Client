package com.example.ogor.tmandroidclient;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EditUserData extends AppCompatActivity implements View.OnClickListener{

    Button saveButtonEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user_data);
        setTitle("Edit your data");

        saveButtonEdit = (Button) findViewById(R.id.saveButtonEdit);

        saveButtonEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Context context = getApplicationContext();

        switch(v.getId())
        {
            case R.id.saveButtonEdit:
                Intent returnIntentEDIT = new Intent();
                //setResult(Activity.RESULT_CANCELED, returnIntent); //przypadek kiedy nie uda sie zalogowac :)
                setResult(Activity.RESULT_OK, returnIntentEDIT);
                finish();

                CharSequence text = "Successfully edited!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
        }
    }

}

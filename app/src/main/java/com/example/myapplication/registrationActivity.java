package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registrationActivity extends AppCompatActivity {
    EditText usernameEt, phoneEt, emailEt, pass1, pass2;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        usernameEt =(EditText) findViewById(R.id.etusername);
        phoneEt =(EditText) findViewById(R.id.etphone);
        emailEt =(EditText) findViewById(R.id.etemail);
        pass1 =(EditText) findViewById(R.id.etpass1);
        pass2 =(EditText) findViewById(R.id.etpass2);
        submitButton = (Button) findViewById( R.id.submitbtn);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
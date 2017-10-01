package com.example.dell.myandroid1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private EditText mUsernameEditText;
     private EditText mPasswordEditText;
     private Button mLoginButton;

    private CheckBox mCheckbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Storagehandler.isChecked(this))
        {
            startActivity(new Intent(this,HomeActivity.class));
            finish();
        }




        setContentView(R.layout.activity_main);


        mUsernameEditText = (EditText) findViewById(R.id.mUsername);
        mPasswordEditText = (EditText) findViewById(R.id.mPassword);

        mLoginButton = (Button) findViewById(R.id.mButton);
        mCheckbox = (CheckBox) findViewById(R.id.mCheckbox);
        mLoginButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Storagehandler.insertUsername(this,mUsernameEditText.getText().toString());
        Storagehandler.insertPassword(this,mPasswordEditText.getText().toString());
        Storagehandler.setChecked(this,mCheckbox.isChecked());

        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }


}


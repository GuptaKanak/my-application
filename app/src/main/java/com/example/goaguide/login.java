package com.example.goaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity implements View.OnClickListener {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt=(Button)findViewById(R.id.Registerbtn);
        bt.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        intent = new Intent(login.this, TakePhoto.class);
        startActivity(intent);

    }
}

package com.example.goaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=(Button)findViewById(R.id.Registerbtn);
        bt.setOnClickListener(this);
        bt1=(Button)findViewById(R.id.loginbtn);
        bt1.setOnClickListener(this);
    }

   // public void onClickListener(View view) {

        //Intent intent = new Intent(MainActivity.this, TakePhoto.class);
        //startActivity(intent);

    //}



    @Override
    public void onClick(View v) {


            Intent loginintent = new Intent(MainActivity.this, login.class);
            startActivity(loginintent);

    }
}

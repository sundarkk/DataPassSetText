package com.sundar.datapasssettext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserDeatailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_deatails);

//intent to get data
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");

        //TextView
        TextView mResultTv = findViewById(R.id.resultTv);

        //setText
        mResultTv.setText("Name: "+name+"\nEmail: "+email+ "\nPhone: "+phone);
    }
}

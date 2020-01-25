package com.sundar.datapasssettext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final EditText mNameEt = findViewById(R.id.EdtUserName);
        final EditText mEmailEt = findViewById(R.id.EdtEmail);
        final EditText mPhoneEt = findViewById(R.id.EdtPassword);
        //Button
        Button mSaveBtn = findViewById(R.id.BtnLogin);
        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = mNameEt.getText().toString();
                String email = mEmailEt.getText().toString();
                String phone = mPhoneEt.getText().toString();

                //activity intent
                Intent intent = new Intent(LoginActivity.this, UserDeatailsActivity.class);

                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PHONE", phone);

                startActivity(intent);

            }
        });


    }
}

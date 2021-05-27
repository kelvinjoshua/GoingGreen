package com.example.greener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignIn extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.Login) Button loginButton;
    @BindView(R.id.createText) TextView createText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        ButterKnife.bind(this);
        loginButton.setOnClickListener(this);
        createText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == createText){
            Intent intent = new Intent(SignIn.this, CreateAcc.class);
            startActivity(intent);
        }

    }
}
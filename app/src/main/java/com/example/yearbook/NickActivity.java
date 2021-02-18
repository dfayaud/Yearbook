package com.example.yearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nick);
    }

    public void switchDannyActivity(View view){
        Intent intent = new Intent(this, DannyActivity.class);
        startActivity(intent);
    }

    public void switchJohnActivity(View view){
        Intent intent = new Intent(this, JohnActivity.class);
        startActivity(intent);
    }
}
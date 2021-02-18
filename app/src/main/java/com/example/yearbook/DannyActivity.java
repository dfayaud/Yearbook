package com.example.yearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DannyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danny);
    }

    public void switchNickActivity(View view){
        Intent intent = new Intent(this, NickActivity.class);
        startActivity(intent);
    }

    public void switchJohnActivity(View view){
        Intent intent = new Intent(this, JohnActivity.class);
        startActivity(intent);
    }

}
package com.example.latihanlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityConstraintLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint_layout);
    }
    public void next(View view) {
        Intent intent = new Intent(MainActivityConstraintLayout.
                this,MainActivityFrameLayout.class);
        startActivity(intent);
    }
}
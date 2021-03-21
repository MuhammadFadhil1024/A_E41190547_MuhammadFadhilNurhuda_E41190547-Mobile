package com.example.latihanlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityFrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_frame_layout);
    }
    public void next(View view) {
        Intent intent = new Intent(MainActivityFrameLayout.
                this,MainActivityTableLayout.class);
        startActivity(intent);
    }
}
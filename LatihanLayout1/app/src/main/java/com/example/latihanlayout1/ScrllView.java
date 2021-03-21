package com.example.latihanlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrllView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrll_view);
    }
    public void next(View view) {
        Intent intent = new Intent(ScrllView.
                this,ScrllHrizntll.class);
        startActivity(intent);
    }
}
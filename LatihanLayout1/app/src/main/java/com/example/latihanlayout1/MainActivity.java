package com.example.latihanlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    EditText Pada,Subject,Pesan;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pada = findViewById(R.id.pada);
        Subject = findViewById(R.id.subject);
        Pesan = findViewById(R.id.pesan);
        Submit = findViewById(R.id.send);
    }
    public void next(View view) {
        Intent intent = new Intent(MainActivity.
                this,MainActivityRelativeLayout.class);
        startActivity(intent);
    }
    public void scrollview(View view) {
        Intent intent = new Intent(MainActivity.
                this, ScrollView.class);
        startActivity(intent);
    }
    public void latihan1(View view) {
        Intent intent = new Intent(MainActivity.
                this, TugasLayout.class);
        startActivity(intent);
    }
}
package com.example.lab_2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        String userName = getIntent().getStringExtra("user_name");

    }
}

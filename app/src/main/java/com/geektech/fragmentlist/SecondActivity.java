package com.geektech.fragmentlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        FragmentManager fragmentManager = getSupportFragmentManager();
        SecondFragment secondFragment= (SecondFragment) fragmentManager.findFragmentById(R.id.text_view_fragment);
        Intent intent = getIntent();
        result = intent.getStringExtra("result");
        secondFragment.textView.setText(result);


    }
}

package com.geektech.fragmentlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IInputFragment {

    MainFragment mainFragment;
    InputFragment inputFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mainFragment = (MainFragment) fragmentManager.findFragmentById(R.id.recycler_fragment);
        inputFragment = (InputFragment) fragmentManager.findFragmentById(R.id.input_fragment);
        inputFragment.listener = this;
    }

    @Override
    public void onInputNumber(int number) {
        mainFragment.fullList(number);
    }
}

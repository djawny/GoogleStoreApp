package com.sdaacademy.jawny.daniel.googlestoreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.app_info_button)
    public void showAppInfo() {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}

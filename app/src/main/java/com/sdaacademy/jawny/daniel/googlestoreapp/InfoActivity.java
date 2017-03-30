package com.sdaacademy.jawny.daniel.googlestoreapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoActivity extends AppCompatActivity {

    @BindView(R.id.app_id)
    TextView mAppId;

    @BindView(R.id.build_type)
    TextView mBuildType;

    @BindView(R.id.debug)
    TextView mDebug;

    @BindView(R.id.flavor)
    TextView mFlavor;

    @BindView(R.id.version_code)
    TextView mVersionCode;

    @BindView(R.id.version_name)
    TextView mVersionName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ButterKnife.bind(this);
        setViews();
        showLogsInDebug();
    }

    private void setViews() {
        mAppId.setText(String.format("Application Id: %s", BuildConfig.APPLICATION_ID));
        mBuildType.setText(String.format("Build Type: %s", BuildConfig.BUILD_TYPE));
        mDebug.setText(String.format("Debug: %s", BuildConfig.DEBUG));
        mFlavor.setText(String.format("Flavor: %s", BuildConfig.FLAVOR));
        mVersionCode.setText(String.format("VersionCode: %d", BuildConfig.VERSION_CODE));
        mVersionName.setText(String.format("VersionName: %s", BuildConfig.VERSION_NAME));
    }

    private void showLogsInDebug() {
        if (BuildConfig.DEBUG) {
            Log.i("test", "ApplicationId: " + BuildConfig.APPLICATION_ID);
            Log.i("test", "BuildType: " + BuildConfig.BUILD_TYPE);
            Log.i("test", "Debug: " + BuildConfig.DEBUG);
            Log.i("test", "Flavor: " + BuildConfig.FLAVOR);
            Log.i("test", "VersionCode: " + BuildConfig.VERSION_CODE);
            Log.i("test", "VersionName: " + BuildConfig.VERSION_NAME);
        }
    }
}

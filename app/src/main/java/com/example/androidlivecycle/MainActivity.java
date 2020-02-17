package com.example.androidlivecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity{

    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"App init");
    }

    @Override
    protected void onStart(){
        super.onStart();

        Log.d(TAG,"App started");
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d(TAG,"App resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG,"App paused");
    }

    @Override
    protected void onStop(){
        super.onStop();

        Log.d(TAG,"App stopped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.d(TAG,"App destroyed");
    }
}
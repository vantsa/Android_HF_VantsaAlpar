package com.example.activitylifecyclemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("Statusz", "MainActivity3: onCreate()");
    }

    protected void onStart(){
        super.onStart();
        Log.d("Statusz:",  "MainActivity3: onStart()");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("Statusz:",  "MainActivity3: onRestart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Statusz:",  "MainActivity3: onPostResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz:",  "MainActivity3: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz:",  "MainActivity3: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz:",  "MainActivity3: onDestroy()");
    }
}

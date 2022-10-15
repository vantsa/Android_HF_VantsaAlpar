package com.example.activitylifecyclemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Statusz:",  "MainActivity: onCreate()");

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            }
        });
    }

    protected void onStart(){
        super.onStart();
        Log.d("Statusz:",  "MainActivity: onStart()");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("Statusz:",  "MainActivity: onRestart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Statusz:",  "MainActivity: onPostResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz:",  "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz:",  "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz:",  "MainActivity: onDestroy()");
    }
}
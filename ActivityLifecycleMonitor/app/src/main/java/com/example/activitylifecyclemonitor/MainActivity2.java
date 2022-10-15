package com.example.activitylifecyclemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("Statusz", "MainActivity2: onCreate()");
        Button button2 = findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            }
        });
    }

    protected void onStart(){
        super.onStart();
        Log.d("Statusz:",  "MainActivity2: onStart()");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("Statusz:",  "MainActivity2: onRestart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Statusz:",  "MainActivity2: onPostResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz:",  "MainActivity2: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz:",  "MainActivity2: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz:",  "MainActivity2: onDestroy()");
    }
}
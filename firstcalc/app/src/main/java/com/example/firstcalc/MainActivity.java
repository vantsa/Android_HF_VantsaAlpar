package com.example.firstcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gombad = findViewById(R.id.button2);
        Button gombmin = findViewById(R.id.button5);
        Button gombszor = findViewById(R.id.button6);
        Button gombper = findViewById(R.id.button7);
        EditText szam1 = findViewById(R.id.editTextTextPersonName);
        EditText szam2 = findViewById(R.id.editTextTextPersonName2);
        TextView eredmeny = findViewById(R.id.textView);

        gombad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(szam1.getText().toString()) + Integer.parseInt(szam2.getText().toString());
                eredmeny.setText(String.valueOf(res));
            }
        });
        gombmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(szam1.getText().toString()) - Integer.parseInt(szam2.getText().toString());
                eredmeny.setText(String.valueOf(res));
            }
        });
        gombszor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(szam1.getText().toString()) * Integer.parseInt(szam2.getText().toString());
                eredmeny.setText(String.valueOf(res));
            }
        });
        gombper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double res = Integer.parseInt(szam1.getText().toString()) / Integer.parseInt(szam2.getText().toString());
                eredmeny.setText(String.valueOf(res));
            }
        });
    }
}
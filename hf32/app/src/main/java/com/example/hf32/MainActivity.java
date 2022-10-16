package com.example.hf32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addP = findViewById(R.id.button);
        Button cancel = findViewById(R.id.button2);
        Button showP = findViewById(R.id.button3);
        EditText code = findViewById(R.id.edit1);
        EditText name = findViewById(R.id.edit2);
        EditText price = findViewById(R.id.edit3);
        ArrayList<Product> lista;
        lista = new ArrayList<>();


        addP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lista.add(new Product(code, name, price));
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText("");
                name.setText("");
                price.setText("");
            }
        });

        showP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}


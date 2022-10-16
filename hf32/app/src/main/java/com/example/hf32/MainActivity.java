package com.example.hf32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


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
        TextView showPr = findViewById(R.id.showPr);
        List<Product> lista = new ArrayList<>();


        addP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Code = code.getText().toString();
                String Name = name.getText().toString();
                Double Price = Double.parseDouble(price.getText().toString());

                 lista.add(new Product(Code,Name,Price));
                    code.setText("");
                    name.setText("");
                    price.setText("");
                 Toast toast = Toast.makeText(MainActivity.this, "Hozzaadva", Toast.LENGTH_SHORT);
                 toast.show();
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
                String text = "";

                for(Product product : lista){
                    text += product.toString();
                }

                showPr.setText(text);
            }
        });
    }
}


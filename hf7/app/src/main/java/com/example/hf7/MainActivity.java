package com.example.hf7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyCard[] myCards = new MyCard[]{
                new MyCard("EUR", "Euro", "4.4100 RON", "4.5500 RON", R.drawable.euro),
                new MyCard("USD", "American Dollar", "3.9750 RON", "4.1450 RON", R.drawable.usa),
                new MyCard("GBP", "British Pound", "6.1250 RON", "6.3550 RON", R.drawable.gpb),
                new MyCard("AUD", "Australian Dollar", "2.9600 RON", "3.0600 RON", R.drawable.austr),
                new MyCard("CAD", "Canadian Dollar", "3.0950 RON", "3.2650 RON", R.drawable.canad),
                new MyCard("CHF", "Elvetian Franc", "4.2300 RON", "4.3300 RON", R.drawable.swiss),
                new MyCard("DKK", "Danish Corone", "0.5850 RON", "0.6150 RON", R.drawable.denm),
                new MyCard("HUF", "Hungarian Forint", "0.0136 RON", "0.0146 RON", R.drawable.hun)
        };

        MyAdapter adapter = new MyAdapter(myCards, MainActivity.this);
        recyclerView.setAdapter(adapter);

    }
}
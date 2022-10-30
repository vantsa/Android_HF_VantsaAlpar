package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Locale;

public class MainActivity<myAdapter> extends AppCompatActivity {

    String[] nameArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};

    String[] infoArray = {
            "Euro",
            "American Dollar",
            "British Pound",
            "Australian Dollar",
            "Canadian Dollar",
            "Elvetian Franc",
            "Danish Corone",
            "Hungarian Forint",
    };

    Integer[] imageArray = {R.drawable.euro,
    R.drawable.usa,
    R.drawable.gpb,
    R.drawable.austr,
    R.drawable.canad,
    R.drawable.swiss,
    R.drawable.denm,
            R.drawable.hun};

    String[] buyArray = {
            "4.4100 RON",
            "3.9750 RON",
            "6.1250 RON",
            "2.9600 RON",
            "3.0950 RON",
            "4.2300 RON",
            "0.5850 RON",
            "0.0136 RON"};

    String[] sellArray = {
            "4.5500 RON",
            "4.1450 RON",
            "6.3550 RON",
            "3.0600 RON",
            "3.2650 RON",
            "4.3300 RON",
            "0.6150 RON",
            "0.0146 RON"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myList = findViewById(R.id.myListView);
        CustomAdapter myCustomAdapter = new CustomAdapter(this, nameArray, infoArray, imageArray, buyArray, sellArray);
        myList.setAdapter(myCustomAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


    }
}
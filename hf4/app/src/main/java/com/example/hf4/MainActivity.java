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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myList = findViewById(R.id.myListView);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nameArray);
        myList.setAdapter(myAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


    }
}
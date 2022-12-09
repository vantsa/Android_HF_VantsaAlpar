package com.example.hf6;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ShowItemActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            finish();
            return;
        }
        setContentView(R.layout.fragment2);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            String selectedItem = extras.getString("item");
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("You have selected "+selectedItem);
        }
    }
}

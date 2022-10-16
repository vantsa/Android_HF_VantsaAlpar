package com.example.hf4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter {
    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;

    public CustomAdapter(Activity context, String[] nameArrayParam,
                         String[] infoArrayParam, Integer[] imageIDArrayParam){

        super(context, R.layout.list_item, nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, null,true);

        TextView nev = rowView.findViewById(R.id.textView);
        TextView leiras = rowView.findViewById(R.id.textView2);
        ImageView kep = rowView.findViewById(R.id.imageView);

        nev.setText(nameArray[position]);
        leiras.setText(infoArray[position]);
        kep.setImageResource(imageIDarray[position]);



        return rowView;



    }

}
package com.example.hf6;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Fragment1Activity<myAdapter> extends Fragment {

    protected static final String FRAG2 = "2";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Context c = getActivity().getApplicationContext();
        View vw = inflater.inflate(R.layout.fragment1, container, false);
        final String[] currencies={"Euro", "American Dollar", "British Pound", "Australian Dollar", "Canadian Dollar", "Elvetian Franc", "Danish Corone", "Hungarian Forint"};
        final String[] currencyName={"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
        final Integer[] imageArray = {R.drawable.euro,
                R.drawable.usa,
                R.drawable.gpb,
                R.drawable.austr,
                R.drawable.canad,
                R.drawable.swiss,
                R.drawable.denm,
                R.drawable.hun};

        final String[] buyArray = {
                "4.4100 RON",
                "3.9750 RON",
                "6.1250 RON",
                "2.9600 RON",
                "3.0950 RON",
                "4.2300 RON",
                "0.5850 RON",
                "0.0136 RON"};

        final String[] sellArray = {
                "4.5500 RON",
                "4.1450 RON",
                "6.3550 RON",
                "3.0600 RON",
                "3.2650 RON",
                "4.3300 RON",
                "0.6150 RON",
                "0.0146 RON"};

        ListView currencyList = (ListView) vw.findViewById(R.id.currency_list);
        CustomAdapter myCustomAdapter = new CustomAdapter(, currencies, imageArray, buyArray, sellArray);
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(c, android.R.layout.simple_list_item_1, currencies);
        //currencyList.setAdapter(arrayAdapter);
        currencyList.setAdapter(myCustomAdapter);

        final FragmentManager fragmentManager = getFragmentManager();
        currencyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                {
                    if(fragmentManager.findFragmentByTag(FRAG2)!=null){
                        TextView selectedOpt = (TextView) getActivity().findViewById(R.id.textView);
                        selectedOpt.setText("You have selected "+((TextView) v).getText().toString());
                    }else{
                        Intent intent = new Intent(getActivity().getApplicationContext(), ShowItemActivity.class);
                        intent.putExtra("item", ((TextView) v).getText().toString());
                        startActivity(intent);
                    }
                }
            }
        });
        return vw;
    }
}

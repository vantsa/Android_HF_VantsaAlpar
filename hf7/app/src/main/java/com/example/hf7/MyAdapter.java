package com.example.hf7;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    MyCard[] myCards;
    Context context;

    public MyAdapter(MyCard[] myCards, MainActivity activity){
        this.myCards = myCards;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_item, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final MyCard myCardsList = myCards[position];
            holder.currency.setText(myCardsList.getCurrency());
            holder.currencyName.setText(myCardsList.getCurrencyName());
            holder.buy.setText(myCardsList.getBuy());
            holder.sell.setText(myCardsList.getSell());
            holder.img.setImageResource(myCardsList.getCardImg());

    }

    @Override
    public int getItemCount() {
        return myCards.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView currency;
        TextView currencyName;
        TextView buy;
        TextView sell;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView);
            currency = itemView.findViewById(R.id.textView);
            currencyName = itemView.findViewById(R.id.textView2);
            buy = itemView.findViewById(R.id.textView3);
            sell = itemView.findViewById(R.id.textView4);
        }
    }
}

package com.example.todolist.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.todolist.R;
import com.example.todolist.models.TodoItem;

import java.util.ArrayList;

public class TodoAdapter extends ArrayAdapter<TodoItem> {
    private Context myContext;


    public TodoAdapter(@NonNull Context context, ArrayList<TodoItem> items){
        super(context, 0, items);
        this.myContext = context;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        TodoItem item = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.todo_item, parent, false);
        }

        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvBody = (TextView) convertView.findViewById(R.id.tvBody);
        TextView tvDate = (TextView) convertView.findViewById(R.id.tvDate);
        TextView tvStatus = (TextView) convertView.findViewById(R.id.tvStatus);

        tvTitle.setText(item.getTitle());
        tvBody.setText(item.getBody());
        tvDate.setText(item.getDueDate());
        ///tvStatus.setText(item.getStatus());

        return convertView;
    }
}

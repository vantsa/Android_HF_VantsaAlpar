package com.example.todolist.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolist.R;
import com.example.todolist.models.TodoItem;

import java.util.ArrayList;

public class TodoAdapter2 extends RecyclerView.Adapter<TodoAdapter2.VH>{


    private Activity context;
    private ArrayList<TodoItem> todos;

    public TodoAdapter2(Activity context, ArrayList<TodoItem> todos) {
        this.context = context;
        this.todos = todos;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.todo_item, parent, false);
        return new VH(itemView, context);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        TodoItem todo = todos.get(position);
        holder.tvTitle.setText(todo.getTitle());
        holder.tvBody.setText(todo.getBody());
        holder.tvDate.setText(todo.getDueDate());
        holder.tvStatus.setText(todo.getStatus());
    }

    @Override
    public int getItemCount() {
        return todos.size();
    }

    public class VH extends RecyclerView.ViewHolder{


        final View rootView;
        final TextView tvTitle;
        final TextView tvBody;
        final TextView tvDate;
        final TextView tvStatus;


        public VH(@NonNull View itemView, Context contex){
            super(itemView);
            rootView = itemView;
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvBody = (TextView) itemView.findViewById(R.id.tvBody);
            tvDate = (TextView) itemView.findViewById(R.id.tvDate);
            tvStatus = (TextView) itemView.findViewById(R.id.tvStatus);
        }
    }
}

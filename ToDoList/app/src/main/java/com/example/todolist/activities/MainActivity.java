package com.example.todolist.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.todolist.R;
import com.example.todolist.adapters.TodoAdapter;
import com.example.todolist.models.TodoItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView todoListView;
    private TodoAdapter myAdapter;
    private ArrayList<TodoItem> todoList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoListView = findViewById(R.id.todoListView);
        populateItemsList();

        myAdapter = new TodoAdapter(this, todoList);
        todoListView.setAdapter(myAdapter);


    }

    public void populateItemsList(){
        todoList = TodoItem.getTodoList();
    }
}
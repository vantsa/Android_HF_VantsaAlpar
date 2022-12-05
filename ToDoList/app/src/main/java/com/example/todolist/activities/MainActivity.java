package com.example.todolist.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.example.todolist.R;
import com.example.todolist.adapters.TodoAdapter;
import com.example.todolist.models.TodoItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView todoListView;
    private TodoAdapter myAdapter;
    private ArrayList<TodoItem> todoList;
    FloatingActionButton fab;
    EditText title, body, date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoListView = findViewById(R.id.todoListView);
        populateItemsList();

        myAdapter = new TodoAdapter(this, todoList);
        todoListView.setAdapter(myAdapter);
        fab = findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setMessage("What do you want to do next ?");
                LayoutInflater inflater = LayoutInflater.from(dialog.getContext());
                View view = inflater.inflate(R.layout.add_task, null, false);
                dialog.setView(view);



                dialog.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText title= view.findViewById(R.id.addTitle);
                        EditText body = view.findViewById(R.id.addBody);
                        EditText date = view.findViewById(R.id.addDate);
                        TodoItem newItem = new TodoItem(title.getText().toString(), body.getText().toString(), 0, date.getText().toString(), 0);
                        todoList.add(newItem);
                        myAdapter.notifyDataSetChanged();
                        dialogInterface.dismiss();
                    }
                });



                /*dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText title= view.findViewById(R.id.addTitle);
                        EditText body = view.findViewById(R.id.addBody);
                        EditText date = view.findViewById(R.id.addDate);
                        TodoItem newItem = new TodoItem(title.getText().toString(), body.getText().toString(), 0, date.getText().toString(), 0);
                        todoList.add(newItem);
                        myAdapter.notifyDataSetChanged();
                        dialogInterface.dismiss();
                    }
                });*/

                AlertDialog alert = dialog.create();
                alert.show();
            }
        });
        todoListView.setOnItemClickListener((adapterView, v, i, l) -> {

            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setMessage("Details of the task");
            dialog.setCancelable(true);

            Context context = dialog.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.add_task, null, false);
            dialog.setView(view);



            title = view.findViewById(R.id.addTitle);
            body = view.findViewById(R.id.addBody);
            date = view.findViewById(R.id.addDate);


            title.setText(todoList.get(i).getTitle());
            body.setText(todoList.get(i).getBody());
            date.setText(todoList.get(i).getDueDate());

            AlertDialog alert = dialog.create();
            alert.show();
        });


    }

    public void populateItemsList(){
        todoList = TodoItem.getTodoList();
    }


}
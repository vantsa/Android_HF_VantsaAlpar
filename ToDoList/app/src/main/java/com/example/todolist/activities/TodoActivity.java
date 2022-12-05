package com.example.todolist.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.todolist.R;
import com.example.todolist.adapters.TodoAdapter2;
import com.example.todolist.models.TodoItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class TodoActivity extends AppCompatActivity{

    private ArrayList<TodoItem> todoList;
    FloatingActionButton fabAddTask;
    private EditText title, body, date;
    TodoAdapter2 mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        RecyclerView list= findViewById(R.id.rvList);
        fabAddTask = findViewById(R.id.floatingActionButton);


        list.setLayoutManager(new LinearLayoutManager(this));
        populateItemsList();

        mAdapter = new TodoAdapter2(this, todoList);
        list.setAdapter(mAdapter);

        fabAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                dialogFragment = new AddTaskFragment();

                Bundle bundle = new Bundle();
                bundle.putBoolean("notAlertDialog", true);

                dialogFragment.setArguments(bundle);

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
                if (prev != null) {
                    ft.remove(prev);
                }
                ft.addToBackStack(null);


                dialogFragment.show(ft, "dialog");

 */


                //Toast.makeText(MainActivity.this, "Add task", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder dialog = new AlertDialog.Builder(TodoActivity.this);
                dialog.setMessage("What do you want to do next?");
                final Context context = dialog.getContext();
                final LayoutInflater inflater = LayoutInflater.from(context);
                View view = inflater.inflate(R.layout.add_task, null, false);
                dialog.setView(view);

                dialog.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        title = view.findViewById(R.id.addTitle);
                        body = view.findViewById(R.id.addBody);
                        date = view.findViewById(R.id.addDate);
                        TodoItem newItem = new TodoItem(title.getText().toString(), body.getText().toString(), 0, date.getText().toString(), 0);
                        todoList.add(newItem);
                        mAdapter.notifyDataSetChanged();
                        dialogInterface.dismiss();
                    }
                });

                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog alert = dialog.create();
                alert.show();


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



    }

    private void populateItemsList() {
        todoList = TodoItem.getTodoList();
    }
}
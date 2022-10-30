package com.example.todolist.models;

import java.util.ArrayList;

public class TodoItem {
    private String title;
    private String body;
    private int priority;
    private String dueDate;
    private int status;

    public TodoItem(String title, String body, int priority, String dueDate, int status){
        this.title = title;
        this.body = body;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", priority=" + priority +
                ", dueDate='" + dueDate + '\'' +
                ", status=" + status +
                '}';
    }

    public static ArrayList<TodoItem> getTodoList(){
        ArrayList<TodoItem> todos = new ArrayList<>();
        todos.add(new TodoItem("Shopping", "Nagy bevasarlas", 1, "2022.11.05", 0));
        todos.add(new TodoItem("Banking", "Nagy bevasarlas", 1, "2022.11.05", 0));
        todos.add(new TodoItem("Teaching", "Nagy bevasarlas", 1, "2022.11.05", 0));
        todos.add(new TodoItem("Skiing", "Nagy bevasarlas", 1, "2022.11.05", 0));
        todos.add(new TodoItem("Sleeping", "Nagy bevasarlas", 1, "2022.11.05", 0));
        return todos;
    }
}

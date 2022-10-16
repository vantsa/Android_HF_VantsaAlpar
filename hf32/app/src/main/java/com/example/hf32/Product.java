package com.example.hf32;

import android.widget.EditText;

public class Product {
    public EditText name;
    public EditText code;
    public EditText price;

    public Product(EditText code, EditText name, EditText price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }
}

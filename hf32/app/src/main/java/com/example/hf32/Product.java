package com.example.hf32;

import android.widget.EditText;

public class Product {
    public String name;
    public String code;
    public Double price;

    public Product(String code, String name, Double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                '}';
    }
}

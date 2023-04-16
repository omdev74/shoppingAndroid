package com.example.project2_revised;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter adapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize product list
        productList = new ArrayList<>();
        productList.add(new Product("Product 1", "Description 1", R.drawable.gpu, 10.00));
        productList.add(new Product("Product 2", "Description 2", R.drawable.gpu, 20.00));
        productList.add(new Product("Product 3", "Description 3", R.drawable.gpu, 30.00));
        productList.add(new Product("Product 4", "Description 4", R.drawable.gpu, 40.00));

        // Initialize adapter
        adapter = new ProductAdapter(productList, this);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}

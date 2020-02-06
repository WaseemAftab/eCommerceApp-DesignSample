package com.office.namshi;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Categories extends AppCompatActivity {

    List<Brands> listBrands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        toolbar2.setTitle("Namshi");
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listBrands = new ArrayList<>();

        listBrands.add(new Brands("Closet", R.drawable.second));
        listBrands.add(new Brands("Abaya", R.drawable.fourth));
        listBrands.add(new Brands("Threads", R.drawable.zara3));
        listBrands.add(new Brands("Closet", R.drawable.second));
        listBrands.add(new Brands("Abaya", R.drawable.fourth));
        listBrands.add(new Brands("Threads", R.drawable.zara3));
        listBrands.add(new Brands("Threads", R.drawable.zara3));
        listBrands.add(new Brands("Closet", R.drawable.second));
        listBrands.add(new Brands("Abaya", R.drawable.fourth));
        listBrands.add(new Brands("Threads", R.drawable.zara3));
        listBrands.add(new Brands("Closet", R.drawable.second));
        listBrands.add(new Brands("Abaya", R.drawable.fourth));
        listBrands.add(new Brands("Threads", R.drawable.first));
        listBrands.add(new Brands("Closet", R.drawable.second));
        listBrands.add(new Brands("Abaya", R.drawable.fourth));
        listBrands.add(new Brands("Threads", R.drawable.first));
        listBrands.add(new Brands("Closet", R.drawable.second));


        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.horizontal_recyclerViewCard);
        CardAdapter cardAdapter = new CardAdapter(this, listBrands);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setAdapter(cardAdapter);
        recyclerView1.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.new_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
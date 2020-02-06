package com.office.namshi;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    List<Brands> lstBrands;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Clothing");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.horizontal_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        String[] ArrayList = {"Petite Clothing", "Shorts", "Pents", "Tall Clothing", "Scarf", "Tits", "Shirts", "Jackets", "Trousers", "Jeans", "Denim"};
        recyclerView.setAdapter(new HorizontalAdapter(ArrayList));

        lstBrands = new ArrayList<>();

        lstBrands.add(new Brands("Threads", R.drawable.zara3));
        lstBrands.add(new Brands("Closet", R.drawable.second));
        lstBrands.add(new Brands("Abaya", R.drawable.fourth));
        lstBrands.add(new Brands("Threads", R.drawable.zara3));
        lstBrands.add(new Brands("Closet", R.drawable.second));
        lstBrands.add(new Brands("Abaya", R.drawable.fourth));
        lstBrands.add(new Brands("Threads", R.drawable.zara3));
        lstBrands.add(new Brands("Closet", R.drawable.second));
        lstBrands.add(new Brands("Abaya", R.drawable.fourth));
        lstBrands.add(new Brands("Threads", R.drawable.zara3));
        lstBrands.add(new Brands("Closet", R.drawable.second));
        lstBrands.add(new Brands("Abaya", R.drawable.fourth));
        lstBrands.add(new Brands("Threads", R.drawable.first));
        lstBrands.add(new Brands("Closet", R.drawable.second));
        lstBrands.add(new Brands("Abaya", R.drawable.fourth));
        lstBrands.add(new Brands("Threads", R.drawable.first));
        lstBrands.add(new Brands("Closet", R.drawable.second));


        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.grid_layout);
        CardAdapter cardAdapter1 = new CardAdapter(this, lstBrands);
        recyclerView1.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView1.setAdapter(cardAdapter1);
        recyclerView1.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView1.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.forward_button:
                Intent intent = new Intent(Home.this, Categories.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

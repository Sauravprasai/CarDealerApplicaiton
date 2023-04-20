package com.android.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    public void openAddProductActivity(View view) {
        Intent intent = new Intent(this, AddProduct.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    String carList[] = {"Lamborghini", "Volkswagen", "Honda", "Hyundai", "Tesla", "Ford", "Toyota", "BMW", "Audi"};
    int carImages[] = {R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.i, R.drawable.h, R.drawable.g, R.drawable.f};
    String carDescription[] = {"This is an awesome car", "This is an average car", "This is a normal car", "This is a worth-it car", "This is an electric car", "This is a powerful car", "This is a reliable car", "This is a luxurious car", "This is a sporty car"};
    int carPrice[] = {99000, 55000, 51000, 32000, 85000, 45000, 37000, 62000, 74000};
    int carStatus[] = {1, 0, 0, 1, 1, 1, 0, 1, 0};


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view_custom);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), carList, carImages, carDescription, carPrice, carStatus);
        listView.setAdapter(customBaseAdapter);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                onMenuItemClick(item);
                return true;
            }
        });
    }


    public void onMenuItemClick(MenuItem item) {
        int id = item.getItemId();
        System.out.printf(String.valueOf(id));

        if (id == R.id.login) {
            Intent intent = new Intent(MainActivity.this, ChangeAdmin.class);
            startActivity(intent);
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();

        }
    }
}

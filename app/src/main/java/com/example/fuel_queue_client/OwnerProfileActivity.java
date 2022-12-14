package com.example.equeue_client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.equeue_client.database.DBHelper;
import com.example.equeue_client.models.user.User;

import java.util.Objects;

public class OwnerProfileActivity extends AppCompatActivity {

    Button Create,View,LogOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_owner_profile);

        Create=findViewById(R.id.add_station);
        View = findViewById(R.id.view_all_stations);
        LogOut =findViewById(R.id.SignOUT);

        //directs to the fuel station registering interface
        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent(OwnerProfileActivity.this, RegisterStationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //directs to the fuel station list interface
        View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent(OwnerProfileActivity.this, FuelStationListActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //deletes the locally saved user and directs to the main activity
        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                DBHelper dbHelper = new DBHelper(OwnerProfileActivity.this);

                Intent intent = new Intent(OwnerProfileActivity.this, MainActivity.class);
                User user = dbHelper.getSingleUser();
                dbHelper.deleteOne(user.getId());
                startActivity(intent);
                finish();
            }
        });
    }
}
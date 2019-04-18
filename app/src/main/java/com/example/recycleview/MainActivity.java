package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recycleview.adapter.ContactsAdapter;
import com.example.recycleview.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add( new Contacts("Saugat Malla","9846055785",R.drawable.saugat) );
        contactsList.add( new Contacts("Rajesh Hamal","9836478935",R.drawable.rajesh) );
        contactsList.add( new Contacts("Dahayand Rai","9856743826",R.drawable.dahayang) );
        contactsList.add( new Contacts("Bhuwan KC","9865782302",R.drawable.bhuwan) );

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}

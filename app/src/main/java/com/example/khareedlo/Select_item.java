package com.example.khareedlo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Select_item extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_item);


        // Get the Intent and Extract Button ID Clicked, out of it
        Intent intent = getIntent();
        // String button_id = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);



        String[] itemName = {"tomato","onion","potato","ginger","lady finger","spanish","cucumber",
                "lemon","Broccoli","pumpkin"
        };

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemName);

        ListView listView = (ListView) findViewById(R.id.practice_list);
        listView.setAdapter(itemsAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_set, menu);
        return super.onCreateOptionsMenu(menu);
    }


}

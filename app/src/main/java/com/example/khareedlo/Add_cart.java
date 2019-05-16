package com.example.khareedlo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Add_cart extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "food OPTION";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cart);
    }

    public void add_cart(View view)
    {
        Toast.makeText(this, "Add to cart", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with more Menu");

        Intent intent = new Intent(this, shop_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.mcc);
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);

    }

    public void remove_cart(View view)
    {
        Toast.makeText(this, "remove from cart", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with more Menu");

        Intent intent = new Intent(this, shop_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.mcc);
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);
    }
}

package com.example.khareedlo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class shop_menu extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "BIRD OPTION";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_menu);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_set, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //super.onOptionsItemSelected(item);

        Intent intent;
        switch(item.getItemId()){

            case R.id.action_shop:

                /////////////////////////


             ////////   ghalat da

                /////////////////////////
                intent = new Intent(this, LoginActivity.class);
                intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

                String button_id = "Duck Menu";

                // Putting the Test Input by user into the Intent
                intent.putExtra(EXTRA_MESSAGE, button_id);

                startActivity(intent);

                return true;


            case R.id.action_settings:

                intent = new Intent(this, setting.class);
                intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);


                startActivity(intent);
                return true;


            case R.id.action_exit:

                finish();
                moveTaskToBack(true);
                return true;


            default:
                return super.onOptionsItemSelected(item);

        }

    }


    //TODO: Back to Main Layout

    public void backButton(View v){
        Toast.makeText(this, "Back to Door", Toast.LENGTH_SHORT).show();
        Log.i("info","Back to Main Layout");

        Intent intent = new Intent(this, Shop.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Start Another Activity based on Intent
        startActivity(intent);
    }


    public void mccButton(View v){

        Toast.makeText(this, "MCC Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with Mcc Menu");

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

    public void shamsButton(View v){

        Toast.makeText(this, "Shams Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with Shams  Menu");

        Intent intent = new Intent(this, shop_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.dwatson);
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);

    }

    public void shaheenButton(View v){

        Toast.makeText(this, "Shaheen Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with Shaheen Menu");

        Intent intent = new Intent(this, shop_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.shaheen);
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);

    }


    public void dwatsonButton(View v){

        Toast.makeText(this, "Dwatson Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with Dwatson Menu");

        Intent intent = new Intent(this, shop_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.metro);
        //String button_id = button.getResources().getResourceName(button.getId());
        String button_id = "Shop";


        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);

    }

    public void metroButton(View v){

        Toast.makeText(this, "Metro Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with Metro Menu");

        Intent intent = new Intent(this, shop_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.shams);
        // String button_id = button.getResources().getResourceName(button.getId());
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);

    }

}

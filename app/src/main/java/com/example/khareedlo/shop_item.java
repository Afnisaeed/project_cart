package com.example.khareedlo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class shop_item extends AppCompatActivity {

        public static final String EXTRA_MESSAGE = "BIRD OPTION";



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_shop_item);

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


    public void vegetableButton(View view)
    {
        Toast.makeText(this, "Vegetable Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with Vegetables ");

        Intent intent = new Intent(this, Select_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.vegetables);
        // String button_id = button.getResources().getResourceName(button.getId());
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);
    }

    public void fruitButton(View view)
    {
        Toast.makeText(this, "Fruit Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with fruit");

        Intent intent = new Intent(this, Select_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.fruit);
        // String button_id = button.getResources().getResourceName(button.getId());
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);
    }

    public void breadButton(View view)
    {
        Toast.makeText(this, "Bread Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with bread");

        Intent intent = new Intent(this, Select_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.bread);
        // String button_id = button.getResources().getResourceName(button.getId());
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);
    }

    public void breakfastButton(View view)
    {
        Toast.makeText(this, "Breakfast Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with Breakfast");

        Intent intent = new Intent(this, Select_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.breakfast);
        // String button_id = button.getResources().getResourceName(button.getId());
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);
    }

    public void liquidButton(View view)
    {
        Toast.makeText(this, "Liquid Selected", Toast.LENGTH_SHORT).show();
        Log.i("info","Proceed with liquid");

        Intent intent = new Intent(this, Select_item.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Adding the ID of button in tht intent sent to next activity
        ImageView button = (ImageView) findViewById(R.id.liquid);
        // String button_id = button.getResources().getResourceName(button.getId());
        String button_id = "Shop";

        // Putting the Test Input by user into the Intent
        intent.putExtra(EXTRA_MESSAGE, button_id);

        // Start Another Activity based on Intent
        startActivity(intent);
    }
}

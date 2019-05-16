package com.example.khareedlo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Shop extends AppCompatActivity implements SensorEventListener {


    // This is our DataManager instance
    private SensorManager sensorManager;
    private Sensor pressure;
    private Sensor light;


    int[] Madina = new int[]{
            R.drawable.mcc,
    };

    int[] shams = new int[]{
            R.drawable.shams
    };

    String[] chickenName = new String[]{
            "Desi Chicken", "Broiler", "Mountain Cock", "Hen",
            "Murree Rooster", "Wild Chicken", "Big Hen", "Big Bird",
            "Yellow Hen", "Red Cock", "Strong One", "Small Wonder",
            "Hungry Runner", "Rooster", "Egg Layer", "Roasted",
    };

    String[] duckName = new String[]{
            "Diving Duck", "Eider", "Goldern Eye", "Merganser",
            "Perching", "Scoter", "Sea Duck",
            "Stiff-Tail", "Teal", "Whisteling Duck", "Muscovy",
            "Sea Duck", "Perching", "Goldern Eye", "Perching", "Eider"
    };

    String[] itemDescription = new String[]{
            "1.5 Kg", "2.5 Kg", "2 Kg", "2.5 Kg",
            "3.5 Kg", "1.75 Kg", "2 Kg", "2.5 Kg",
            "1.5 Kg", "2.5 Kg", "1 Kg", "2.5 Kg",
            "3.5 Kg", "1.5 Kg", "1.75 Kg", "2 Kg",
    };

    String[] itemPrice = new String[]{
            "Rs. 300", "Rs. 250", "Rs. 350", "Rs. 170",
            "Rs. 300", "Rs. 250", "Rs. 350", "Rs. 170",
            "Rs. 300", "Rs. 250", "Rs. 350", "Rs. 170",
            "Rs. 300", "Rs. 250", "Rs. 350", "Rs. 170",
    };

    public static final String EXTRA_MESSAGE = "BIRD OPTION";

    @Override

    //TODO: STATE: CREATED | OPENING
    protected void onCreate(Bundle savedInstanceState) {

        // call the super class onCreate to complete the creation of activity like the View hierarchy
        super.onCreate(savedInstanceState);

        // Inflate main layout for the activity
        setContentView(R.layout.activity_shop);



        // Code for Pop Up Message
        Toast.makeText(this, "Chicken Club Opening!", Toast.LENGTH_SHORT).show();

        // Logging for Debugging
        Log.i("info", ">> APP STATE: STARTED (INVISIBLE)");


        final TextView textBatteryState = findViewById(R.id.textBatteryLevel);

        //TODO: Battery Monitoring
        BroadcastReceiver batteryReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

                double batteryLevel = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
                double levelScale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, 0);
                int batteryPercent = (int) Math.floor(batteryLevel/levelScale*100);
                textBatteryState.setText(batteryPercent+"%");

            }
        };

        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(batteryReceiver, filter);


        //TODO: Temperature Sensor
        // Get an instance of the sensor service, and use that to get an instance of  a particular sensor.
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        pressure = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        light = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);



    }

    //TODO: STATE: STARTED | OPENED
    protected void onStart() {
        super.onStart();

        // Code for Pop Up Message
        Toast.makeText(this, "KhareedLo Opened!", Toast.LENGTH_SHORT).show();


        // Logging for Debugging
        Log.i("info", ">> APP STATE: STARTED (VISIBLE | INACTIVE)");
    }

    //TODO: STATE: RESUMED | READY TO SERVE
    protected void onResume() {
        super.onResume();

        // Code for Pop Up Message
        //    Toast.makeText(this, "Welcome to Chicken Club! Ready to Serve!", Toast.LENGTH_LONG).show();

        Toast toast = Toast.makeText(this, " KhareedLo! Ready to Serve! ", Toast.LENGTH_LONG);
        View view = toast.getView();

        //Gets the actual oval background of the Toast then sets the colour filter
        view.getBackground().setColorFilter(getResources().getColor(R.color.colorRed), PorterDuff.Mode.SRC_IN);

        TextView text = (TextView) view.findViewById(android.R.id.message);
        text.setTextColor(Color.parseColor("#FFFF00"));
        toast.show();

        // Logging for Debugging
        Log.i("info", ">> APP STATE: STARTED (VISIBLE | ACTIVE)");

        // Register a listener for the sensor.
        sensorManager.registerListener(this, pressure, SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener(this, light, SensorManager.SENSOR_DELAY_NORMAL);



    }


    //TODO: STATE: PAUSED | BREAK
    protected void onPause() {
        super.onPause();

        // Code for Pop Up Message
        Toast.makeText(this, "KhareedLo on Break!", Toast.LENGTH_SHORT).show();

        // Logging for Debugging
        Log.i("info", ">> APP STATE: PAUSED (PARTIALLY VISIBLE | INACTIVE)");

        // Be sure to unregister the sensor when the activity pauses.
        sensorManager.unregisterListener(this);

    }

    //TODO: STATE: STOPPED | LEAVE
    protected void onStop() {
        super.onStop();

        // Code for Pop Up Message
        Toast.makeText(this, "KhareedLo on Leave!", Toast.LENGTH_SHORT).show();

        // Logging for Debugging
        Log.i("info", ">> APP STATE: PAUSED (INVISIBLE | INACTIVE)");


    }

    //TODO: STATE: RESTARTED | START | LEAVE
    protected void onRestart() {
        super.onRestart();

        // Code for Pop Up Message
        Toast.makeText(this, "KhareedLo on Re-Opening!", Toast.LENGTH_SHORT).show();

        // Logging for Debugging
        Log.i("info", ">> APP STATE: RESTART (VISIBLE | INACTIVE)");



    }

    //TODO: STATE: DESTROYED | CLOSING
    protected void onDestroy() {
        super.onDestroy();

        // Code for Pop Up Message
        Toast.makeText(this, "KhareedLo Closing!", Toast.LENGTH_SHORT).show();

        // Logging for Debugging
        Log.i("info", ">> APP STATE: DESTROYED (INVISIBLE | INACTIVE)");



    }


    //TODO: Catch Chicken Button Command
    public void openCage(View v){
        Toast.makeText(this, "Opening Shop Cage", Toast.LENGTH_SHORT).show();
        Log.i("info","Open Bird Cage");

        // Creating Intent

        Intent intent = new Intent(this, shop_menu.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        // Start Another Activity based on Intent
        startActivity(intent);

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

                intent = new Intent(this, shop_menu.class);
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

    @Override
    public final void onSensorChanged(SensorEvent event) {

        Sensor sensor = event.sensor;
        float millibarsOfPressure;
        float illumination;


        // Do something with this sensor data.
        TextView textPressure = findViewById(R.id.textPressure);
        TextView textLight = findViewById(R.id.textLight);

        if(sensor.getType() == Sensor.TYPE_PRESSURE)
        {
            millibarsOfPressure  = event.values[0];
            textPressure.setText(millibarsOfPressure +" hPa");

        }else if(sensor.getType() == Sensor.TYPE_LIGHT)
        {
            illumination  = event.values[0];
            textLight.setText(illumination + " lx");

        }




    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Do something here if sensor accuracy changes.
    }







}

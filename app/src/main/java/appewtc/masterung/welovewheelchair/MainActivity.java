package appewtc.masterung.welovewheelchair;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }   // Main Method

    public void clickHub1(View view) {
        startActivity(new Intent(MainActivity.this, DetailWheelChairActivity.class));
    }

    public void clickHub2(View view) {
        startActivity(new Intent(MainActivity.this, ShopWheelChairActivity.class));

    }

    public void clickHub3(View view) {
        startActivity(new Intent(MainActivity.this, TravelWheelChairActivity.class));
    }

    public void clickHub4(View view) {
        startActivity(new Intent(MainActivity.this, TripWheelChairActivity.class));
    }

}   // Main Class

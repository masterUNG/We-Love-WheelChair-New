package appewtc.masterung.welovewheelchair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailWheelChairActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private ImageView hub10ImageView, hub11ImageView, hub12ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wheel_chair);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

    }   // Main Method

    private void buttonController() {
        hub10ImageView.setOnClickListener(this);
        hub11ImageView.setOnClickListener(this);
        hub12ImageView.setOnClickListener(this);
    }

    private void bindWidget() {
        hub10ImageView = (ImageView) findViewById(R.id.imageView7);
        hub11ImageView = (ImageView) findViewById(R.id.imageView8);
        hub12ImageView = (ImageView) findViewById(R.id.imageView9);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.imageView7:

                Intent intent = new Intent(DetailWheelChairActivity.this, RequestInForm.class);
                startActivity(intent);

                break;
            case R.id.imageView8:
                break;
            case R.id.imageView9:
                break;

        }   // switch

    }   // onClick

}   // Main Class

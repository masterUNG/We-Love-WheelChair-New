package appewtc.masterung.welovewheelchair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RequestInForm extends AppCompatActivity {

    //Explicit
    private RadioGroup ragGroup1RadioGroup, ragGroup2RadioGroup,
            ragGroup3RadioGroup, ragGroup4RadioGroup, ragGroup5RadioGroup;
    private RadioButton choice1RadioButton, choice2RadioButton, choice3RadioButton,
            choice4RadioButton, choice5RadioButton, choice6RadioButton, choice7RadioButton,
            choice8RadioButton, choice9RadioButton, choice10RadioButton, choice11RadioButton,
            choice12RadioButton, choice13RadioButton, choice14RadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_in_form);

        //Bind Widget
        bindWidget();

        //Radio Controller
        radioController();

    }   // Main Method

    public void clickDataRequest(View view) {

        //Check Choose
        if (checkChoose()) {
            //Choosed


        } else {
            //Some One not Choose
            Toast.makeText(RequestInForm.this,
                    "โปรดตอบคำถามให้ครบ", Toast.LENGTH_SHORT).show();

        }

    }   // clickDataRequest

    private boolean checkChoose() {

        boolean bolResult = true;

        bolResult = (choice1RadioButton.isChecked() ||
                choice2RadioButton.isChecked() ||
                choice3RadioButton.isChecked())&&
                (choice4RadioButton.isChecked() ||
                choice5RadioButton.isChecked() ||
                choice6RadioButton.isChecked()) &&
                (choice7RadioButton.isChecked() ||
                choice8RadioButton.isChecked()) &&
                (choice9RadioButton.isChecked() ||
                choice10RadioButton.isChecked()) &&
                (choice11RadioButton.isChecked() ||
                choice12RadioButton.isChecked() ||
                choice13RadioButton.isChecked() ||
                choice14RadioButton.isChecked());

        return bolResult;
    }

    private void radioController() {

        //Group1
        ragGroup1RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {

                    case R.id.radioButton:
                        break;
                    case R.id.radioButton2:
                        break;
                    case R.id.radioButton3:
                        break;
                }

            }   // event
        });

        //Group2
        ragGroup2RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {

                    case R.id.radioButton4:
                        break;
                    case R.id.radioButton5:
                        break;
                    case R.id.radioButton6:
                        break;
                }

            }   // event
        });

        //Group3
        ragGroup3RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {

                    case R.id.radioButton7:
                        break;
                    case R.id.radioButton8:
                        break;

                }

            }   // event
        });

        //Group4
        ragGroup4RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {

                    case R.id.radioButton10:
                        break;
                    case R.id.radioButton11:
                        break;

                }

            }   // event
        });


        //Group5
        ragGroup5RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {

                    case R.id.radioButton13:
                        break;
                    case R.id.radioButton14:
                        break;
                    case R.id.radioButton15:
                        break;
                    case R.id.radioButton9:
                        break;

                }

            }   // event
        });


    }   // radioController

    private void bindWidget() {

        ragGroup1RadioGroup = (RadioGroup) findViewById(R.id.ragGroup1);
        ragGroup2RadioGroup = (RadioGroup) findViewById(R.id.ragGroup2);
        ragGroup3RadioGroup = (RadioGroup) findViewById(R.id.ragGroup3);
        ragGroup4RadioGroup = (RadioGroup) findViewById(R.id.ragGroup4);
        ragGroup5RadioGroup = (RadioGroup) findViewById(R.id.ragGroup5);

        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);

        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice5RadioButton = (RadioButton) findViewById(R.id.radioButton5);
        choice6RadioButton = (RadioButton) findViewById(R.id.radioButton6);

        choice7RadioButton = (RadioButton) findViewById(R.id.radioButton7);
        choice8RadioButton = (RadioButton) findViewById(R.id.radioButton8);

        choice9RadioButton = (RadioButton) findViewById(R.id.radioButton10);
        choice10RadioButton = (RadioButton) findViewById(R.id.radioButton11);

        choice11RadioButton = (RadioButton) findViewById(R.id.radioButton13);
        choice12RadioButton = (RadioButton) findViewById(R.id.radioButton14);
        choice13RadioButton = (RadioButton) findViewById(R.id.radioButton15);
        choice14RadioButton = (RadioButton) findViewById(R.id.radioButton9);



    }   // bindWidget

}   // Main Class

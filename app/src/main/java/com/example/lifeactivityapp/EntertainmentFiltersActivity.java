package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class EntertainmentFiltersActivity extends AppCompatActivity {

    public static final String MY_ENTERTAINMENT_CHOICES = "entertainmentChoices";
    String str, detailedChoice;

    RadioButton b = (RadioButton) findViewById(R.id.radioButton);
    RadioButton b2 = (RadioButton) findViewById(R.id.radioButton2);
    RadioButton b3 = (RadioButton) findViewById(R.id.radioButton3);
    RadioButton b4 = (RadioButton) findViewById(R.id.radioButton4);
    RadioButton b5 = (RadioButton) findViewById(R.id.radioButton5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_filters);

        Intent intent = getIntent();
        detailedChoice = intent.getStringExtra(MY_ENTERTAINMENT_CHOICES);

        b.setText("Action");
        b2.setText("Comedy");
        b3.setText("Romance");
        b4.setText("Kids");
        b5.setVisibility(View.INVISIBLE);
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.radioButton:
                if(checked)
                    str = "first";
                    break;
            case R.id.radioButton2:
                if(checked)
                    str = "second_Button";
                break;
            case R.id.radioButton3:
                if(checked)
                    str = "third_Button";
                break;
            case R.id.radioButton4:
                if(checked)
                    str = "fourth_Button";
                break;
            case R.id.radioButton5:
                if(checked)
                    str = "fifth_Button";
                break;
        }

        Intent intent = new Intent(this, EntertainmentDisplay.class);
        intent.putExtra(EntertainmentDisplay.BUTTON, str);
        intent.putExtra(EntertainmentDisplay.CATEGORY, detailedChoice);
    }


}

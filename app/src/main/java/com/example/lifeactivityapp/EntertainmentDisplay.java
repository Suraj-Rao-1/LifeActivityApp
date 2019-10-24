package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.lifeactivityapp.Movies.getAction;

public class EntertainmentDisplay extends AppCompatActivity {

    public static final String CATEGORY = "category";
    public static final String RADIO_GROUP = "radio_group";
    public static final String BUTTON = "button";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_display);

        TextView tv = findViewById(R.id.textView);

        if(CATEGORY.equals("movie") && BUTTON.equals("first")){
            for(int i = 0; i < getAction().length; i++)
            tv.setText("These are the list of movies " + getAction()[i].toString() + "/n");
        }

    }
}

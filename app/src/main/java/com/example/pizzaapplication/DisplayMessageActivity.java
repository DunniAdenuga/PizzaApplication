package com.example.pizzaapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String message = intent.getStringExtra(SelectionsActivity.EXTRA_MESSAGE);
        //Capture the layout's TextView and set the string as its text
        TextView textView = (TextView)findViewById(R.id.textView4);
        textView.setText(message);

        String message2 = intent.getStringExtra(SelectionsActivity.EXTRA_MESSAGE2);
        //Capture the layout's TextView and set the cost as its text
        TextView textView2 = (TextView)findViewById(R.id.textView6);
        textView2.setText(message2);
    }


}
package com.example.pizzaapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SelectionsActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.pizzaapplication.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.pizzaaapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selections);

    }

    /** Called when the user taps the ok button*/
    public void costMessage(View view){
        // Do something in response to ok button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString(); //gets Customer's name
        message = message + "!";

        double fullCost = 10.00; //standard pizza with no toppings or crust issues
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);//onion topping
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);//chicken topping
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);//sauce
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);// thin
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);//filled
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkBox6);//normal

        if(checkBox.isChecked())
            fullCost = fullCost + 1.25;
        if(checkBox2.isChecked())
            fullCost = fullCost + 2.00;
        if(checkBox3.isChecked())
            fullCost = fullCost + 1.25;

        if(checkBox4.isChecked())
            fullCost = fullCost + 2.25;
        else if(checkBox5.isChecked())
            fullCost = fullCost +2.25;
        else if(checkBox6.isChecked())
            fullCost = fullCost + 1.00;


        String message2 = "$ " + String.valueOf(fullCost) +"0";

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent);
    }
}

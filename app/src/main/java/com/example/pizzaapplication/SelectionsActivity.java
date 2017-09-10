package com.example.pizzaapplication;

import android.content.Intent;
import java.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SelectionsActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.pizzaapplication.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.pizzaaapplication.MESSAGE";
    double fullCost = 10.00; //standard pizza with no toppings or crust issues

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selections);

        //TextView textView = (TextView)findViewById(R.id.textView8);
        //String message = String.format("%.2f", 10);
        //textView.setText(message);

    }

    /** Called when the user taps the ok button*/
    public void costMessage(View view){
        // Do something in response to ok button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString(); //gets Customer's name
        message = message + "!";

        double fullcost = 10.00; //standard pizza with no toppings or crust issues
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);//onion topping
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);//chicken topping
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);//sauce
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);// thin
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);//filled
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkBox6);//normal

        if(checkBox.isChecked())
            fullcost = fullcost + 1.25;
        if(checkBox2.isChecked())
            fullcost = fullcost + 2.00;
        if(checkBox3.isChecked())
            fullcost = fullcost + 1.25;

        if(checkBox4.isChecked())
            fullcost = fullcost + 2.25;
        else if(checkBox5.isChecked())
            fullcost = fullcost +2.25;
        else if(checkBox6.isChecked())
            fullcost = fullcost + 1.00;


        String message2 = "$ " + String.format("%.2f", fullcost);

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent);
    }

    //Gets called if checked
    public void onCheckClicked(View view){

        TextView textView = (TextView)findViewById(R.id.textView8);

        //String message = String.format("%.2f", fullCost);
        String message = "";

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked) {
                    fullCost = fullCost + 1.25;
                    message = String.format("%.2f", fullCost);
                    textView.setText(message);
                }else{
                    fullCost = fullCost -  1.25;
                    message = String.format("%.2f", fullCost);
                    textView.setText(message);}
                break;
            case R.id.checkBox2:
                if (checked) {
                    fullCost = fullCost + 2.00;
                    message = String.format("%.2f", fullCost);
                    textView.setText(message);
                }else{
                    fullCost = fullCost -  2.00;
                    message = String.format("%.2f", fullCost);
                    textView.setText(message);}
                    break;
            case R.id.checkBox3:
                if (checked) {
                    fullCost = fullCost + 1.25;
                    message = String.format("%.2f", fullCost);
                    textView.setText(message);
                }else{
                    fullCost = fullCost -  1.25;
                message = String.format("%.2f", fullCost);
                textView.setText(message);}
                break;
            case R.id.checkBox4:
                if (checked) {
                    fullCost = fullCost + 2.25;
                    message = String.format("%.2f", fullCost);
                    textView.setText(message);
                }else{
                    fullCost = fullCost -  2.25;
                    message = String.format("%.2f", fullCost);
                    textView.setText(message);}
                break;
            case R.id.checkBox5:
                if (checked) {
                    fullCost = fullCost + 2.25;
                    message = String.format("%.2f", fullCost);
                    textView.setText(message);
                }else{
                    fullCost = fullCost -  2.25;
                message = String.format("%.2f", fullCost);
                textView.setText(message);}
                break;
            case R.id.checkBox6:
                if (checked) {
                    fullCost = fullCost + 1.00;
                    message = String.format("%.2f", fullCost);
                    textView.setText(message);
                }else{
                    fullCost = fullCost -  1.00;
                message = String.format("%.2f", fullCost);
                textView.setText(message);}
                break;
        }

    }
}

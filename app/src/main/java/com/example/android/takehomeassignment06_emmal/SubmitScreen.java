package com.example.android.takehomeassignment06_emmal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.android.takehomeassignment06_emmal.R.id.amount;

public class SubmitScreen extends AppCompatActivity
{

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_screen);

        displayText = (TextView) findViewById(R.id.display_text);

        Intent i = getIntent();

        Total total = (Total) i.getSerializableExtra(Keys.TOTAL);
        displayText.setText("Total: " + total.getAmountNew() + "\nSales Tax: " + total.getTaxNew() * 100
        + "\nTip: " + total.getTipNew() * 100 + "Grand Total: " + total.getNewAmount);
    }
}

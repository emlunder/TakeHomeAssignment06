package com.example.android.takehomeassignment06_emmal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    EditText amountWords;
    EditText taxWords;
    EditText tipWords;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigns variables to the XML screens
        amountWords = (EditText) findViewById(R.id.amount);

        taxWords = (EditText) findViewById(R.id.taxPercentage);

        tipWords = (EditText) findViewById(R.id.tipPercentage);
    }

    public void openSubmitScreen(View view)
    {

        String numb = amountWords.getText().toString();
        double amountNew = Integer.parseInt(numb);

        String taxP = amountWords.getText().toString();
        double taxNew = Integer.parseInt(taxP);

        String tipP = amountWords.getText().toString();
        double tipNew = Integer.parseInt(tipP);

        Total total = new Total();

        Intent i = new Intent(this, SubmitScreen.class);
        i.putExtra(Keys.TOTAL, total);
        startActivity(i);

    }
}

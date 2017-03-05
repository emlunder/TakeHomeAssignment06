package com.example.android.takehomeassignment06_emmal;

import android.widget.EditText;

import java.io.Serializable;

/**
 * Created by default on 3/4/17.
 */

public class Total implements Serializable
{
    private double amountNew;
    private double taxNew;
    private double tipNew;
    private double newAmount;

    private void Total(double amountNew, double taxNew, double tipNew)
    {
        this.amountNew = amountNew;
        this.taxNew = taxNew;
        this.tipNew = tipNew;
    }

    double getNewAmount = amountNew + (taxNew * amountNew) + (tipNew * amountNew);

    public double getAmountNew() {
        return amountNew;
    }

    public double getTaxNew() {
        return taxNew;
    }

    public double getTipNew() {
        return tipNew;
    }

    public double getNewAmount() {
        return newAmount;
    }
}

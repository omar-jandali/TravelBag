package com.example.janda_000.travelbag;

/**
 * Created by janda_000 on 3/2/2017.
 */

public class Group {

    private String gName;
    private double gTotal;
    private String gActivity;
    private double gAmount;

    public Group(String name, double total, String activity, double amount){

        gName = name;
        gTotal = total;
        gActivity = activity;
        gAmount = amount;

    }

    public String getgName() {
        return gName;
    }

    public double getgTotal() {
        return gTotal;
    }

    public String getgActivity() {
        return gActivity;
    }

    public double getgAmount() {
        return gAmount;
    }

}


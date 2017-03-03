package com.example.janda_000.travelbag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Group> groups = new ArrayList<Group>();

        groups.add(new Group("The Pack", 123.24, "Paid for the hotel", 12.22));
        groups.add(new Group("Za Homies", 23.16, "Paid for gas to SLO", 46.23));
        groups.add(new Group("#FreeGates", 87.19, "Movie tickets for Logan", 38.21));
        groups.add(new Group("Kanji Klub", 247.33, "Truck rental for off roading", 112.03));

        GroupAdapter groupAdapter = new GroupAdapter(this, groups);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(groupAdapter);

    }
}


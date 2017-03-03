package com.example.janda_000.travelbag;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by janda_000 on 3/2/2017.
 */

public class GroupAdapter extends ArrayAdapter<Group> {

    public GroupAdapter(Activity context, ArrayList<Group> groups){
        super(context, 0, groups);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listedItemView = convertView;
        if (listedItemView == null){
            listedItemView = LayoutInflater.from(getContext()).inflate(R.layout.group_item_list,
                    parent, false);
        }

        Group currentGroup = getItem(position);

        TextView groupName = (TextView) listedItemView.findViewById(R.id.group_name_view);
        TextView groupTotal = (TextView) listedItemView.findViewById(R.id.group_total_view);
        TextView groupActivity = (TextView) listedItemView.findViewById(R.id.group_recent_view);
        TextView groupAmount = (TextView) listedItemView.findViewById(R.id.group_amount_view);

        groupName.setText(String.valueOf(currentGroup.getgName()));
        groupTotal.setText(String.valueOf(currentGroup.getgTotal()));
        groupActivity.setText(String.valueOf(currentGroup.getgActivity()));
        groupAmount.setText(String.valueOf(currentGroup.getgAmount()));

        return listedItemView;
    }
}

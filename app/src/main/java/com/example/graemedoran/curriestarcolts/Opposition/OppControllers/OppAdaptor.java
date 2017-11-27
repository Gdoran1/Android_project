package com.example.graemedoran.curriestarcolts.Opposition.OppControllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.graemedoran.curriestarcolts.Opposition.OppModels.Team;
import com.example.graemedoran.curriestarcolts.R;

import java.util.ArrayList;

/**
 * Created by graemedoran on 27/11/2017.
 */

public class OppAdaptor extends ArrayAdapter<Team> {

    public OppAdaptor(Context context, ArrayList<Team> opponents) {
        super(context, 0, opponents);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.team_item, parent, false);
        }

        Team currentTeamItem = getItem(position);


        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentTeamItem.getName().toString());

        TextView positions = listItemView.findViewById(R.id.contact);
        positions.setText(currentTeamItem.getContact().toString());

        listItemView.setTag(currentTeamItem);

        return listItemView;

    }
}

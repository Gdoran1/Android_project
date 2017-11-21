package com.example.graemedoran.curriestarcolts.Controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.graemedoran.curriestarcolts.Models.Player;
import com.example.graemedoran.curriestarcolts.R;

import java.util.ArrayList;

/**
 * Created by graemedoran on 21/11/2017.
 */

public class CurrieStarAdaptor extends ArrayAdapter<Player> {


    public CurrieStarAdaptor(Context context, ArrayList<Player> squads) {
        super(context, 0, squads);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.squad_item, parent, false);
        }

        Player currentPlayerItem = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.squad_number);
        ranking.setText(currentPlayerItem.getSquadNumber().toString());

        TextView title = listItemView.findViewById(R.id.name);
        title.setText(currentPlayerItem.getName().toString());

        TextView year = listItemView.findViewById(R.id.position);
        year.setText(currentPlayerItem.getPosition().toString());

        listItemView.setTag(currentPlayerItem);

        return listItemView;

    }


}

package com.example.graemedoran.curriestarcolts.CurrieStar.Controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.graemedoran.curriestarcolts.CurrieStar.Models.Player;
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

        TextView squad_number = listItemView.findViewById(R.id.squad_number);
        squad_number.setText(currentPlayerItem.getSquadNumber().toString());

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentPlayerItem.getName().toString());

        TextView positions = listItemView.findViewById(R.id.position);
        positions.setText(currentPlayerItem.getPosition().toString());

        listItemView.setTag(currentPlayerItem);

        return listItemView;

    }


}

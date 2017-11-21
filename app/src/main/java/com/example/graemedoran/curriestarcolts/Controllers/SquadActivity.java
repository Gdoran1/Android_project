package com.example.graemedoran.curriestarcolts.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.example.graemedoran.curriestarcolts.Models.Player;
import com.example.graemedoran.curriestarcolts.Models.Squad;
import com.example.graemedoran.curriestarcolts.R;

import java.util.ArrayList;

public class SquadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squad);

        Squad squad = new Squad();

        ArrayList<Player> player = squad.getList();

        CurrieStarAdaptor currieStarAdaptor = new CurrieStarAdaptor(this, player);

        ListView listView =findViewById(R.id.list);

        listView.setAdapter(currieStarAdaptor);
    }

    public void getPlayer(View listItemSelected) {
        Player selectedPlayer = (Player) listItemSelected.getTag();
//       Toast.makeText(this, selectedPlayer.getName(), Toast.LENGTH_LONG).show();
    }

    public void onListItemClick(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}


package com.example.graemedoran.curriestarcolts.CurrieStar.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.graemedoran.curriestarcolts.CurrieStar.Models.Player;
import com.example.graemedoran.curriestarcolts.R;

import java.util.ArrayList;

public class SquadActivity extends MainActivity {

    DatabaseHelper myTeamDb;
    EditText  editSquadNumber, editName, editPosition, editId, editContact, editAddress,
    editE_mail, editTelephone;
    Button btnAddPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squad);
    }

    @Override
    protected void onResume() {
        super.onResume();

        ListView listView =findViewById(R.id.list);

        DatabaseHelper db = new DatabaseHelper(this);

        ArrayList<Player> players = db.getAllData();

        CurrieStarAdaptor currieStarAdaptor = new CurrieStarAdaptor(this, players);

        listView.setAdapter(currieStarAdaptor);
    }

    public void getPlayer(View listItemSelected) {
        Player selectedPlayer = (Player) listItemSelected.getTag();

    }

    public void onListItemClick(View view){
        Intent intent = new Intent(this, ProfileActivity.class);

        Player player = (Player) view.getTag();

        intent.putExtra("player", player);

        startActivity(intent);
    }

    public void buttonClick(View view) {
        Intent intent = new Intent(this, PlayerActivity.class);
        startActivity(intent);

    }
}

package com.example.graemedoran.curriestarcolts.Opposition.OppControllers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.graemedoran.curriestarcolts.CurrieStar.Controllers.MainActivity;
import com.example.graemedoran.curriestarcolts.Opposition.OppModels.Team;
import com.example.graemedoran.curriestarcolts.R;

import java.util.ArrayList;

public class OppTeamActivity extends MainActivity {

    OppDatabaseHelper myTeamDb;
    EditText editName, editId, editContact, editAddress,
            editE_mail, editTelephone, editLocation;
    Button btnNew_Team;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opp_team);
    }

    @Override
    protected void onResume() {
        super.onResume();

        ListView listView =findViewById(R.id.list);

        OppDatabaseHelper db = new OppDatabaseHelper(this);

        ArrayList<Team> teams = db.getAllData();

        OppAdaptor oppAdaptor = new OppAdaptor(this, teams);

        listView.setAdapter(oppAdaptor);
    }
    public void getTeam(View listItemSelected) {
        Team selectedTeam = (Team) listItemSelected.getTag();

    }

    public void onListItemClick(View view){
        Intent intent = new Intent(this, DetailsActivity.class);

        Team team = (Team) view.getTag();

        intent.putExtra("team", team);

        startActivity(intent);
    }

    public void buttonClick(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);
        startActivity(intent);

    }
}

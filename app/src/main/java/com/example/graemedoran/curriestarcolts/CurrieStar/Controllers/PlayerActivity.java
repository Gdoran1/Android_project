package com.example.graemedoran.curriestarcolts.CurrieStar.Controllers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.graemedoran.curriestarcolts.R;

public class PlayerActivity extends MainActivity {

    DatabaseHelper myTeamDb;
    EditText editSquadNumber, editName, editPosition;
    Button btnAddPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        myTeamDb = new DatabaseHelper(this);

        editSquadNumber = (EditText)findViewById(R.id.input_number);
        editName = (EditText)findViewById(R.id.input_name);
        editPosition = (EditText)findViewById(R.id.input_position);
        btnAddPlayer = (Button)findViewById(R.id.button_add_player);


    }

    public void addPlayer(View view) {
        String squadNumber = editSquadNumber.getText().toString();
        String name = editName.getText().toString();
        String position = editPosition.getText().toString();

        boolean isInserted = myTeamDb.insertData(squadNumber, name, position);
                        if (isInserted)
                            Toast.makeText(PlayerActivity.this, "Data Entered", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(PlayerActivity.this, "Data Not Entered", Toast.LENGTH_LONG).show();
                    }
    }



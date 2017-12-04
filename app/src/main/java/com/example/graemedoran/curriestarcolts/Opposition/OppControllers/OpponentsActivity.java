package com.example.graemedoran.curriestarcolts.Opposition.OppControllers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.graemedoran.curriestarcolts.CurrieStar.Controllers.MainActivity;
import com.example.graemedoran.curriestarcolts.R;

public class OpponentsActivity extends MainActivity {

    OppDatabaseHelper myOppDb;
    EditText  editInput_Team_Name, editInput_Contact_Name;
    Button btnAdd_Team;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opponents);
        myOppDb = new OppDatabaseHelper(this);

        editInput_Team_Name = (EditText)findViewById(R.id.input_team_name);
        editInput_Contact_Name = (EditText)findViewById(R.id.input_contact_name);
        btnAdd_Team = (Button)findViewById(R.id.add_new_team);
    }

    public void addTeam(View view) {
        String team_name = editInput_Team_Name.getText().toString();
        String contact = editInput_Contact_Name.getText().toString();

        boolean isInserted = myOppDb.insertData(team_name, contact);
        if (isInserted)
            Toast.makeText(OpponentsActivity.this, "Data Entered", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(OpponentsActivity.this, "Data Not Entered", Toast.LENGTH_SHORT).show();
        finish();


    }
}



package com.example.graemedoran.curriestarcolts.Opposition.OppControllers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.graemedoran.curriestarcolts.CurrieStar.Controllers.MainActivity;
import com.example.graemedoran.curriestarcolts.R;

public class OpponentsActivity extends MainActivity {
    OppDatabaseHelper myTeamDb;
    EditText  editTeam_Name, editContact;
    Button btnAddNew_Team;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opponents);
        myTeamDb = new OppDatabaseHelper(this);


        editTeam_Name = (EditText)findViewById(R.id.new_team_name);
        editContact = (EditText)findViewById(R.id.contact_name);

        btnAddNew_Team = (Button)findViewById(R.id.add_new_team);


    }

    public void addPlayer(View view) {
        String team_name = editTeam_Name.getText().toString();
        String contact = editContact.getText().toString();


        boolean isInserted = myTeamDb.insertData( team_name, contact);
        if (isInserted)
            Toast.makeText(OpponentsActivity.this, "Data Entered", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(OpponentsActivity.this, "Data Not Entered", Toast.LENGTH_SHORT).show();
        finish();
//        if(editText.length() !=0) {
//            AddData(newEntry);
//            editText.setText("");
//        } else {
//            Toast.makeText(ProfileActivity.this,"All text fields must be filled!", Toast.LENGTH_LONG).show();
//        }
    }
}



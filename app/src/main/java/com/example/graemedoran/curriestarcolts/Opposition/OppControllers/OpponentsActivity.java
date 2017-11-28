package com.example.graemedoran.curriestarcolts.Opposition.OppControllers;

import android.widget.Button;
import android.widget.EditText;

import com.example.graemedoran.curriestarcolts.CurrieStar.Controllers.MainActivity;

public class OpponentsActivity extends MainActivity {
    OppDatabaseHelper myTeamDb;
    EditText  editTeam_Name, editContact;
    Button btnAddNew_Team;


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_opponents);
//        myTeamDb = new OppDatabaseHelper(this);
//
//
//        editTeam_Name = (EditText)findViewById(R.id.input_team_name);
//        editLocation = (EditText)findViewById(R.id.input_location);
//        btnAddNew_Team = (Button)findViewById(R.id.button_add_new_team);
//
//
//    }

//    public void addPlayer(View view) {
//        String team_name = editTeam_Name.getText().toString();
//        String location = editLocation.getText().toString();
//
//        boolean isInserted = myTeamDb.insertData( team_name, location);
//        if (isInserted)
//            Toast.makeText(OpponentsActivity.this, "Data Entered", Toast.LENGTH_SHORT).show();
//        else
//            Toast.makeText(OpponentsActivity.this, "Data Not Entered", Toast.LENGTH_SHORT).show();
//        finish();
////        if(editText.length() !=0) {
////            AddData(newEntry);
////            editText.setText("");
////        } else {
////            Toast.makeText(ProfileActivity.this,"All text fields must be filled!", Toast.LENGTH_LONG).show();
////        }
//    }
}



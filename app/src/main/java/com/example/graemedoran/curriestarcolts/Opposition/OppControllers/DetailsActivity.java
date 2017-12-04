package com.example.graemedoran.curriestarcolts.Opposition.OppControllers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.graemedoran.curriestarcolts.CurrieStar.Controllers.MainActivity;
import com.example.graemedoran.curriestarcolts.Opposition.OppModels.Team;
import com.example.graemedoran.curriestarcolts.R;

public class DetailsActivity extends MainActivity {

    OppDatabaseHelper myOppDb;
    EditText editName, editContact, editEmail, editTel, editLocation;
    Button btnEdit;
    Button btnDelete;
    private Team team;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        myOppDb = new OppDatabaseHelper (this);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        team = (Team) extras.get("team");

        editName = (EditText)findViewById(R.id.editText_name);
        editName.setText(team.getName());
        editContact = (EditText)findViewById(R.id.editText_contact);
        editContact.setText(team.getContact());
        editEmail = (EditText)findViewById(R.id.editText_email);
        editEmail.setText(team.getE_Mail());
        editTel = (EditText)findViewById(R.id.editText_tel);
        editTel.setText(team.getTel());
        editLocation = (EditText)findViewById(R.id.editTextlocation);
        editLocation.setText(team.getLocation());
        btnEdit = (Button)findViewById(R.id.edit_button);
        btnDelete = (Button)findViewById(R.id.delete_button);
    }

    public void deleteTeam(View view){
        Integer deletedRows = myOppDb.deleteData(Integer.toString(team.getId()));
        if(deletedRows > 0 )
            Toast.makeText(DetailsActivity.this, "Data Deleted", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(DetailsActivity.this, "Failed to Delete", Toast.LENGTH_SHORT).show();
        finish();

    }
    public void updateDetails(View view) {
        String team_name = editName.getText().toString();
        String contact = editContact.getText().toString();
        String email = editEmail.getText().toString();
        String tel = editTel.getText().toString();
        String location = editLocation.getText().toString();


        myOppDb.updateData(team.getId(), team_name, contact, email, tel, location);
        finish();
    }
}

package com.example.graemedoran.curriestarcolts.CurrieStar.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.graemedoran.curriestarcolts.R;

public class ProfileActivity extends MainActivity {

    DatabaseHelper myTeamDb;
    EditText editName, editContact, editAddress, editEmail, editTel;
    Button btnEdit;
    Button btnDelete;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        myTeamDb = new DatabaseHelper (this);

        editName = (EditText)findViewById(R.id.editText_name);
        editContact = (EditText)findViewById(R.id.editText_contact);
        editAddress = (EditText)findViewById(R.id.editText_address);
        editEmail = (EditText)findViewById(R.id.editText_email);
        editTel = (EditText)findViewById(R.id.editText_tel);
        btnEdit = (Button)findViewById(R.id.edit_button);
        btnDelete = (Button)findViewById(R.id.delete_button);

        Intent intent = getIntent();

        Bundle extras = intent.getExtras();

        id = extras.getInt("id");

    }
    public void deletePlayer(View view){
                        Integer deletedRows = myTeamDb.deleteData(Integer.toString(id));
                        if(deletedRows > 0 )
                            Toast.makeText(ProfileActivity.this, "Data Deleted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(ProfileActivity.this, "Failed to Delete", Toast.LENGTH_SHORT).show();
                        finish();
                    }
}

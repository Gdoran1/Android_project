package com.example.graemedoran.curriestarcolts.CurrieStar.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.graemedoran.curriestarcolts.CurrieStar.Models.Player;
import com.example.graemedoran.curriestarcolts.R;

public class ProfileActivity extends MainActivity {

    DatabaseHelper myTeamDb;
    EditText editName, editContact, editAddress, editEmail, editTel;
//    ImageView editImage;
    Button btnEdit;
    Button btnDelete;
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        myTeamDb = new DatabaseHelper (this);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        player = (Player) extras.get("player");

        editName = (EditText)findViewById(R.id.editText_name);
        editName.setText(player.getName());
        editContact = (EditText)findViewById(R.id.editText_contact);
        editContact.setText(player.getContact());
        editAddress = (EditText)findViewById(R.id.editText_address);
        editAddress.setText(player.getAddress());
        editEmail = (EditText)findViewById(R.id.editText_email);
        editEmail.setText(player.getE_Mail());
        editTel = (EditText)findViewById(R.id.editText_tel);
        editTel.setText(player.getTel());
//        editImage = (ImageView) findViewById(R.id.image_player);
        btnEdit = (Button)findViewById(R.id.edit_button);
        btnDelete = (Button)findViewById(R.id.delete_button);
    }

    public void deletePlayer(View view){
                        Integer deletedRows = myTeamDb.deleteData(Integer.toString(player.getId()));
                        if(deletedRows > 0 )
                            Toast.makeText(ProfileActivity.this, "Data Deleted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(ProfileActivity.this, "Failed to Delete", Toast.LENGTH_SHORT).show();
                        finish();

    }

    public void updateDetails(View view) {
        String name = editName.getText().toString();
        String contact = editContact.getText().toString();
        String address = editAddress.getText().toString();
        String email = editEmail.getText().toString();
        String tel = editTel.getText().toString();
//        ImageView player= ImageView.

        myTeamDb.updateData(player.getId(), player.getSquadNumber(), name, player.getPosition(), contact, address, email, tel);
        finish();
    }
}



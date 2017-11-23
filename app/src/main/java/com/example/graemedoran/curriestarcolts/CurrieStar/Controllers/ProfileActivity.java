package com.example.graemedoran.curriestarcolts.CurrieStar.Controllers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.graemedoran.curriestarcolts.R;

public class ProfileActivity extends MainActivity {

    DatabaseHelper myTeamDb;
    EditText editName, editContact, editAddress, editEmail, editTel, editId;
    Button btnEdit;
    Button btnDelete;



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

    }
    public void deletePlayer(View view){
                        Integer deletedRows = myTeamDb.deleteData(editId.getText().toString());
                        if(deletedRows > 0 )
                            Toast.makeText(ProfileActivity.this, "Data Deleted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(ProfileActivity.this, "Failed to Delete", Toast.LENGTH_LONG).show();
                    }



//    public void updateData(){
//
//        btnEdit.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        boolean isUpdated = myTeamDb.updateData(editId.getText().toString(),editName.getText().toString(),
//                                editContact.getText().toString(),editAddress.getText().toString(), editEmail.getText().toString(),
//                                editTel.getText().toString());
//                        if(isUpdated == true)
//                            Toast.makeText(ProfileActivity.this, "Data Updated", Toast.LENGTH_LONG).show();
//                        else
//                            Toast.makeText(ProfileActivity.this, "Data Not Updated", Toast.LENGTH_LONG).show();
//                    }
//                }
//        );
//    }

}

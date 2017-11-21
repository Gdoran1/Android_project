package com.example.graemedoran.curriestarcolts.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.graemedoran.curriestarcolts.R;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDb;
//    EditText editSquadNumber, editName, editPosition, editId;
//    Button btnAddData;
//    Button btnViewAll;
//    Button btnUpdate;
//    Button btnDelete;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper (this);

    }

//        editSquadNumber = (EditText)findViewById(R.id.editText_name);
//        editName = (EditText)findViewById(R.id.editText_surname);
//        editPosition = (EditText)findViewById(R.id.editText_marks);
//        editId = (EditText)findViewById(R.id.editId);
//        btnAddData = (Button)findViewById(R.id.button_add);
//        btnViewAll = (Button)findViewById(R.id.View_all);
//        btnUpdate = (Button)findViewById(R.id.update_button);
//        btnDelete = (Button)findViewById(R.id.Button_delete);
//        addData();
//        viewAll();
//        updateData();
//        deleteData();


    public void onTeamButtonClick(View view){
        Intent intent = new Intent(this, SquadActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId() == R.id.action_about){
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }
        return true;
    }
}



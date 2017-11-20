package com.example.graemedoran.curriestarcolts.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.graemedoran.curriestarcolts.Models.Squad;
import com.example.graemedoran.curriestarcolts.R;

public class MainActivity extends AppCompatActivity {

    Button buttonTeam;
//    Button buttonOpponents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTeam = (Button) findViewById(R.id.squad_button);
//        buttonOpponents = (Button) findViewById(opp_button);
    }

    public void onTeamButtonClick(View view){
        Intent intent = new Intent(this, SquadActivity.class);
        Squad squad  = new Squad();


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
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            startActivity(intent);
        }
        return true;
    }
}



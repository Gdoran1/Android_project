package com.example.graemedoran.curriestarcolts.CurrieStar.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.graemedoran.curriestarcolts.Opposition.OppControllers.OppTeamActivity;
import com.example.graemedoran.curriestarcolts.R;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myTeamDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTeamDb = new DatabaseHelper (this);

    }

    public void onTeamButtonClick(View view){
        Intent intent = new Intent(this, SquadActivity.class);
        startActivity(intent);
    }

   public void onOpponetsButtonClick(View view){
        Intent intent = new Intent(this, OppTeamActivity.class);
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



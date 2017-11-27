package com.example.graemedoran.curriestarcolts.Opposition.OppControllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.graemedoran.curriestarcolts.Opposition.OppModels.Team;

import java.util.ArrayList;

/**
 * Created by graemedoran on 27/11/2017.
 */

public class OppDatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "myTeamDb";
    public static final String TABLE_NAME = "myOpposition_data";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "TEAM_NAME";
    public static final String COL_3 = "CONTACT";
    public static final String COL_4 = "E_MAIL";
    public static final String COL_5 = "TELEPHONE";
    public static final String COL_6 = "LOCATION";

    public OppDatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 2);

        SQLiteDatabase myTeamDb = this.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase myTeamDb) {
        myTeamDb.execSQL(" create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " SQUAD_NUMBER INTEGER, NAME TEXT,POSITION TEXT,CONTACT TEXT,ADDRESS TEXT," +
                "E_MAIL TEXT,TELEPHONE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase myTeamDb, int oldVersion, int newVersion) {
        myTeamDb.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(myTeamDb);
    }

    public boolean insertData(String name, String contact) {
        SQLiteDatabase myTeamDb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, name);
        contentValues.put(COL_2, contact);

        long result = myTeamDb.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public ArrayList<Team> getAllData() {
        SQLiteDatabase myTeamDb = this.getWritableDatabase();
        Cursor res = myTeamDb.rawQuery("select * from " + TABLE_NAME, null);

        ArrayList<Team> teams = new ArrayList<>();

        if (res != null) {

            if (res.moveToFirst()) {

                do {
                    int id = res.getInt(0);
                    String team_name = res.getString(1);
                    String contact = res.getString(2);
                    String email = res.getString(3);
                    String telephone = res.getString(4);
                    String location = res.getString(5);

                    Team team = new Team(id, team_name, contact, email, telephone, location);
                    teams.add(team);
//                    player.setContact(contact);
//                    player


                } while (res.moveToNext());

            }
        }
        return teams;
    }

    public boolean updateData(int id, String team_name,String contact, String e_mail,
                              String telephone,String location){

        SQLiteDatabase myTeamDb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,team_name);
        contentValues.put(COL_3,contact);
        contentValues.put(COL_4,e_mail);
        contentValues.put(COL_5,telephone);
        contentValues.put(COL_6,location);
        myTeamDb.update(TABLE_NAME,contentValues,"id = ?", new String[]{ String.valueOf(id) });
        return true;
    }

    public Integer deleteData(String id){
        SQLiteDatabase myTeamDb = this.getWritableDatabase();
        return myTeamDb.delete(TABLE_NAME,"id = ?",new String[]{ id });
    }

}
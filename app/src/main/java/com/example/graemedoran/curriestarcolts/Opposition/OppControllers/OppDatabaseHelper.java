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

    public static final String DATABASE_NAME = "myOppDb";
    public static final String TABLE_NAME = "myOpposition_data";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "TEAM_NAME";
    public static final String COL_3 = "CONTACT";
    public static final String COL_4 = "E_MAIL";
    public static final String COL_5 = "TELEPHONE";
    public static final String COL_6 = "LOCATION";

    public OppDatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 5);

        SQLiteDatabase myOppDb = this.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase myOppDb) {
        myOppDb.execSQL(" create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "TEAM_NAME TEXT,CONTACT TEXT,E_MAIL TEXT," +
                "TELEPHONE TEXT,LOCATION TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase myOppDb, int oldVersion, int newVersion) {
        myOppDb.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(myOppDb);
    }

    public boolean insertData(String team_name, String contact) {
        SQLiteDatabase myOppDb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, team_name);
        contentValues.put(COL_3, contact);

        long result;
        result = myOppDb.insert(TABLE_NAME, null, contentValues);
        return result != -1;
    }

    public ArrayList<Team> getAllData() {
        SQLiteDatabase myOppDb = this.getWritableDatabase();
        Cursor res = myOppDb.rawQuery("select * from " + TABLE_NAME, null);

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

        SQLiteDatabase myOppDb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,team_name);
        contentValues.put(COL_3,contact);
        contentValues.put(COL_4,e_mail);
        contentValues.put(COL_5,telephone);
        contentValues.put(COL_6,location);
        myOppDb.update(TABLE_NAME,contentValues,"id = ?", new String[]{ String.valueOf(id) });
        return true;
    }

    public Integer deleteData(String id){
        SQLiteDatabase myOppDb = this.getWritableDatabase();
        return myOppDb.delete(TABLE_NAME,"id = ?",new String[]{ id });
    }

}
package com.example.graemedoran.curriestarcolts.CurrieStar.Controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.graemedoran.curriestarcolts.CurrieStar.Models.Player;

import java.util.ArrayList;

/**
 * Created by graemedoran on 21/11/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "myTeamDb";
    public static final String TABLE_NAME = "mySquad_data";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "SQUAD_NUMBER";
    public static final String COL_3 = "NAME";
    public static final String COL_4 = "POSITION";
    public static final String COL_5 = "CONTACT";
    public static final String COL_6 = "ADDRESS";
    public static final String COL_7 = "E_MAIL";
    public static final String COL_8 = "TELEPHONE";


    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 5);

        SQLiteDatabase myTeamDb = this.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase myTeamDb) {
        myTeamDb.execSQL(" create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " SQUAD_NUMBER INTEGER, NAME TEXT,POSITION TEXT,CONTACT TEXT,ADDRESS TEXT," +
                "E_MAIL TEXT,TELEPHONE TEXT)" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase myTeamDb, int oldVersion, int newVersion) {
        myTeamDb.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(myTeamDb);
    }

    public boolean insertData(String squad_number, String name, String position){
        SQLiteDatabase myTeamDb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,squad_number);
        contentValues.put(COL_3,name);
        contentValues.put(COL_4,position);

        long result = myTeamDb.insert(TABLE_NAME,null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public ArrayList<Player> getAllData(){
        SQLiteDatabase myTeamDb = this.getWritableDatabase();
        Cursor res = myTeamDb.rawQuery("select * from "+TABLE_NAME,null);

        ArrayList<Player> players = new ArrayList<>();

        if(res != null) {

            if(res.moveToFirst()) {

                do {
                    int id = res.getInt(0);
                    int squadNumber = res.getInt(1);
                    String name = res.getString(2);
                    String position = res.getString(3);
                    String contact = res.getString(4);
                    String address = res.getString(5);
                    String email = res.getString(6);
                    String telephone = res.getString(7);

                    Player player = new Player(id, squadNumber, name, position, contact,address,email,telephone);
                    players.add(player);



                }while(res.moveToNext());

            }
        }
        return players;
    }
    public boolean updateData(int id,int squad_number, String name, String position,
                              String contact, String address, String e_mail, String telephone){
        SQLiteDatabase myTeamDb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,squad_number);
        contentValues.put(COL_3,name);
        contentValues.put(COL_4,position);
        contentValues.put(COL_5,contact);
        contentValues.put(COL_6,address);
        contentValues.put(COL_7,e_mail);
        contentValues.put(COL_8,telephone);
        myTeamDb.update(TABLE_NAME,contentValues,"id = ?", new String[]{ String.valueOf(id) });
        return true;
    }

    public Integer deleteData(String id){
        SQLiteDatabase myTeamDb = this.getWritableDatabase();
        return myTeamDb.delete(TABLE_NAME,"id = ?",new String[]{ id });
    }


}

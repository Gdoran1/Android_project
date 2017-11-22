package com.example.graemedoran.curriestarcolts.Controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
    public static final String COL_7 = "E-MAIL";
    public static final String COL_8 = "TELEPHONE";


    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 2);

        SQLiteDatabase db = this.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " SQUAD_NUMBER INTEGER, NAME TEXT,POSITION TEXT,CONTACT TEXT,ADDRESS TEXT," +
                "E_MAIL TEXT,TELEPHONE TEXT)" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String squad_number, String name, String position){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,squad_number);
        contentValues.put(COL_3,name);
        contentValues.put(COL_4,position);

        long result = db.insert(TABLE_NAME,null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }
    public boolean updateData(String id,String squad_number, String name, String position,
                              String contact, String address, String e_mail, String telephone){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,squad_number);
        contentValues.put(COL_3,name);
        contentValues.put(COL_4,position);
        contentValues.put(COL_5,contact);
        contentValues.put(COL_6,address);
        contentValues.put(COL_7,e_mail);
        contentValues.put(COL_8,telephone);
        db.update(TABLE_NAME,contentValues,"id = ?",new String[]{ id } );
        return true;
    }

    public Integer deleteData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME,"id = ?",new String[]{ id });
    }


}

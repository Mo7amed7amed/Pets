package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.pets.data.petContract.petEntry;

/**
 * Created by Mohamed on 1/30/2018.
 */

public class petDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="shelter.db";
    private static final int DATABASE_VERSION=1;
    public petDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + petEntry.TABLE_NAME + " ("
                + petEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + petEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
                + petEntry.COLUMN_PET_BREED + " TEXT, "
                + petEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                + petEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

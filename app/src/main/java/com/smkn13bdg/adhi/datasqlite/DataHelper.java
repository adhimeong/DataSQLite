package com.smkn13bdg.adhi.datasqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by adhi on 22/09/16.
 */

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "biodatadiri.db";
    private  static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null)";
        Log.d("Data", "onCreate : " +sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata(no, nama, tgl, jk, alamat) VALUES ('101', 'Adhi Ismail Hasan','1999-02-03','laki-laki','bandung')";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

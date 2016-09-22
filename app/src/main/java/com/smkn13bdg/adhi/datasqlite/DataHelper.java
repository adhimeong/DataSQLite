package com.smkn13bdg.adhi.datasqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by adhi on 22/09/16.
 */

public class DataHelper extends SQLiteOpenHelper {



    public DataHelper(Context context) {
        super(context, );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

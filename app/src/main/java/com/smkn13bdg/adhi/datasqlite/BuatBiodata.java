package com.smkn13bdg.adhi.datasqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.smkn13bdg.adhi.datasqlite.R.id.text;

public class BuatBiodata extends AppCompatActivity {

    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton1, ton2;
    EditText text1, text2, text3, text4, text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_biodata);

        dbHelper = new DataHelper(this);
        text1 = (EditText)findViewById(R.id.input1);
        text2 = (EditText)findViewById(R.id.input2);
        text3 = (EditText)findViewById(R.id.input3);
        text4 = (EditText)findViewById(R.id.input4);
        text5 = (EditText)findViewById(R.id.input5);
        ton1 = (Button)findViewById(R.id.simpan1);
        ton2 = (Button)findViewById(R.id.kembali2);

        ton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("INSERT INTO biodata(no, nama, tgl, jk, alamat) VALUES('"
                text1.getText().toString()+"','"+text1.getText().toString()+)");
            }
        });

    }
}

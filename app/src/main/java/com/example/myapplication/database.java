package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
public class database extends SQLiteOpenHelper {

    public  database(@Nullable Context context, @Nullable String name,
                     @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table student (id integer primary key autoincrement,name varchar,age integer)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int m, int n) {
    }
}


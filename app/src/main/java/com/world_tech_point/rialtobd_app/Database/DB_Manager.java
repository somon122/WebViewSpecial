package com.world_tech_point.rialtobd_app.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DB_Manager {


    DB_helper dbHelper;
    SQLiteDatabase db;
    String links;


    public DB_Manager(Context context) {
        dbHelper = new DB_helper(context);

    }

    public Boolean Save_All_Data(LinkClass linkClass) {
        db = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(DB_helper.KEY_LINK, linkClass.getLink());
        long isInsert = db.insert(DB_helper.DOCTORS_TABLE, null, contentValues);
        db.close();
        if (isInsert > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getData(String link) {

        db = dbHelper.getReadableDatabase();
        String Query = "Select * from " + DB_helper.DOCTORS_TABLE + " where " + DB_helper.KEY_LINK + " = ?";
        Cursor cursor = db.rawQuery(Query, new String[]{link});
        if (cursor.moveToFirst()) {
            do {
                links = cursor.getString(cursor.getColumnIndex(DB_helper.KEY_LINK));

            } while (cursor.moveToNext());
            db.close();
        }

        return links;


    }

}

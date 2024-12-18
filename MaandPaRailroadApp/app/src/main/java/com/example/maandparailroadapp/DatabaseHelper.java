package com.example.maandparailroadapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author Phoebe
 * @date 12/9/2024
 * @description DatabaseHelper for the events page
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "events.db";
    private static final int DATABASE_VERSION = 2;

    public static final String TABLE_EVENTS = "events";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_TIME = "time";

    public static final String TABLE_SAVED_EVENTS = "saved_events";
    public static final String COLUMN_USER_ID = "user_id";
    public static final String COLUMN_EVENT_ID = "event_id";

    private static final String TABLE_CREATE_EVENTS =
            "CREATE TABLE " + TABLE_EVENTS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_TITLE + " TEXT, " +
                    COLUMN_DESCRIPTION + " TEXT, " +
                    COLUMN_DATE + " TEXT, " +
                    COLUMN_TIME + " TEXT" +
                    ");";

    private static final String TABLE_CREATE_SAVED_EVENTS =
            "CREATE TABLE " + TABLE_SAVED_EVENTS + " (" +
                    COLUMN_USER_ID + " INTEGER, " +
                    COLUMN_EVENT_ID + " INTEGER, " +
                    "FOREIGN KEY(" + COLUMN_EVENT_ID + ") REFERENCES " + TABLE_EVENTS + "(" + COLUMN_ID + ")" +
                    ");";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE_EVENTS);
        db.execSQL(TABLE_CREATE_SAVED_EVENTS);

        // Insert events with correct dates
        insertEvent(db, "Christmas City Express", "The Christmas City Express program is centered around the dramatic reading of a story of a young girl traveling to Muddy Creek Forks a hundred years ago to visit her grandparents for Christmas.", "2024-12-07", "5 pm & 7 pm");
        insertEvent(db, "Christmas City Express", "The Christmas City Express program is centered around the dramatic reading of a story of a young girl traveling to Muddy Creek Forks a hundred years ago to visit her grandparents for Christmas.", "2024-12-08", "1:30 pm & 3:30 pm & 5:30 pm");
        insertEvent(db, "Christmas City Express", "The Christmas City Express program is centered around the dramatic reading of a story of a young girl traveling to Muddy Creek Forks a hundred years ago to visit her grandparents for Christmas.", "2024-12-14", "5 pm & 7 pm");
        insertEvent(db, "Christmas City Express", "The Christmas City Express program is centered around the dramatic reading of a story of a young girl traveling to Muddy Creek Forks a hundred years ago to visit her grandparents for Christmas.", "2024-12-15", "1:30 pm & 3:30 pm & 5:30 pm");
        insertEvent(db, "Christmas City Express", "The Christmas City Express program is centered around the dramatic reading of a story of a young girl traveling to Muddy Creek Forks a hundred years ago to visit her grandparents for Christmas.", "2024-12-21", "1:30 pm & 3:30 pm & 5:30 pm");
        insertEvent(db, "Christmas City Express", "The Christmas City Express program is centered around the dramatic reading of a story of a young girl traveling to Muddy Creek Forks a hundred years ago to visit her grandparents for Christmas.", "2024-12-22", "1:30 pm & 3:30 pm & 5:30 pm");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EVENTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SAVED_EVENTS);
        onCreate(db);
    }

    public void insertEvent(SQLiteDatabase db, String title, String description, String date, String time) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_TITLE, title);
        values.put(COLUMN_DESCRIPTION, description);
        values.put(COLUMN_DATE, date);
        values.put(COLUMN_TIME, time);
        db.insert(TABLE_EVENTS, null, values);
    }
}

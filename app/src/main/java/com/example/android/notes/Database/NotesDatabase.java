package com.example.android.notes.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.android.notes.Models.Notes;

@Database(entities = {Notes.class},version = 1)
public abstract class NotesDatabase extends RoomDatabase {

}

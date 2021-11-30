package com.example.android.notes.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.android.notes.Models.Notes;

import java.util.List;

@androidx.room.Dao
public interface NotesDao {

    @Query("SELECT * FROM `Notes Database`")
    LiveData<List<Notes>> getAllNotes();

    @Insert
     void insertNotes(Notes... notes);

    @Query("DELETE FROM `Notes Database` WHERE id =:id")
    void deleteNotes(int id);

    @Update
    void insertNotes(Notes notes);

}

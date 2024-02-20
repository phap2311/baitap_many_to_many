package com.example.manage_note.service;

import com.example.manage_note.models.Note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class NoteService implements  INoteService{
    @Override
    public List<Note> findAll() {
        Connection connection = DBConnection.getConnection();
        List<Note>noteList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from notes");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int idNote = resultSet.getInt("id_note");
                String nameNote = resultSet.getString("name_note");
                String content = resultSet.getString("content_note");
                String dayNote = resultSet.getString("day_note");
                Note note = new Note(idNote,nameNote,content,dayNote);
                noteList.add(note);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return noteList;
    }
}

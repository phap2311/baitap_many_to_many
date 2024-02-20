package com.example.manage_note.service;

import com.example.manage_note.models.DTONoCa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NoteCategoryService implements INoteCategoryService {
    @Override
    public List<DTONoCa> findAll() {
        Connection connection = DBConnection.getConnection();
        List<DTONoCa> dtoNoCaList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select note_category.id,notes.name_note,notes.content_note,notes.day_note,group_concat(category.name_category) as category_name,category.descriptions \n" +
                    "from notes join note_category on \n" +
                    "note_category.id_note = notes.id_note\n" +
                    "join category on category.id_category = note_category.id_category\n" +
                    "group by note_category.id_note;");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nameCategory = resultSet.getString("category_name");
                String descriptions = resultSet.getString("descriptions");
                String nameNote = resultSet.getString("name_note");
                String content = resultSet.getString("content_note");
                String dayNote = resultSet.getString("day_note");
                DTONoCa dtoNoCa = new DTONoCa(id, nameCategory, descriptions, nameNote, content, dayNote);
                dtoNoCaList.add(dtoNoCa);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return dtoNoCaList;
    }
}

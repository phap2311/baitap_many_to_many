package com.example.manage_note.service;

import com.example.manage_note.models.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryService implements ICategoryService {
    @Override
    public List<Category> findAll() {
        Connection connection = DBConnection.getConnection();
        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from category");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idCategory = resultSet.getInt("id_category");
                String nameCategory = resultSet.getString("name_category");
                String descriptions = resultSet.getString("descriptions");
                Category category = new Category(idCategory, nameCategory, descriptions);
                categories.add(category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return categories;
    }
}

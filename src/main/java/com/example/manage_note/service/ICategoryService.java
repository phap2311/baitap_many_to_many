package com.example.manage_note.service;

import com.example.manage_note.models.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}

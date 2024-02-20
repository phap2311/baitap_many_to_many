package com.example.manage_note.service;

import com.example.manage_note.models.DTONoCa;

import java.util.List;

public interface INoteCategoryService {
    List<DTONoCa> findAll();
}

package com.example.manage_note.service;

import com.example.manage_note.models.Note;

import java.util.List;

public interface INoteService {
    List<Note> findAll();
}

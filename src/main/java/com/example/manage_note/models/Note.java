package com.example.manage_note.models;

import java.util.List;
import java.util.PrimitiveIterator;

public class Note {
    private int idNote;
    private String nameNote;
    private String content;
    private String dayNote;


    public Note() {
    }

    public Note(int idNote, String nameNote, String content, String dayNote, List<Category> categoryList) {
        this.idNote = idNote;
        this.nameNote = nameNote;
        this.content = content;
        this.dayNote = dayNote;

    }

    public Note(int idNote, String nameNote, String content, String dayNote) {
        this.idNote = idNote;
        this.nameNote = nameNote;
        this.content = content;
        this.dayNote = dayNote;
    }

    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public String getNameNote() {
        return nameNote;
    }

    public void setNameNote(String nameNote) {
        this.nameNote = nameNote;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDayNote() {
        return dayNote;
    }

    public void setDayNote(String dayNote) {
        this.dayNote = dayNote;
    }


}

package com.example.manage_note.models;

public class DTONoCa {
    private int id;
    private String nameCategory;
    private String descriptions;
    private String nameNote;
    private String content;
    private String dayNote;

    public DTONoCa() {

    }

    public DTONoCa(int id, String nameCategory, String descriptions, String nameNote, String content, String dayNote) {
        this.id = id;
        this.nameCategory = nameCategory;
        this.descriptions = descriptions;
        this.nameNote = nameNote;
        this.content = content;
        this.dayNote = dayNote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
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

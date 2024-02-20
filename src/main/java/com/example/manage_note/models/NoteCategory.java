package com.example.manage_note.models;

public class NoteCategory {
    private int id;
    private int idN;
    private int idC;


    public NoteCategory() {
    }

    public NoteCategory(int id, int idN, int idC) {
        this.id = id;
        this.idN = idN;
        this.idC = idC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdN() {
        return idN;
    }

    public void setIdN(int idN) {
        this.idN = idN;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }
}

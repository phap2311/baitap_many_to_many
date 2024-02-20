package com.example.manage_note.models;

public class Category {
    private int idCategory;
    private String nameCategory;
    private String descriptions;

    public Category() {
    }

    public Category(int idCategory, String nameCategory, String descriptions) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.descriptions = descriptions;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
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
}

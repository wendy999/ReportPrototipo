package com.example.anyta.reportprototipo.pojo;

public class UserVo  {


    private String Grade;
    private String Name;
    private String Description;
    private int image;


    public UserVo(String grade, String name, String description, int image) {
        Grade = grade;
        Name = name;
        Description = description;
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
}





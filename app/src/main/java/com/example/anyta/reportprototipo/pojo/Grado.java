package com.example.anyta.reportprototipo.pojo;

import java.util.Date;

public class Grado
{

    //CAMPOS QUE VA TENER EL GRADO EN LA BASE DE DATOS
        private String id_grade;
        private String id_profesor;
        private String nombre;

    public Grado(String id_grade, String id_profesor, String nombre) {
        this.id_grade = id_grade;
        this.id_profesor = id_profesor;
        this.nombre = nombre;
    }

    public String getId_grade() {
        return id_grade;
    }

    public void setId_grade(String id_grade) {
        this.id_grade = id_grade;
    }

    public String getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(String id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

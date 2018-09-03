package com.example.anyta.reportprototipo.Utilidades;

public class Utilidades
{
    //CONSTANTES CAMPOS DE LA TABLA ESTUDIANTES
    public static final String TABLA_ESTUDIANTE="estudiante";
    public static final String CAMPO_DOCUMENTO="documento";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_FECHA_NACIMIENTO="fechaNacimiento";
    public static final String CAMPO_NOMBRE_ACUDIENTE="NombreAcudiente";
    public static final String CAMPO_GRADO="grado";
    public static final String CAMPO_CONTRASEÑA="contraseña";
    public static final String CAMPO_CONFIRMAR_CONTRASEÑA="confirmarContraseña";
    public static final String USER_ID_USER="user_id_user";

    public static final String CREAR_TABLA_ESTUDIANTE="CREATE TABLE " +TABLA_ESTUDIANTE+ "("+CAMPO_DOCUMENTO+" INTEGER," + CAMPO_NOMBRE+" TEXT," + CAMPO_APELLIDO+" TEXT, " + CAMPO_FECHA_NACIMIENTO+" DATE," + CAMPO_NOMBRE_ACUDIENTE+" TEXT, " + CAMPO_GRADO+" TEXT," + CAMPO_CONTRASEÑA+" TEXT," + CAMPO_CONFIRMAR_CONTRASEÑA+" TEXT," + USER_ID_USER+" INTEGER)";


    //CONSTANTES CAMPOS DE LA TABLA PROFESOR
    public static final String TABLA_PROFESOR="profesor";
    public static final String CAMPO_DOCUMENTO_PROFESRO="documento";
    public static final String CAMPO_NOMBRE_PROFESOR="nombre";
    public static final String CAMPO_APELLIDO_PROFESOR="apellido";
    public static final String CAMPO_MATERIA_PROFESOR="id_tabla";
    public static final String CAMPO_CONTRASEÑA_PROFESOR="contraseña";
    public static final String CAMPO_CONFIRMAR_CONTRASEÑA_PROFESOR="confirmarContraseña";
    public static final String USER_ID_USER_PROFESOR="user_id_user";

    public static final String CREAR_TABLA_PEOFESOR="CREATE TABLE " +TABLA_ESTUDIANTE+ "("+CAMPO_DOCUMENTO+" INTEGER," + CAMPO_NOMBRE+" TEXT," + CAMPO_APELLIDO+" TEXT, " + CAMPO_FECHA_NACIMIENTO+" DATE," + CAMPO_NOMBRE_ACUDIENTE+" TEXT, " + CAMPO_GRADO+" TEXT," + CAMPO_CONTRASEÑA+" TEXT," + CAMPO_CONFIRMAR_CONTRASEÑA+" TEXT," + USER_ID_USER+" INTEGER)";

}
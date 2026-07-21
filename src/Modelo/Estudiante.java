/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author angie
 */
public class Estudiante {
 private String nombre,cedula,IdMatricula,apellido,correo;

    public Estudiante() {
    }

    public Estudiante(String nombre, String cedula, String IdMatricula, String apellido, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.IdMatricula = IdMatricula;
        this.apellido = apellido;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getIdMatricula() {
        return IdMatricula;
    }

    public void setIdMatricula(String IdMatricula) {
        this.IdMatricula = IdMatricula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
 
    
 
        
}

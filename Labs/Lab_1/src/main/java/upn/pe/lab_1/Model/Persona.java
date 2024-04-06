/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upn.pe.lab_1.Model;

/**
 *
 * @author hugoroca
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private String dni;
    private String lugarNacimiento;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    // Constructor
    public Persona(String nombres, String apellidos, String dni, String lugarNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.lugarNacimiento = lugarNacimiento;
    }
}

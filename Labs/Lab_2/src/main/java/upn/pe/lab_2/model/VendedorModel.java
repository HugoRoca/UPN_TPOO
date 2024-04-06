/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upn.pe.lab_2.model;

/**
 *
 * @author hugoroca
 */
public class VendedorModel {
    private int codigo;
    private String nombre;
    private char sexo;
    private double sueldo;
    private double totalVentas;

    // Constructor
    public VendedorModel(int codigo, String nombre, char sexo, double sueldo, double totalVentas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.totalVentas = totalVentas;
    }

    // Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }
}

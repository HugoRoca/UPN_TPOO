/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upn.pe.lab_2.service;

/**
 *
 * @author hugoroca
 */
public class VendedorService {
    public double calcularComision(double totalVentas) {
        double comision;
        if (totalVentas <= 5000) {
            comision = totalVentas * 0.15;
        } else if (totalVentas <= 15000) {
            comision = totalVentas * 0.172;
        } else if (totalVentas <= 20000) {
            comision = totalVentas * 0.20;
        } else {
            comision = totalVentas * 0.235;
        }
        return comision;
    }

    public double calcularBono(char sexo, double sueldo) {
        double bono;
        if (sexo == 'F') {
            bono = sueldo * 0.045;
        } else {
            bono = sueldo * 0.032;
        }
        return bono;
    }

    public double calcularTotalIngresos(double sueldo, double totalVentas, char sexo) {
        return sueldo + this.calcularComision(totalVentas) + this.calcularBono(sexo, sueldo);
    }

    public double calcularDescuento(double totalIngresos) {
        return totalIngresos * 0.13;
    }

    public double calcularNetoPagar(double totalIngresos, double descuento) {
        return totalIngresos - descuento;
    }
}

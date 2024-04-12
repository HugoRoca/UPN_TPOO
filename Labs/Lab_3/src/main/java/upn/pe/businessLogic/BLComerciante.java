/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upn.pe.businessLogic;

import upn.pe.model.ComercianteModel;

/**
 *
 * @author hugoroca
 */
public class BLComerciante {

    /*
    Cuadro de comisiones
    0-4000 -> 14.0%
    4001-14000 -> 16.0%
    14001-19000 -> 18.0%
    >19000 -> 20.5%
    
    
    Bono por hijos
    hijos - femenino - masculino
    1 -> 1.2% - 1%
    2 -> 1.4% - 1.2%
    3 -> 1.6% - 1.4%
    >3 -> 1.9% - 1.7%
    
     */

    private ComercianteModel comercianteModel;

    public BLComerciante(ComercianteModel _comerciante) {
        comercianteModel = _comerciante;
    }

    public double CalcularComision() {
        double percent = 0.0;
        double totalSales = this.comercianteModel.getTotalSales();

        if (totalSales > 0 && totalSales <= 4000) {
            return 0.14;
        } else if (totalSales > 4000 && totalSales <= 14000) {
            return 0.16;
        } else if (totalSales > 14000 && totalSales <= 19000) {
            return 0.18;
        } else if (totalSales > 19000) {
            return 0.205;
        }

        return percent;
    }

    public double CalcularPremio() {
        return this.comercianteModel.getSalary() * (this.comercianteModel.getGender().toUpperCase().equals("FEMENINO") ? 0.0305 : 0.0201);
    }
    
    public double CalcularBonoHijo(){
        int children = this.comercianteModel.getChildren();
        double auxBono = this.comercianteModel.getGender().toUpperCase().equals("FEMENINO") ? 0.002 : 0;
        
        if (children == 1) {
            return 0.01 + auxBono;
        } else if (children == 2){
            return 0.012 + auxBono;
        } else if(children == 3) {
            return 0.014 + auxBono;
        } else if(children > 3){
            return 0.017 + auxBono;
        }
        
        return 0;
    }
    
    public double CalcularTotalIngresos(){
        return this.comercianteModel.getSalary() + this.CalcularComision() + this.CalcularPremio() + this.CalcularBonoHijo();
    }
    
    public double CalcularDescuento(){
        return this.CalcularTotalIngresos() * 0.12;
    }
    
    public double CalcularPagoNeto(){
        return this.CalcularTotalIngresos() - this.CalcularDescuento();
    }
}

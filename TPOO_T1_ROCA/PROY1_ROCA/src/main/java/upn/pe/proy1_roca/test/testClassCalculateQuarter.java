/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upn.pe.proy1_roca.test;

import upn.pe.proy1_roca.service.EvaluateDateService;

/**
 *
 * @author hugoroca
 */
public class testClassCalculateQuarter {

    public static void main(String args[]) {
        EvaluateDateService service = new EvaluateDateService();
        
         System.out.println("Fecha 40/15/2014");

        if (service.isValidDate(40, 15, 2014)) {
            System.out.println("Fecha Valida");
            System.out.println("Trimeste: " + service.calculateQuarter(15));
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 25/4/2024");
        if (service.isValidDate(25, 4, 2024)) {
            System.out.println("Trimestre: " + service.calculateQuarter(4));
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }
    }
}

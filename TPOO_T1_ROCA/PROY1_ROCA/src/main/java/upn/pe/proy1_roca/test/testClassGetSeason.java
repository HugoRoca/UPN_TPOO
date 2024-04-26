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
public class testClassGetSeason {
    
    public static void main(String args[]) {
        EvaluateDateService service = new EvaluateDateService();

        System.out.println("Fecha 1/2/3");
        if (service.isValidDate(1, 2, 3)) {
            System.out.println("Estación: " + service.getSeason(1, 2));
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 1/12/1990");
        if (service.isValidDate(1, 12, 1990)) {
            System.out.println("Estación: " + service.getSeason(1, 12));
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 40/2/2014");

        if (service.isValidDate(40, 2, 2014)) {
            System.out.println("Estación: " + service.getSeason(40, 2));
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 25/7/2024");
        if (service.isValidDate(25, 7, 2024)) {
            System.out.println("Estación: " + service.getSeason(25, 7));
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }
    }
}

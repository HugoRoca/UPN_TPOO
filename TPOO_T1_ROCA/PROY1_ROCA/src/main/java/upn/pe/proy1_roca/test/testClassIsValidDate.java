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
public class testClassIsValidDate {

    public static void main(String args[]) {
        EvaluateDateService service = new EvaluateDateService();

        System.out.println("TEST CON FUNCIÓN DE ALGORITMO");
        System.out.println("Fecha 1/2/3");
        if (service.isValidDateAlgorithm(1, 2, 3)) {
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 1/2/1990");
        if (service.isValidDateAlgorithm(1, 2, 1990)) {
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 40/2/2014");

        if (service.isValidDateAlgorithm(40, 2, 2014)) {
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 25/4/2024");
        if (service.isValidDateAlgorithm(25, 4, 2024)) {
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }
        
        
        System.out.println("TEST CON FUNCIÓN DE CLASE");
         System.out.println("Fecha 1/2/3");
        if (service.isValidDate(1, 2, 3)) {
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 1/2/1990");
        if (service.isValidDate(1, 2, 1990)) {
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 40/2/2014");

        if (service.isValidDate(40, 2, 2014)) {
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }

        System.out.println("-----");
        System.out.println("Fecha 25/4/2024");
        if (service.isValidDate(25, 4, 2024)) {
            System.out.println("Fecha Valida");
        } else {
            System.out.println("Fecha Invalida");
        }
    }
}

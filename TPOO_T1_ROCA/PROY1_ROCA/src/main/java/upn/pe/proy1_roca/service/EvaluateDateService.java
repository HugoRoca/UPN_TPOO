/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upn.pe.proy1_roca.service;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 *
 * @author hugoroca
 */
public class EvaluateDateService {

    public EvaluateDateService() {
    }

    public boolean isValidDate(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }

    public boolean isValidDateAlgorithm(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1 || year < 1) {
            return false; // Mes y día deben estar en los rangos correctos
        }

        // Determinar si el año es bisiesto
        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        // Días máximos en cada mes
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Ajustar febrero para los años bisiestos
        if (isLeapYear) {
            daysInMonth[1] = 29;
        }

        return day <= daysInMonth[month - 1]; 
    }

    public String calculateQuarter(int month) {
        int quarter = (month - 1) / 3 + 1;
        return "T" + quarter;
    }

    public String getSeason(int day, int month) {
        if ((month == 12 && day >= 21) || (month == 1) || (month == 2) || (month == 3 && day <= 20)) {
            return "Verano";
        } // Otoño: 21 de marzo a 20 de junio
        else if ((month == 3 && day >= 21) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return "Otoño";
        } // Invierno: 21 de junio a 22 de septiembre
        else if ((month == 6 && day >= 21) || (month == 7) || (month == 8) || (month == 9 && day <= 22)) {
            return "Invierno";
        } // Primavera: 23 de septiembre a 20 de diciembre
        else if ((month == 9 && day >= 23) || (month == 10) || (month == 11) || (month == 12 && day <= 20)) {
            return "Primavera";
        } else {
            return "No valido";
        }
    }
}

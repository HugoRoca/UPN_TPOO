/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package upn.pe.lab_1;

import java.util.Scanner;
import upn.pe.lab_1.Model.Persona;

/**
 *
 * @author hugoroca
 */
public class Lab_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese nombres:");
        String nombres = scanner.nextLine();

        System.out.println("Ingrese apellidos:");
        String apellidos = scanner.nextLine();

        System.out.println("Ingrese DNI:");
        String dni = scanner.nextLine();

        System.out.println("Ingrese lugar de nacimiento:");
        String lugarNacimiento = scanner.nextLine();

        // Crear una instancia de Persona con los datos proporcionados
        Persona persona = new Persona(nombres, apellidos, dni, lugarNacimiento);

        // Mostrar los datos de la persona
        System.out.println("\nDatos de la persona:");
        System.out.println("Nombres: " + persona.getNombres());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("DNI: " + persona.getDni());
        System.out.println("Lugar de Nacimiento: " + persona.getLugarNacimiento());

        scanner.close();
    }
}

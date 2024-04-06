/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package upn.pe.lab_2;

import java.util.Scanner;
import upn.pe.lab_2.model.VendedorModel;
import upn.pe.lab_2.service.VendedorService;

/**
 *
 * @author hugoroca
 */
public class Lab_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir datos del vendedor al usuario
        System.out.println("Ingrese el código del vendedor:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese el nombre del vendedor:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el sexo del vendedor (M/F):");
        char sexo = scanner.nextLine().charAt(0);

        System.out.println("Ingrese el sueldo del vendedor:");
        double sueldo = scanner.nextDouble();

        System.out.println("Ingrese el total de ventas del vendedor:");
        double totalVentas = scanner.nextDouble();

        // Crear una instancia de VendedorModelo
        VendedorModel vendedor = new VendedorModel(codigo, nombre, sexo, sueldo, totalVentas);

        // Calcular los ingresos, descuento y neto a pagar usando VendedorLogica
        VendedorService logica = new VendedorService();
        double totalIngresos = logica.calcularTotalIngresos(vendedor.getSueldo(), vendedor.getTotalVentas(), vendedor.getSexo());
        double descuento = logica.calcularDescuento(totalIngresos);
        double netoPagar = logica.calcularNetoPagar(totalIngresos, descuento);

        // Mostrar los resultados
        System.out.println("\nDatos del vendedor:");
        System.out.println("Código: " + vendedor.getCodigo());
        System.out.println("Nombre: " + vendedor.getNombre());
        System.out.println("Sexo: " + vendedor.getSexo());
        System.out.println("Sueldo: " + vendedor.getSueldo());
        System.out.println("Total de ventas: " + vendedor.getTotalVentas());
        System.out.println("Total de ingresos: " + totalIngresos);
        System.out.println("Descuento: " + descuento);
        System.out.println("Neto a pagar: " + netoPagar);

        scanner.close();
    }
}

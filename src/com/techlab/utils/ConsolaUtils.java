// Indicamos a Java que esta clase pertenece al paquete com.techlab.utils
package com.techlab.utils;

// Importamos utilidades de Java para la lectura por consola y tipos de datos
import java.util.Scanner;
import java.util.InputMismatchException;

// Clase utilitaria con métodos que mejoran la experiencia del usuario
public class ConsolaUtils {

    // Método estático para leer un texto asegurándose de que no esté vacío
    public static String leerTextoNoVacio(Scanner scanner, String mensaje) {

        while (true) {

            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                // Le preguntamos a la utilidad si el nombre es válido
                ValidacionesUtils.validarTextoNoVacio(entrada,
                        "El texto no puede estar vacío ni contener solo espacios.");
                return entrada.trim();

            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERROR] " + e.getMessage());
            }
        }
    }

    // Método estático para leer un valor
    // asegurándose de que sean números y mayores a cero
    public static double leerDobleValido(Scanner scanner, String mensaje) {

        while (true) {

            try {

                System.out.print(mensaje);
                double entrada = scanner.nextDouble();
                // Limpieza del salto de línea
                scanner.nextLine();

                // Le preguntamos a la utilidad si el precio es válido
                ValidacionesUtils.validarMayorQueCero(entrada, "El valor debe ser un número mayor a cero.");
                return entrada;

            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR] Formato inválido. Debe ingresar un número.");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERROR] " + e.getMessage());
            }
        }
    }

    // Método estático para leer un valor
    // asegurándose de que sean números y mayores o igual a cero
    public static int leerEnteroValido(Scanner scanner, String mensaje) {

        while (true) {

            try {

                System.out.print(mensaje);
                int entrada = scanner.nextInt();
                // Limpieza del salto de línea
                scanner.nextLine();

                // Le preguntamos a la utilidad si el precio es válido
                ValidacionesUtils.validarMayorIgualQueCero(entrada,
                        "El valor debe ser un número mayor o igual a cero.");
                return entrada;

            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR] Formato inválido. Debe ingresar un número.");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERROR] " + e.getMessage());
            }
        }
    }

}

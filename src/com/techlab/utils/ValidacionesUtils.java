// Indicamos a Java que esta clase pertenece al paquete com.techlab.utils
package com.techlab.utils;

// Clase utilitaria con métodos de validación reutilizables
public class ValidacionesUtils {

    // Método estático para validar textos
    public static void validarTextoNoVacio(String texto, String mensajeError) {

        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    // Método estático para validar números positivos
    public static void validarMayorQueCero(double numero, String mensajeError) {

        if (numero <= 0) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    // Método estático para validar números positivos (permite igual a 0)
    public static void validarMayorIgualQueCero(double numero, String mensajeError) {

        if (numero < 0) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

}

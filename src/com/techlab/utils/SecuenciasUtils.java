package com.techlab.utils;

// Clase utilitaria con métodos para la generación de códigos automáticos
public class SecuenciasUtils {

    // Contador para generar el Id automáticamente de un producto y una categoría
    // Lo inicializamos en 1
    private static int proximoIdProducto = 1;
    private static int proximoIdCategoria = 1;

    // Método estático para generar un id automáticamente (producto)
    public static int generarIdProducto() {
        // Aumentamos el contador para el siguiente producto
        return proximoIdProducto++;
    }

    // Método estático para generar un id automáticamente (categoría)
    public static int generarIdCategoria() {
        // Aumentamos el contador para la siguiente categoría
        return proximoIdCategoria++;
    }
    
}

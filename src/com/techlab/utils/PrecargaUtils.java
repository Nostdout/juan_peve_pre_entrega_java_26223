// Indicamos a Java que esta clase pertenece al paquete com.techlab.utils
package com.techlab.utils;

// Importamos las clases
import com.techlab.service.ProductoServicio;
import com.techlab.service.CategoriaServicio;

// Clase utilitaria para la pregarga de datos de prueba
public class PrecargaUtils {

    // Método estático para precargar productos de prueba
    public static void precargarProductos(ProductoServicio servicio) {

        System.out.println("[INFO] Precargando datos de prueba... [PRODUCTOS]");

        // Agregamos algunos productos válidos directamente al servicio
        servicio.agregarProducto("Coca-Cola 1.5L", "Bebida gaseosa refrescante", 2500.00, 20);
        servicio.agregarProducto("Agua Mineral 500ml", "Bebida sin gas baja en sodio", 1200.00, 20);
        servicio.agregarProducto("Cerveza IPA 473ml", "Bebida alcohólica artesanal", 3200.00, 20);
        servicio.agregarProducto("Galletitas Pepas", "Galletitas con dulce de membrillo", 1500.00, 20);
        servicio.agregarProducto("Galletitas de Agua", "Galletitas crackers clásicas", 1100.00, 20);
        servicio.agregarProducto("Galletitas de Chocolate", "Galletitas rellenas sabor chocolate", 1800.00, 20);
        servicio.agregarProducto("Fideos Tallarines", "Comida seca - Pasta de sémola 500g", 1400.00, 20);
        servicio.agregarProducto("Arroz Integral", "Comida seca - Bolsa de 1kg", 2100.00, 20);
        servicio.agregarProducto("Salsa de Tomate", "Comida - Pack de 500g para pastas", 1300.00, 20);

        System.out.println("[INFO] ¡Datos de prueba cargados con éxito!\n");
    }

    // Método estático para precargar productos de prueba
    public static void precargarCategorias(CategoriaServicio servicio) {

        System.out.println("[INFO] Precargando datos de prueba... [CATEGORÍAS]");

        // Agregamos algunas categorías válidas directamente al servicio
        servicio.agregarCategoria("Bebida", "Aguas, gaseosas, jugos y bebidas con o sin alcohol.");
        servicio.agregarCategoria("Galletitas", "Variedad de galletas dulces, saladas, crackers y recheadas.");
        servicio.agregarCategoria("Comida", "Alimentos en general, productos secos, enlatados y platos listos.");

        System.out.println("[INFO] ¡Datos de prueba cargados con éxito!\n");
    }

}

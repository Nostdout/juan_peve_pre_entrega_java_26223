// Dividimos las clases en paquetes lógicos: com.techlab.productos
// Indicamos a Java que esta clase pertenece al paquete com.techlab.service
package com.techlab.service;

import java.util.ArrayList;

// Importamos la clase categoría
import com.techlab.model.Categoria;

// Importamos la clase utilitaria para validaciones y secuencias
import com.techlab.utils.ValidacionesUtils;
import com.techlab.utils.SecuenciasUtils;

// Clase que maneja toda la lógica de las categorías
public class CategoriaServicio {

    // ArrayList para almacenar categorías
    private ArrayList<Categoria> categorias;

    // Constructor de la clase
    // Se ejecuta cuando se crea un objeto CategoriaServicio
    public CategoriaServicio() {
        // Creamos el objeto ArrayList
        categorias = new ArrayList<>();
    }

    // Método para agregar una nueva categoría
    public Categoria agregarCategoria(String nombre, String descripcion) {

        // Usamos los métodos para validar los datos
        ValidacionesUtils.validarTextoNoVacio(nombre, "El texto no puede estar vacío ni contener solo espacios.");
        ValidacionesUtils.validarTextoNoVacio(descripcion, "El texto no puede estar vacío ni contener solo espacios.");

        // Llamamos al método para generar el Id de una nueva categoría
        int nuevoId = SecuenciasUtils.generarIdCategoria();

        // Si no se lanzaron excepciones
        // Creamos la categoría con los datos ingresados
        Categoria categoria = new Categoria(nuevoId, nombre, descripcion);
        categorias.add(categoria);

        return categoria;
    }

    // Método para listar todos los productos
    public void listarCategorías() {

        // Comprobamos si la lista está vacia
        if (categorias.isEmpty()) {
            System.out.println("\nNo hay categorías registradas.");
            return;
        }

        // Mostramos todos las categorías que están en la lista
        System.out.println("\n==========================");
        System.out.println("    LISTA DE CATEGORÍAS    ");
        System.out.println("==========================");

        // Recorremos todas las categorías con for
        for (Categoria categoria : categorias) {

            System.out.println(categoria);
        }

        System.out.println("==========================");
    }

}

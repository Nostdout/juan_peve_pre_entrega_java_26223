// Dividimos las clases en paquetes lógicos: com.techlab.productos
// Indicamos a Java que esta clase pertenece al paquete com.techlab.model
package com.techlab.model;

// Clase que representa una categoría individual
public class Categoria {

    // Los atributos son privados porque queremos aplicar encapsulamiento
    // Para acceder desde otras clases utilizaremos los métodos get y set
    private int id;
    private String nombre;
    private String descripcion;

    // Constructor de la clase
    // Se ejecuta cuando se crea un objeto Producto
    public Categoria(int id, String nombre, String descripcion) {
        // Guarda los valores pasados al constructor en los atributos del objeto
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Métodos get y set
    // Permite obtener el código de una categoría
    public int getId() {
        return id;
    }

    // Permite obtener el nombre de una categoría
    public String getNombre() {
        return nombre;
    }

    // Permite obtener la descripción de una categoría
    public String getDescripcion() {
        return descripcion;
    }

    // Método toString: permite definir cómo queremos mostrar el objeto
    @Override
    public String toString() {
        return "Id: " + id
                + " | Nombre: " + nombre
                + " | Descripcion: " + descripcion;
    }
    
}

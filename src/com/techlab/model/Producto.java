// Dividimos las clases en paquetes lógicos: com.techlab.productos
// Indicamos a Java que esta clase pertenece al paquete com.techlab.model
package com.techlab.model;

// Clase que representa un producto individual
public class Producto {

    // Los atributos son privados porque queremos aplicar encapsulamiento
    // Para acceder desde otras clases utilizaremos los métodos get y set
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    // Constructor de la clase
    // Se ejecuta cuando se crea un objeto Producto
    public Producto(int id, String nombre, String descripcion, double precio, int stock) {
        // Guarda los valores pasados al constructor en los atributos del objeto
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos get y set
    // Permite obtener el código de un producto
    public int getId() {
        return id;
    }

    // Permite obtener el nombre de un producto
    public String getNombre() {
        return nombre;
    }

    // Permite obtener la descripción de un producto
    public void getDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Permite obtener el precio de un producto
    public double getPrecio() {
        return precio;
    }

    // Permite modificar el precio de un producto
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Permite obtener el stock de un producto
    public int getStock() {
        return stock;
    }

    // Permite modificar el stock de un producto
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método toString: permite definir cómo queremos mostrar el objeto
    // Sin esto Java mostraría algo poco útil, como:
    // com.techlab.model.Producto@7a81197d
    // En cambio, con toString() mostramos la información real del objeto
    @Override
    public String toString() {
        return "Id: " + id
                + " | Nombre: " + nombre
                + " | Descripcion: " + descripcion
                + " | Precio: $" + precio
                + " | Stock: " + stock;
    }
}

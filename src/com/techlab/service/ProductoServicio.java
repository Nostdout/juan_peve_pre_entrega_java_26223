// Dividimos las clases en paquetes lógicos: com.techlab.productos
// Indicamos a Java que esta clase pertenece al paquete com.techlab.service
package com.techlab.service;

// Importamos utilidades de Java para guardar varios elementos en memoria
import java.util.ArrayList;

// Importamos la clase producto
import com.techlab.model.Producto;

// Importamos la clase utilitaria para validaciones y secuencias
import com.techlab.utils.ValidacionesUtils;
import com.techlab.utils.SecuenciasUtils;

// Clase que maneja toda la lógica de los productos
public class ProductoServicio {

    // ArrayList para almacenar productos
    private ArrayList<Producto> productos;

    // Constructor de la clase
    // Se ejecuta cuando se crea un objeto ProductoServicio
    public ProductoServicio() {
        // Creamos el objeto ArrayList
        productos = new ArrayList<>();
    }

    // Método para agregar un nuevo producto
    public Producto agregarProducto(String nombre, String descripcion, double precio, int stock) {

        // Usamos los métodos para validar los datos
        ValidacionesUtils.validarTextoNoVacio(nombre, "El texto no puede estar vacío ni contener solo espacios.");
        ValidacionesUtils.validarTextoNoVacio(descripcion, "El texto no puede estar vacío ni contener solo espacios.");
        ValidacionesUtils.validarMayorIgualQueCero(precio, "El valor debe ser un número mayor a cero.");
        ValidacionesUtils.validarMayorIgualQueCero(stock, "El valor debe ser un número mayor o igual a cero.");
        
        // Llamamos al método para generar el Id de un nuevo producto
        int nuevoId = SecuenciasUtils.generarIdProducto();
        
        // Si no se lanzaron excepciones
        // Creamos el producto con los datos ingresados por el usuario
        Producto producto = new Producto(nuevoId, nombre, descripcion, precio, stock);
        productos.add(producto);

        return producto;
    }

    // Método para listar todos los productos
    public void listarProductos() {

        // Comprobamos si la lista está vacia
        if (productos.isEmpty()) {
            System.out.println("\nNo hay productos registrados.");
            return;
        }

        // Mostramos todos los productos que están en la lista
        System.out.println("\n==========================");
        System.out.println("    LISTA DE PRODUCTOS    ");
        System.out.println("==========================");

        // Recorremos todos los productos con for
        for (Producto producto : productos) {

            System.out.println(producto);
        }

        System.out.println("==========================");
    }

    // Método para buscar un producto por su Id
    public Producto buscarPorId(int id) {

        // Recorremos todos los productos con for
        for (Producto producto : productos) {

            // Comparamos el Id con el que estamos buscando
            // Si lo encuentra, devolvemos el producto
            // Usamos el métodos get para comparar
            if (producto.getId() == id) {

                return producto;
            }
        }

        // Si no encontramos el producto, devolvemos null
        return null;
    }

    // Método para buscar un producto por su nombre
    public Producto buscarPorNombre(String nombre) {

        // Recorremos todos los productos con for
        for (Producto producto : productos) {

            // Comparamos el nombre con el que estamos buscando
            // Si lo encuentra, devolvemos el producto
            // equalsIgnoreCase(): permite que la búsqueda no dependa de
            // mayúsculas/minúsculas ej: "Pepsi".equalsIgnoreCase("pepsi")
            if (producto.getNombre().equalsIgnoreCase(nombre)) {

                return producto;
            }
        }

        // Si no encontramos el producto, devolvemos null
        return null;
    }

    // Método para eliminar producto por su Id
    public boolean eliminarPorId(int id) {

        // Reutilizamos el método: buscar producto por Id
        Producto producto = buscarPorId(id);

        // Si encontramos el producto lo eliminamos
        // y devolvemos "true"
        if (producto != null) {

            productos.remove(producto);
            return true;
        }

        // Si no existe devolvemos "false"
        return false;
    }

    // Método para modificar un producto por su Id
    public boolean modificarProducto(int id, double nuevoPrecio, int nuevoStock) {

        // Reutilizamos el método: buscar producto por Id
        Producto producto = buscarPorId(id);

        // Si encontramos el producto actualizamos el precio y el stock
        if (producto != null) {

            // Usamos los métodos para validar los datos
            ValidacionesUtils.validarMayorIgualQueCero(nuevoPrecio, "El valor debe ser un número mayor a cero.");
            ValidacionesUtils.validarMayorIgualQueCero(nuevoStock, "El valor debe ser un número mayor o igual a cero.");

            // Usamos los métodos set para actualizar los valores
            producto.setPrecio(nuevoPrecio);
            producto.setStock(nuevoStock);

            // Devolvemos "true"
            return true;
        }

        // Si no existe devolvemos "false"
        return false;
    }

}

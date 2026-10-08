// Clase Main, punto de entrada de la aplicacion
// Paquete principal del programa
package com.techlab;

// Importamos utilidades de Java para la lectura por consola
import java.util.Scanner;

// Importamos las clases
import com.techlab.model.Producto;
import com.techlab.service.ProductoServicio;
import com.techlab.service.CategoriaServicio;

// Importamos las clases utilitarias
import com.techlab.utils.PrecargaUtils;
import com.techlab.utils.ConsolaUtils;

// Clase principal que ejecuta el programa
public class Main {
    public static void main(String[] args) {

        // Nos permite leer lo que escribe el usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Creamos nuestros servicios
        ProductoServicio productoServicio = new ProductoServicio();
        CategoriaServicio categoriaServicio = new CategoriaServicio();

        // Cargamos datos de prueba categorías y productos
        PrecargaUtils.precargarCategorias(categoriaServicio);
        ;
        PrecargaUtils.precargarProductos(productoServicio);

        // Esta variable guardará la opción elegida por el usuario en el menú
        int opcion;

        // Usamos do-while porque queremos que el menú se muestre al menos una vez
        // Luego seguirá repitiéndose hasta que el usuario elija salir
        do {

            // Mostramos el menú al usuario
            mostrarMenu();

            System.out.print("\nSeleccione una opción: ");
            // Leemos la opción elegida por el usuario
            opcion = scanner.nextInt();
            scanner.nextLine();

            // Evaluamos la opción con switch.
            switch (opcion) {
                case 1:
                    // Agregamos un nuevo producto
                    agregarProducto(scanner, productoServicio);
                    break;
                case 2:
                    // Mostramos todos los productos que están en la lista
                    productoServicio.listarProductos();
                    break;
                case 3:
                    // Buscamos y modificamos un producto
                    buscarYModificarProducto(scanner, productoServicio);
                    break;
                case 4:
                    // Eliminamos un producto por su Id
                    eliminarProducto(scanner, productoServicio);
                    break;
                case 5:
                    // Mostramos todas las categorías que están en la lista
                    categoriaServicio.listarCategorías();
                    break;
                case 0:
                    System.out.println("\nSaliendo del programa... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción inválida. Intentelo nuevamente");
            }

        } while (opcion != 0);

        // Cerramos el Scanner al final del programa
        scanner.close();
    }

    // Método para mostrar el menú principal con las opciones disponibles
    private static void mostrarMenu() {

        System.out.println("\n============================");
        System.out.println("    SISTEMA DE PRODUCTOS    ");
        System.out.println("============================");
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Buscar y modificar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Listar categorías");
        System.out.println("0. Salir");
        System.out.println("============================");
    }

    // Método para agregar un nuevo producto
    private static void agregarProducto(Scanner scanner, ProductoServicio productoServicio) {

        System.out.println("\n==============================");
        System.out.println("    AGREGAR NUEVO PRODUCTO    ");
        System.out.println("==============================");

        // El id del producto se genera automáticamente
        // Nombre del producto
        String nombre = ConsolaUtils.leerTextoNoVacio(scanner, "\nIngrese el nombre del producto: ");

        // Descripción del producto
        String descripcion = ConsolaUtils.leerTextoNoVacio(scanner, "\nIngrese la descripción: ");
        // Precio del producto
        double precio = ConsolaUtils.leerDobleValido(scanner, "\nIngrese el precio: ");

        // Stock del producto
        int stock = ConsolaUtils.leerEnteroValido(scanner, "\nIngrese el stock: ");

        // Agregamos el nuevo producto
        productoServicio.agregarProducto(nombre, descripcion, precio, stock);

        System.out.println("\nProducto agregado correctamente.");
    }

    // Método para buscar y modificar un producto
    private static void buscarYModificarProducto(Scanner scanner, ProductoServicio productoServicio) {

        System.out.println("\n===================================");
        System.out.println("    BUSCAR Y MODIFICAR PRODUCTO    ");
        System.out.println("===================================");

        // Dos opciones para buscar un producto
        System.out.println("1. Buscar por Id");
        System.out.println("2. Buscar por nombre");
        System.out.println("===================================");

        // La opción elegida por el usuario
        int opcion = ConsolaUtils.leerEnteroValido(scanner, "\nSeleccione una opción: ");

        // Inicialmente no hay ningún producto
        Producto producto = null;

        // Opción 1
        if (opcion == 1) {

            int idModificar = ConsolaUtils.leerEnteroValido(scanner, "\nIngrese el Id: ");

            // Buscamos el producto
            producto = productoServicio.buscarPorId(idModificar);

            // Opción 2
        } else if (opcion == 2) {

            String nombreModificar = ConsolaUtils.leerTextoNoVacio(scanner, "\nIngrese el nombre: ");

            // Buscamos el producto
            producto = productoServicio.buscarPorNombre(nombreModificar);

            // Opción inválida
        } else {

            System.out.println("\nOpción inválida.");
            return;
        }

        // No se encontró ningún producto
        if (producto == null) {

            System.out.println("\nProducto no encontrado.");
            return;
        }

        // Si encontramos el producto, lo mostramos
        System.out.println("\nProducto encontrado:");
        System.out.println(producto);

        // Nuevo precio
        double nuevoPrecio = ConsolaUtils.leerDobleValido(scanner, "\nIngrese el nuevo precio: ");

        // Nuevo stock
        int nuevoStock = ConsolaUtils.leerEnteroValido(scanner, "\nIngrese el nuevo stock: ");

        // Actualizamos el producto
        boolean modificado = productoServicio.modificarProducto(
                producto.getId(),
                nuevoPrecio,
                nuevoStock);

        // Evaluamos el resultado "true" o "false"
        if (modificado) {

            System.out.println("\nProducto modificado correctamente.");
        } else {

            System.out.println("\nNo se pudo modificar el producto.");
        }
    }

    // Método para eliminar un producto por si Id
    private static void eliminarProducto(Scanner scanner, ProductoServicio productoService) {

        System.out.println("\n=========================");
        System.out.println("    ELIMINAR PRODUCTO    ");
        System.out.println("=========================");

        // Id de un producto
        int idEliminar = ConsolaUtils.leerEnteroValido(scanner, "\nIngrese el Id del producto: ");

        // Eliminamos el producto seleccionado
        boolean eliminado = productoService.eliminarPorId(idEliminar);

        // Evaluamos la respuesta "true" o "false"
        if (eliminado) {

            System.out.println("\nProducto eliminado correctamente.");
        } else {

            System.out.println("\nNo se encontró un producto con ese Id.");
        }
    }

}

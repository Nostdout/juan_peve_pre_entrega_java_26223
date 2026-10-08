# Sistema de Productos | Juan Pevé | Back-End / Java comisión #26223 | Talento Tech 2026

Aplicación de consola desarrollada en Java para gestionar productos.

El proyecto permite registrar productos, consultar y modificar su información, eliminarlos.

## Descripción del Proyecto

El objetivo es desarrollar una aplicación de consola aplicando conceptos fundamentales de Java y Programación Orientada a Objetos, organizando el código en diferentes clases y paquetes y utilizando colecciones y manejo de excepciones.

El proyecto busca simular un sistema básico de gestión de productos y pedidos, incluyendo validaciones y actualización del stock.

## Características Principales

- Agregar nuevos productos.
- Generar automáticamente el ID de cada producto.
- Listar todos los productos registrados.
- Buscar productos por ID.
- Buscar productos por nombre.
- Modificar el precio y el stock de un producto.
- Eliminar productos por ID.
- Validar que el precio y el stock no sean valores negativos.

## 📦 Requisitos

### Para ejecutar el proyecto es necesario tener instalado:

- Java JDK.
- Visual Studio Code.
- Extensiones de Java para Visual Studio Code.

### Ejecución

- Clonar o descargar el proyecto.
- Abrir la carpeta TechLab en Visual Studio Code.
- Verificar que Java esté correctamente configurado.
- Ejecutar Main.java.
- Utilizar el menú de la aplicación para gestionar productos y pedidos.

## 📁 Estructura del Proyecto

    ```
    ├── src/
    │   └── com/
    │       └── techlab/
    │           │
    │           ├── model/
    │           │   ├── Categoria.java
    │           │   └── Producto.java
    │           │
    │           ├── service/
    │           │   ├── CategoriaServicio.java
    │           │   └── ProductoServicio.java
    │           │
    │           ├── utils/
    │           │   ├── ConsolaUtils.java
    │           │   ├── PrecargaUtils.java
    │           │   ├── SecuenciasUtils.java
    │           │   └── ValidacionUtils.java
    │           │
    │           └── Main.java
    │
    └── README.md
    ```

## 👨‍💻 Autor

Proyecto desarrollado por Juan para la Pre entrega de Back-End / Java.

## 📝 Licencia

Este proyecto fue realizado con fines educativos.
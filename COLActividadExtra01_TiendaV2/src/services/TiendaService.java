
package services;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class TiendaService {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void crearProducto(ArrayList<Producto> productos) {

        Producto producto = new Producto();

        System.out.println("Ingrese nombre del producto");
        String nombreProduc = scanner.next();
        producto.setNombre(nombreProduc);
        System.out.println("Ingrese categoria del producto");
        producto.setCategoria(scanner.next());
        System.out.println("Ingrese precio del producto");
        producto.setPrecio(scanner.nextDouble());
        System.out.println("Ingrese cantidad de unidades del producto");
        producto.setCantInvetario(scanner.nextInt());

        productos.add(producto);
    }

    public boolean venta(ArrayList<Producto> productos) {

        System.out.println("Ingrese el nombre del producto que desea comprar");

        String productoAComprar = scanner.next();

        boolean hayStock = false;

        boolean error = false;
        for (Producto aux : productos) {
            if (productoAComprar.equalsIgnoreCase(aux.getNombre())) {
                if (aux.getCantInvetario() > 0) {
                    aux.setCantInvetario(aux.getCantInvetario() - 1);
                    hayStock = true;

                }

            }
        }
        if (error == false) {
            System.out.println("El producto no existe");
        }

        return hayStock;
    }

    public void reposicion(ArrayList<Producto> productos) {
        System.out.println("Ingrese el nombre del producto que al que desee agregar stock");
        String producAgregar = scanner.next();
        boolean error = false;

        for (Producto aux : productos) {
            if (producAgregar.equalsIgnoreCase(aux.getNombre())) {
                aux.setCantInvetario(aux.getCantInvetario() + 1);
                System.out.println("Se agrego una unidad al producto");
                error = true;

            }
        }
        if (error == false) {
            System.out.println("El producto no existe");
        }
    }

//    public void mostrarProductos(ArrayList<Producto> productos) {
//        System.out.println(productos.toString());
//    }
    
    public void mostrarProductos(ArrayList<Producto> productos) {
    System.out.println("Listado de productos ordenados:");

    for (Producto producto : productos) {
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Categoría: " + producto.getCategoria());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad en inventario: " + producto.getCantInvetario());
        System.out.println("--------------------");
    }
}

    public void eliminarProducto(ArrayList<Producto> productos) {
        System.out.println("Ingrese el nombre del product q desea elimnar");
        String productoEliminar = scanner.next();
        boolean error = false;
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(productoEliminar)) {
                it.remove();
                error = true;
            }

            if (error == false) {
                System.out.println("El producto no existe");
            }
        }
    }

    public void modificarProducto(ArrayList<Producto> productos) {
        System.out.println("Ingrese el nombre del producto que desea modificar");
        String productoEditar = scanner.next();
        boolean error = false;

        for (Producto aux : productos) {
            if (productoEditar.equalsIgnoreCase(aux.getNombre())) {

                System.out.println("Ingrese nombre del producto");
                aux.setNombre(scanner.next());
                System.out.println("Ingrese categoria del producto");
                aux.setCategoria(scanner.next());
                System.out.println("Ingrese precio del producto");
                aux.setPrecio(scanner.nextDouble());
                System.out.println("Ingrese cantidad de unidades del producto");
                aux.setCantInvetario(scanner.nextInt());
                error = true;

            }
            if (error == false) {
                System.out.println("El producto no existe");
            }
        }
    }

    public void mostrarUnProducto(ArrayList<Producto> productos) {
        System.out.println("Ingrese el nombre del producto que desea ver");
        String productoMostrar = scanner.next();
        boolean error = false;

        for (Producto aux : productos) {
            if (productoMostrar.equalsIgnoreCase(aux.getNombre())) {
                System.out.println(aux);
                error = true;
            }
        }
        if (error == false) {
            System.out.println("El producto no existe");
        }
    }
  
}

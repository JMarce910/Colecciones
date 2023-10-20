
package colactividadextra01tiendav3;

import entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicios.TiendaServicios;

/**
 *Implementa un programa para una tienda de productos utilizando un ArrayList. 
 * Para ello, se debe crear una clase llamada Producto que guarde la información 
 * de cada uno de los productos de la tienda. La clase Producto debe guardar el 
 * nombre del producto, la categoría, el precio y la cantidad en inventario. 
 * En el main, se creará un ArrayList de tipo Producto que guardará todos los 
 * productos creados. A continuación, tendrás que crear un bucle que solicite al 
 * usuario los datos de cada producto y los setee en el objeto Producto correspondiente, 
 * que se agregará al ArrayList
 * 
 * La clase Tienda contendrá además los siguientes métodos:
 * 
Método venta(): El usuario ingresa el nombre del producto que quiere comprar y se lo busca en el
ArrayList. Si está en el ArrayList, se llama con ese objeto Producto al método. El método se
decrementa de a uno, como un carrito de compras, el atributo cantidad en inventario, del producto que
ingresó el usuario. Esto sucederá cada vez que se realice una venta del producto. No se podrán vender
productos de los que no queden inventario disponible para vender. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
* 
Método reposición(): El usuario ingresa el nombre del producto que quiere reponer y se lo busca en el
ArrayList. Si está en el ArrayList, se llama con ese objeto al método. El método incrementa de a uno,
como un carrito de compras, el atributo cantidad en inventario, del producto seleccionado por el
usuario. Esto sucederá cada vez que se produzca una reposición de un producto.
* 
Método toString para mostrar los datos de los productos.
* 
* Aclaración:
* Se debe realizar un CRUD para los productos (Crear, Leer, Modificar o Eliminar)
* Podrás crear los métodos que sean necesarios para que el programa sea más completo.
*/

public class COLActividadExtra01TiendaV3 {

   public static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static List<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {

        TiendaServicios ts = new TiendaServicios();

        boolean respuesta = true;

        do {
            Producto producto = new Producto();
            System.out.println("Ingrese el nombre del producto: ");
            producto.setNombreProducto(leer.next());
            System.out.println("Ingrese la categoria del producto: ");
            producto.setCategoria(leer.next());
            System.out.println("Ingrese el precio del producto: ");
            producto.setPrecio(leer.nextDouble());
            System.out.println("Ingrese la cantidad del producto: ");
            producto.setCantidad(leer.nextInt());

            productos.add(producto);

            System.out.println("Desea agregar otro producto? S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                respuesta = false;

            }
       
        } while (respuesta);
        
        
        respuesta = true;

        do {
            System.out.println("Elige la opción deseada");
            System.out.println("1- Comprar producto");
            System.out.println("2- Reponer producto");
            System.out.println("3- Mostrar productos");
            System.out.println("0- Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre del producto a comprar: ");
                    String productoBuscar = leer.next();
                    Producto productoVenta = ts.buscarProducto(productoBuscar);
                    if (productoVenta != null) {
                        ts.venta(productoVenta);
                        break;
                    }
                }
                case 2: {
                    System.out.println("Ingrese el nombre del producto a reponer: ");
                    String productoBuscar = leer.next();
                    Producto productoReponer = ts.buscarProducto(productoBuscar);
                    if (productoReponer != null) {
                        ts.reposicion(productoReponer);
                        break;
                    }
                }
                case 3: {
                    System.out.println("La lista de productos es: ");
                    ts.mostrarProductos();
                    break;
                }
                case 0: {
                    System.out.println("Saliendo del programa");
                    respuesta = false;
                    break;
                }
                default: {
                    System.out.println("Opción no valida");
                }
            }

        } while (respuesta);


    }
}
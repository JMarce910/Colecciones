

package colactividadextra01tiendav2;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;
import services.TiendaService;

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

public class COLActividadExtra01TiendaV2 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Producto> productos = new ArrayList<>();
        String answer = "s";
        TiendaService ts = new TiendaService();
        String salir = "n";
        do {

            System.out.println("MENU\n" +
                    "1-Crear producto\n" +
                    "2-Venta de producto\n" +
                    "3-Reposicion de producto\n" +
                    "4-Mostrar productos\n" +
                    "5-Eliminar producto\n" +
                    "6-Editar producto\n" +
                    "7-Mostrar un producto\n" +
                    "8-Salir");
            String opcion = scanner.next();
            switch (opcion) {
                case "1":
                    do {

                        ts.crearProducto(productos);

                        System.out.println("quiere agregar otro producto");

                        answer = scanner.next();

                    } while (!answer.equalsIgnoreCase("n"));
                    break;
                case "2":
                    ts.venta(productos);
                    break;
                case "3":
                    ts.reposicion(productos);
                    break;
                case "4":
                    ts.mostrarProductos(productos);
                    break;
                case "5":
                    ts.eliminarProducto(productos);
                    break;
                case "6":
                    ts.modificarProducto(productos);
                    break;
                case "7":
                    ts.mostrarUnProducto(productos);
                    break;
                case "8":
                    System.out.println("esta seguro que desea salir");
                    salir = scanner.next();
            }
        } while (!salir.equalsIgnoreCase("s"));
    }
    
}


package colactividadextra01;

import entidades.Producto;
import entidades.Tienda;
import java.util.ArrayList;
import java.util.Scanner;
import services.ProductoService;

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
public class COLActividadExtra01 {

    static ArrayList<Producto> listaProd = new ArrayList<>();
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ProductoService ps = new ProductoService();
        Tienda t = new Tienda();

            int opcion = -1;

            while (opcion!= 0){

                System.out.println("1-Cargar Productos.");
                System.out.println("2-Vender.");
                System.out.println("3-Reponer producto.");
                System.out.println("4-Mostrar productos.");

                System.out.println("0-Salir");
                System.out.println("Ingrese una opcion: ");
                opcion = leer.nextInt();
                leer.nextLine();
                switch (opcion) {

                    case 1:
                        listaProd = ps.crearProductos(listaProd);
                        break;
                    case 2:
                        listaProd = t.Venta(listaProd);
                        break;
                    case 3:
                        listaProd = t.reposicion(listaProd);
                        break;
                    case 4:
                        ps.mostrarProductos(listaProd);
                        break;
                    case 0:
                        System.out.println("Gracias, vuelva pronto");
                        break;


                }
                //cierre switch
            }//cierre while
        }//cierre main

    }//cierra clase

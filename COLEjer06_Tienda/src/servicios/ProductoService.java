
package servicios;

import static colejer06_tienda.COLEjer06_Tienda.lector;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pc
 */
public class ProductoService {
    
    HashMap<String, Double> listaProductos;

	// Cuando se crea la instancia PS, se crea listaProductos
	public ProductoService() {
		listaProductos = new HashMap<>();
	}

	public void mostrarMenu(){
		int opcion;
		do {
			System.out.println("\nMENU");
			System.out.println("1. Agregar producto");
			System.out.println("2. Modificar precio de un producto");
			System.out.println("3. Eliminar producto");
			System.out.println("4. Mostrar productos");
			System.out.println("5. Salir");
			System.out.print("Ingrese una opción: ");
			opcion = lector.nextInt();
			lector.nextLine(); // Limpiar el buffer de entrada

			switch (opcion) {
				case 1:
					System.out.print("Ingrese el nombre del producto: ");
					String nombre = lector.next();
					System.out.print("Ingrese el precio del producto: ");
					double precio = lector.nextDouble();
					agregarProducto(nombre, precio);
					break;
				case 2:
					System.out.print("Ingrese el nombre del producto a modificar: ");
					String nombreModificar = lector.next();
					System.out.print("Ingrese el nuevo precio del producto: ");
					double nuevoPrecio = lector.nextDouble();
					modificarPrecio(nombreModificar, nuevoPrecio);
					break;
				case 3:
					System.out.print("Ingrese el nombre del producto a eliminar: ");
					String nombreEliminar = lector.next();
					eliminarProducto(nombreEliminar);
					break;
				case 4:
					mostrarProductos();
					break;
				case 5:
					System.out.println("Saliendo del programa.");
					break;
				default:
					System.out.println("Opción inválida. Intente nuevamente.");
					break;
			}
		} while (opcion != 5);

	}

	// CRUD: Create (crear), Read (leer), Update (modificar) & Delete (borrar).

	public void agregarProducto(String nombre, double precio) {
		if (!listaProductos.containsKey(nombre)) {
			listaProductos.put(nombre, precio);
			System.out.println("Producto agregado correctamente: " + nombre + " - Precio: " + precio);
		} else {
			System.out.println("El producto \"" + nombre + "\" ya se encuentra en la tienda.");
		}
	}

	public void modificarPrecio(String nombre, double nuevoPrecio) {
		if (listaProductos.containsKey(nombre)) {
			listaProductos.put(nombre, nuevoPrecio);
			System.out.println("Precio del producto modificado correctamente: " + nombre + " - Nuevo precio: " + nuevoPrecio);
		} else {
			System.out.println("El producto \"" + nombre + "\" no se encuentra en la tienda.");
		}
	}

	public void eliminarProducto(String nombre) {
		if (listaProductos.containsKey(nombre)) {
			listaProductos.remove(nombre);
			System.out.println("Producto eliminado correctamente: " + nombre);
		} else {
			System.out.println("El producto \"" + nombre + "\" no se encuentra en la tienda.");
		}
	}

	public void mostrarProductos() {
		// Validacion si esta vacia
		if(listaProductos.isEmpty()){
			System.out.println("La Tienda no posee productos, por favor, agregue un producto.");
		} else {
			System.out.println("Productos en la tienda:");
			for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
				System.out.println(entry.getKey() + " - Precio: " + entry.getValue());
			}
		}
	}
    
}

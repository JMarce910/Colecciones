
package colejerex02_cantantes;

import entidades.CantanteFamoso;
import java.util.Scanner;
import servicios.CantanteServicios;

/**
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y 
tendrá como atributos el nombre y discoConMasVentas. 
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos 
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante 
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de 
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario 
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
public class COLEjerEX02_Cantantes {

    public static Scanner lector = new Scanner(System.in);
	public static final String SEPARADOR = "============    ============";

	public static void main(String[] args) {
		CantanteServicios cantanteServices = new CantanteServicios();

		// Agregar 5 objetos CantanteFamoso
		cantanteServices.agregarCantante(new CantanteFamoso("Luis Alberto Spinetta", "Artaud"));
		cantanteServices.agregarCantante(new CantanteFamoso("Charly García", "Clics Modernos"));
		cantanteServices.agregarCantante(new CantanteFamoso("Soda Stereo", "Canción Animal"));
		cantanteServices.agregarCantante(new CantanteFamoso("Mercedes Sosa", "Hasta la victoria"));
		cantanteServices.agregarCantante(new CantanteFamoso("Gustavo Cerati", "Bocanada"));

		System.out.println("Inicio del programa.");

		// Bucle para realizar operaciones con los cantantes
		int opcion;
		do {
			System.out.println(SEPARADOR);
			System.out.println("MENU");
			System.out.println(SEPARADOR);

			System.out.println("1. Agregar un cantante");
			System.out.println("2. Mostrar todos los cantantes");
			System.out.println("3. Eliminar un cantante");
			System.out.println("4. Ordenar por artista");
			System.out.println("5. Ordenar por disco");
			System.out.println("6. Salir");
			System.out.println(SEPARADOR);

			System.out.print("Ingrese una opción: ");
			opcion = lector.nextInt();
			lector.nextLine(); // Limpiar el buffer de entrada

			switch (opcion) {
				case 1:
					CantanteFamoso nuevoCantante = cantanteServices.crearCantante();
					cantanteServices.agregarCantante(nuevoCantante);
					break;
				case 2:
					cantanteServices.mostrarCantantes();
					break;
				case 3:
					System.out.print("Ingrese el nombre del cantante a eliminar: ");
					String nombreEliminar = lector.nextLine();
					cantanteServices.eliminarCantante(nombreEliminar);
					break;
				case 4:
					cantanteServices.ordenarPorArtista();
					break;
				case 5:
					cantanteServices.ordenarPorDisco();
					break;
				case 6:
					System.out.println("Saliendo del programa.");
					System.out.println(SEPARADOR);
					break;
				default:
					System.out.println("Opción inválida. Intente nuevamente.");
					break;
			}
		} while (opcion != 6);
	}
    
}

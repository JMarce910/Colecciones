
package coldesafiogrupal_hotel_v2;

import java.util.Scanner;
import servicios.HotelServicios;


/**
Un hotel está alquilando habitaciones, y en esta temporada decidió realizar las 
reservas desde internet. el hotel cuenta con 10 Habitaciones, de las cuales:
Habitacion 1 - 5: Entran 2 personas
Habitacion 6 - 8: Entran hasta 3 personas
Habitacion 9 - 10: Entra 1 sola persona
Realizar un programa en donde se muestren la siguiente información:
* 
Persona (Nombre, Edad, DNI, País)
Habitacion (Numero de habitacion, fecha de ocupacion si tuviera)
Reserva (ID, Numero de habitación, cantidad de personas, fechas)
Alojamiento (una vez que la reserva es ocupada por las personas, pasa a ser un alojamiento, en donde
será necesario guardar el id de la reserva)
* 
Importante:
* Se debe realizar un CRUD que sea necesario. (Crear, Leer, Modificar o Eliminar)
* El programa debe tener un menú para las diferentes opciones.
* Podrás crear los métodos que sean necesarios para que el programa sea más completo.
* Se deberá subir a GitHub y compartir entre integrantes del mismo equipo.
* Se deberán realizar las pruebas unitarias en JUnit para los métodos creados. (Solo si sobra tiempo)
*/

public class COLDesafioGrupal_Hotel_V2 {

    public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");

	public static void main(String[] args) {
		// Creamos instancia para acceder a los metodos
		HotelServicios hotelServicios = new HotelServicios();
		hotelServicios.crearHotel();


		System.out.println("Inicio del programa: ");



		boolean salir = false;
		int eleccion;

		do {
			System.out.println("===== Menú Principal =====");
			System.out.println("1. Realizar Reserva");
			System.out.println("2. Mostrar Información");
			System.out.println("3. Modificar Reserva");
			System.out.println("4. Eliminar Reserva");
			System.out.println("5. Salir");
			System.out.print("Ingrese su elección: ");
			eleccion = lector.nextInt();
			lector.nextLine(); // Consume newline

			switch (eleccion) {
				case 1:
					hotelServicios.realizarReserva();
					break;
				case 2:
					hotelServicios.mostrarInformacion();
					break;
				case 3:
					hotelServicios.modificarReserva();
					break;
				case 4:
					hotelServicios.eliminarReserva();
					break;
				case 5:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción inválida. Por favor, ingrese un valor válido.");
			}
		} while (eleccion != 5);
	}
    
}

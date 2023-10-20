/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import static coldesafiogrupal_hotel_v2.COLDesafioGrupal_Hotel_V2.lector;
import entidades.Habitacion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Pc
 */
public class HotelServicios {
    
    List<Habitacion> hotelMessi = new ArrayList<>();

	public void realizarReserva() {
		System.out.println("Ingrese la cantidad de personas");
		int cantidad = lector.nextInt();

		validarCantPersonas(cantidad);

		System.out.println("Ingrese la fecha ('dd-mm-aaaa'): ");
		String fecha = lector.next();

		validarFecha(fecha);

	}

	private void validarFecha(String fecha) {
		System.out.println("Ingrese la cantidad de dias: ");
		int dias = lector.nextInt();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaFormateada = LocalDate.parse(fecha, formatter);

		LocalDate diaFinal = fechaFormateada.plusDays(dias);

		System.out.println("Fecha Original: " + fechaFormateada);
		System.out.println("Fecha Final: " + diaFinal);
	}

	private void validarCantPersonas(int cantidad) {
		Iterator<Habitacion> iterator = hotelMessi.iterator();

		while (iterator.hasNext()) {
			Habitacion pieza = iterator.next();
			//
			if (pieza.getCantidadPersonasDisponible() == cantidad && !pieza.isOcupada()) {

//				iterator.remove();

				return;
			}
		}


	}


	public void mostrarHabitaciones(){
		System.out.println(hotelMessi);
	}

	public void mostrarInformacion() {
	}

	public void modificarReserva() {
	}

	public void eliminarReserva() {
	}

	public void crearHotel() {
		hotelMessi.add(new Habitacion(1, null,2));
		hotelMessi.add(new Habitacion(2, null,2));
		hotelMessi.add(new Habitacion(3, null,2));
		hotelMessi.add(new Habitacion(4, null,2));
		hotelMessi.add(new Habitacion(5, null,2));
		hotelMessi.add(new Habitacion(6, null,3));
		hotelMessi.add(new Habitacion(7, null,3));
		hotelMessi.add(new Habitacion(8, null,3));
		hotelMessi.add(new Habitacion(9, null,1));
		hotelMessi.add(new Habitacion(10, null,1));

	}

	@Override
	public String toString() {
		return "HotelServicios{" +
				"hotelMessi=" + hotelMessi +
				'}';
	}
    
}

package servicios;

import entidades.Habitacion;
import entidades.Persona;
import entidades.Reservas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class HotelService {

    //private List<Persona> personas;
    private List<Habitacion> habitaciones;
    private List<Reservas> reservas;
    Scanner sc = new Scanner(System.in);

    public void HotelService() {
//personas = new ArrayList<>();
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            if (i >= 1 && i <= 5) {
                habitaciones.add(new Habitacion(i, 2, false));
            } else if (i >= 6 && i <= 8) {
                habitaciones.add(new Habitacion(i, 3, false));
            } else {
                habitaciones.add(new Habitacion(i, 1, false));
            }

        }

    }

    public void crearHabitacion() {
        System.out.println(" Ingrese el numero de habitacion");

        return;
    }

    public void mostrarHabitacion() {

    }

    public void eliminarHabitacion() {

    }

    public void modificarHabitacion() {

    }

    public void crearReserva() {

        Reservas reserva1 = new Reservas();

        reserva1.setPersona(crearPersona());

        System.out.println("Ingrese fecha de check in");
        System.out.println("Ingrese dia");
        int dia = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese mes");
        int mes = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese año");
        int anio = sc.nextInt();
        sc.nextLine();
        LocalDate inicio = LocalDate.of(dia, mes, anio);
        reserva1.setFechaIncio(inicio);

        System.out.println("Ingrese fecha de check out");
        System.out.println("Ingrese dia");
        dia = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese mes");
        mes = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese año");
        anio = sc.nextInt();
        sc.nextLine();
        LocalDate fin = LocalDate.of(dia, mes, anio);
        reserva1.setFechaFin(fin);

        System.out.println("Ingrese cantidad de personas");
        reserva1.setCantPersonas(sc.nextInt());

    }

    public void mostrarReserva() {

    }

    public void eliminarReserva() {

    }

    public void modificarReserva() {

    }

    private Persona crearPersona() {
        Persona persona = new Persona();

        System.out.println("Ingrese el nombre");
        persona.setNombre(sc.nextLine());
        sc.nextLine();
        System.out.println("Ingrese la edad");
        persona.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingresel el DNI");
        persona.setDNI(sc.nextLong());
        sc.nextLine();
        System.out.println("Ingrese el pais de origen");
        persona.setPais(sc.nextLine());
        sc.nextLine();

        return persona;
    }

    public void crearAlojamiento() {
    }

    public void mostrarAlojamiento() {
    }

    public void modificarAlojamiento() {
    }

    public void eliminarAlojamiento() {
    }  

}

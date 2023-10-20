
package coldesafiogrupal_hotel;

import java.util.Scanner;
import servicios.HotelService;

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
public class COLDesafioGrupal_Hotel {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        HotelService hsc = new HotelService();
        boolean salir;
        int opc;
        do {
            System.out.println("Menú: HOTEL");
            System.out.println("1 - Habitación");
            System.out.println("2 - Reserva");
            System.out.println("3 - Alojamiento");
            System.out.println("4 - Salir");
            do {
                opc = leer.nextInt();
                leer.nextLine();
            } while (opc > 1 || opc>5);
            switch(opc){
                case 1 :
                    habitacion(hsc, leer);
                    break;
                
                case 2 :
                    reserva(hsc, leer);
                    break;
                
                case 3 :
                    alojamiento(hsc, leer);
                    break;
                
                case 4 :
                    System.out.println("Adios!");
                
            }
            salir = opc == 5;
        } while (!salir);
    }
    public static void habitacion(HotelService hsc, Scanner leer){
        int opc;
        System.out.println("HABITACIONES");
        System.out.println("1 - Crear Habitación");
        System.out.println("2 - Mostrar Habitación");
        System.out.println("3 - Modificar Habitación");
        System.out.println("4 - Eliminar Habitación");
        do {
            opc = leer.nextInt();
            leer.nextLine();
        } while (opc<1||opc>4);
        switch(opc){
            case 1 :
                hsc.crearHabitacion();
                break;
            
            case 2 :
                hsc.mostrarHabitacion();
                break;
            
            case 3 :
                hsc.modificarHabitacion();
                break;
            
            case 4 :
                hsc.eliminarHabitacion();
                break;
            
        }
    }
    public static void reserva(HotelService hsc, Scanner leer){
        int opc;
        System.out.println("RESERVAS");
        System.out.println("1 - Crear Reserva");
        System.out.println("2 - Mostrar Reserva");
        System.out.println("3 - Modificar Reserva");
        System.out.println("4 - Eliminar Reserva");
        do {
            opc = leer.nextInt();
            leer.nextLine();
        } while (opc<1||opc>4);
        switch(opc){
            case 1 :
                hsc.crearReserva();
                break;
            
            case 2 :
                hsc.mostrarReserva();
                break;
            
            case 3 :
                hsc.modificarReserva();
                break;
            
            case 4 :
                hsc.eliminarReserva();
                break;
            
        }
    }
    public static void alojamiento(HotelService hsc, Scanner leer){
        int opc;
        System.out.println("ALOJAMIENTO");
        System.out.println("1 - Crear Alojamiento");
        System.out.println("2 - Mostrar Alojamiento");
        System.out.println("3 - Modificar Alojamiento");
        System.out.println("4 - Eliminar Alojamiento");
        do {
            opc = leer.nextInt();
            leer.nextLine();
        } while (opc<1||opc>4);
        switch(opc){
            case 1 :
                hsc.crearAlojamiento();
                break;
            
            case 2 :
                hsc.mostrarAlojamiento();
                break;
            
            case 3 :
                hsc.modificarAlojamiento();
                break;
            
            case 4 :
                hsc.eliminarAlojamiento();
                break;
                
        }
    }   
}

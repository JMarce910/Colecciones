
package coldesafiogrupal_hotel_v3;

import entidades.Menu;

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

public class COLDesafioGrupal_Hotel_V3 {

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    
    public static void main(String[] args) {
        
       Menu menu = new Menu();
        menu.menu();         
    }
    
}


package colejerex04_codigopostal;

import java.util.Scanner;
import servicios.CiudadService;

/**
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta 
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el 
número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
public class COLEjerEX04_CodigoPostal {

    
    public static void main(String[] args) {
        
        CiudadService servicioCiudades = new CiudadService();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opcion;

        do {
            System.out.println("\n----- Menú de opciones -----\n"+
                                    "1. Mostrar ciudades\n" +
                                    "2. Buscar ciudad por código postal\n" +
                                    "3. Agregar nueva ciudad\n" +
                                    "4. Eliminar ciudad\n" +
                                    "0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            


            switch (opcion) {
                case 1:
                    servicioCiudades.mostrarCiudades();
                    break;
                case 2:
                    System.out.print("Ingrese el código postal para buscar la ciudad: ");
                    int codigoPostalBuscado = scanner.nextInt();
                    servicioCiudades.buscarCiudadXCodPostal(codigoPostalBuscado);
                    break;
                case 3:
                    System.out.print("Ingrese el código postal de la nueva ciudad: ");
                    int nuevoCodigoPostal = scanner.nextInt();                    
                    System.out.print("Ingrese el nombre de la nueva ciudad: ");
                    String nuevoNombreCiudad = scanner.nextLine();
                    servicioCiudades.agregarCiudad(nuevoCodigoPostal, nuevoNombreCiudad);
                    break;
                case 4:
                    System.out.print("Ingrese el código postal de la ciudad a eliminar: ");
                    int codigoPostalEliminar = scanner.nextInt();
                    servicioCiudades.eliminarCiudad(codigoPostalEliminar);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);
    }
    
}

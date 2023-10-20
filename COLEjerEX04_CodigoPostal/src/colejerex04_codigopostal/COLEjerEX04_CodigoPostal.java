

package colejerex04_codigopostal;

import java.util.Scanner;
import servicios.CiudadServices;



public class COLEjerEX04_CodigoPostal {

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
    
    public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");
    
	public static void main(String[] args) {
		CiudadServices CS = new CiudadServices();

		// Primero agrego 10 ciudades aleatorias con su codigo postal
		CS.agregarCiudadesAleatorias();

		System.out.println("Inicio del programa.");

		boolean salir;
		do{
			CS.mostrarMenu();
			salir = CS.elegirOpcion();
		} while (salir);
	}
    
}

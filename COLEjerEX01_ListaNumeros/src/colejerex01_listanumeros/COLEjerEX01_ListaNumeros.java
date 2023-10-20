
package colejerex01_listanumeros;

import servicios.NumeroService;

/**
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y 
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se 
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el 
programa mostrará por pantalla el número de valores que se han leído, su suma y su 
media (promedio). 
 */
public class COLEjerEX01_ListaNumeros {

    
    public static void main(String[] args) {
        
        NumeroService NS = new NumeroService();
		NS.leerNumeros();

		// Mostrar resultados
		System.out.println("RESULTADOS: ");
		System.out.println("Cantidad de valores leídos: " + NS.CantidadValores());
		System.out.println("Suma de los valores: " + NS.SumaValores());
		System.out.println("Promedio de los valores: " + NS.PromedioValores());
	}
    }


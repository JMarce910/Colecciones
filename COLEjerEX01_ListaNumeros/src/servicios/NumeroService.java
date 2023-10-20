
package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class NumeroService {
    
    private List<Integer> numeros;

	public NumeroService() {
		numeros = new ArrayList<>();
	}

	public void leerNumeros() {
		Scanner lector = new Scanner(System.in);

		int valor;
		do {
			System.out.println("Ingrese valores numéricos enteros (ingrese -99 para terminar):");

			valor = lector.nextInt();

			if (valor != -99) {
				numeros.add(valor);
			}
		} while (valor != -99);
	}

	public int CantidadValores() {
		return numeros.size();
	}

	public int SumaValores() {
		int suma = 0;
		for (int num : numeros) {
			suma += num;
		}
		return suma;
	}

	public double PromedioValores() {
		int cantidadValores = CantidadValores();
		int suma = SumaValores();
		return (double) suma / cantidadValores;
	}
    
}

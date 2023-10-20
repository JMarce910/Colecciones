

package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class PaisServicio {
    
    private HashSet<String> paises = new HashSet();
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    
    public void agregarPais() {
        String respuesta;
        do {
            System.out.println("Ingrese un país: ");
            String pais = read.nextLine();

            if (paises.contains(pais)) {
                System.out.println("El país ya ha sido ingresado anteriormente.");
            } else {
                paises.add(pais);
                System.out.println("País agregado correctamente.");
            }

            System.out.print("¿Desea ingresar otro país? (S/N): ");
            respuesta = read.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    public void mostrarPaises() {
        System.out.println(" ");
        System.out.println("Lista de países ingresados:");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }

    public void ordenarPaisesAlfabeticamente() {
        /*     Set<String> sortedCountries = new TreeSet<>(countries);
        System.out.println("Lista de países ordenados alfabéticamente:");
        for (String pais : sortedCountries) {
            System.out.println(pais);
        }*/
        List<String> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados);
        System.out.println(" ");
        System.out.println("Paises ordenados alfabéticamente: ");
        for (String pais : paisesOrdenados) {
            System.out.println(pais);
        }

    }

    public void eliminarPais() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Ingrese un país a eliminar: ");
        String pais = scanner.nextLine();

        Iterator<String> iterator = paises.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            String actual = iterator.next();
            if (actual.equalsIgnoreCase(pais)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("País eliminado correctamente.");
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }

        System.out.println(" ");
        System.out.println("Lista de países actualizada:");
        for (String paisActualizado : paises) {
            System.out.println(paisActualizado);
        }
    }
    
}

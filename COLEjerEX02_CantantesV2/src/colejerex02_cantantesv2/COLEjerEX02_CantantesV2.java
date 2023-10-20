
package colejerex02_cantantesv2;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y 
tendrá como atributos el nombre y discoConMasVentas. 
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos 
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante 
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de 
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario 
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
public class COLEjerEX02_CantantesV2 {

    
    public static void main(String[] args) {
       
        List<CantanteFamoso> listaCantantes = new ArrayList<>();

        // Agregar 5 cantantes a la lista
        listaCantantes.add(new CantanteFamoso("Enrique Bunbury", "Flamingos"));
        listaCantantes.add(new CantanteFamoso("Elvis Presley", "Elvis Presley"));
        listaCantantes.add(new CantanteFamoso("Gustavo Ceratti ", "Bocanada"));
        listaCantantes.add(new CantanteFamoso("Prietto", "Boleros y canciones"));
        listaCantantes.add(new CantanteFamoso("Morrisey", "Years of Refusal"));

        // Mostrar los nombres de los cantantes y sus discos con más ventas
        System.out.println("Cantantes y sus discos con más ventas:");
        System.out.println("----------------------------");
        for (CantanteFamoso cantante : listaCantantes) {
            System.out.println(cantante.getNombre() + ": " + cantante.getDiscoConMasVentas());
            System.out.println("----------------------------");            
        }

        // Menú de opciones
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\nOpciones tienda:\n" +
                    "1. Agregar cantante\n" +
                    "2. Mostrar todos los cantantes\n" +
                    "3. Eliminar cantante\n" +
                    "4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cantante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el disco con más ventas del cantante: ");
                    String discoConMasVentas = scanner.nextLine();
                    listaCantantes.add(new CantanteFamoso(nombre, discoConMasVentas));
                    System.out.println("Cantante agregado con éxito.");
                    break;
                case 2:
                    System.out.println("Cantantes y sus discos con más ventas:");
                    System.out.println("----------------------------");
                    for (CantanteFamoso cantante : listaCantantes) {
                        System.out.println(cantante.getNombre() + ": " + cantante.getDiscoConMasVentas());
                        System.out.println("----------------------------");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cantante que desea eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    CantanteFamoso cantanteEliminar = null;
                    for (CantanteFamoso cantante : listaCantantes) {
                        if (cantante.getNombre().equalsIgnoreCase(nombreEliminar)) {
                            cantanteEliminar = cantante;
                            break;
                        }
                    }
                    if (cantanteEliminar != null) {
                        listaCantantes.remove(cantanteEliminar);
                        System.out.println("Cantante eliminado con éxito.");
                    } else {
                        System.out.println("El cantante no se encontró en la lista.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }

        // Mostrar la lista con todos los cambios
        System.out.println("\nLista final de cantantes:");
        
        for (CantanteFamoso cantante : listaCantantes) {
            System.out.println(cantante.getNombre() + ": " + cantante.getDiscoConMasVentas());
        }
    }
}


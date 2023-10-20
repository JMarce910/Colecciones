
package colejerex03_libreria;

import entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;
import servicios.LibroService;

/**
 *
 * @author Pc
 */
public class COLEjerEX03_Libreria {

/**
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos 
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de 
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus 
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le 
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
Constructor por defecto.
Constructor con parámetros.
Métodos Setters/getters
Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca 
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El 
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares 
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un 
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares 
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en 
caso contrario.
Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan 
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en 
caso contrario.
Método toString para mostrar los datos de los libros.
 */
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Libro> listaLibros = new HashSet();
        LibroService ls = new LibroService();

        String cond = "S";

        while (cond.equalsIgnoreCase("s")){
            Libro aux = new Libro();
            System.out.println("Ingrese el titulo del libro:");
            aux.setNombre(input.nextLine());
            System.out.println("Ingrese el autor:");
            aux.setAutor(input.nextLine());
            System.out.println("Ingrese la cantidad de copias:");
            aux.setNumeroDeEjemplares(input.nextInt());
            System.out.println("Ingrese la cantidad de copias prestadas:");
            aux.setNumeroDeEjemplaresPrestados(input.nextInt());
            input.nextLine();
            listaLibros.add(aux);

            do {
                System.out.println("Desea ingresar otro libro? (S/N)");
                cond = input.nextLine();
            } while (!cond.equalsIgnoreCase("S") && !cond.equalsIgnoreCase("N"));
        }

        System.out.println("");
        ls.mostrarLibros(listaLibros);

        int opt = 0;

        while (opt != 3) {
            System.out.println("");
            System.out.println("------- Que desea realizar? -------");
            System.out.println("1- Tomar libro prestado.");
            System.out.println("2- Retornar libro.");
            System.out.println("3- Salir.");
            opt = input.nextInt();
            input.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("Que libro desea tomar prestado?");
                    String libroAPrestar = input.nextLine();
                    Boolean prest = ls.chequearStock(listaLibros, libroAPrestar);
                    if (prest) {
                        System.out.println("Prestamo autorizado");
                    }
                    ls.mostrarLibros(listaLibros);
                    break;
                case 2:
                    System.out.println("Que libro desea devolver");
                    String libroADevolver = input.nextLine();
                    Boolean devol = ls.chequearDevolucion(listaLibros, libroADevolver);
                    if (devol) {
                        System.out.println("Gracias por devolver el libro");
                    }
                    ls.mostrarLibros(listaLibros);
                    break;
                default:
                    break;
            }
        }
    }   
}

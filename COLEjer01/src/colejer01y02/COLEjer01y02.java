
package colejer01y02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 01
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo 
 * String. El programa pedirá una raza de perro en un bucle, el mismo se 
 * guardará en la lista y después se le preguntará al usuario si quiere guardar 
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros 
 * guardados en el ArrayList.
 * 
 * 02.
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario 
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el 
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que 
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se 
 * encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada.
 */
public class COLEjer01y02 {

    
    public static void main(String[] args) {
        
        ArrayList<String> razasPerros = new ArrayList(); //creo la ArrayList de razas
        Scanner read = new Scanner(System.in); //creo el scanner
        String respuesta; // creo la variable que define si sigo o no S/N
        
        //hago un bucle para ingresar las razas y me pregunte cuando quiero detenerme
        do {
            System.out.println("Ingrese la raza del perro: ");
            String raza = read.nextLine(); //lee la raza q ingrese x teclado
            razasPerros.add(raza); // añado la raza al ArrayList que me guardara todas las razas que ingrese
            
            System.out.println("Desea guardar otro perro? (S/N):");
            respuesta = read.nextLine(); // lee la respuesta si o no
            
        } while (respuesta.equalsIgnoreCase("S")); // mientras la respuesta sea SI el se devuelve y sigue guardando razas
        
        System.out.println("Perros guardados en el ArrayList: "); // si la respuesta fue NO sale del bucle y me muestra este msj
       
        for (String razaPerro : razasPerros) { // uso este bucle ForEach para recorrer la lista "razasPerros"
            System.out.println(razaPerro); // y muestro los objetos razaPerro que hay en esa Lista
        }   
        
        
        // ***************** 2 PARTE **************************
        
        System.out.println(" ");
        System.out.println("Ingrese el perro a buscar y eliminar: ");
        String perroBuscar = read.nextLine(); //declaro la variable en la q alojare temporal/ la raza que busco
        
        Iterator<String> iterator = razasPerros.iterator(); // se crea el iterador "iterator" para recorrer el array de razas
        boolean encontrado = false; // creo una variable de tipo boolean
        
        while (iterator.hasNext()){ //Mientras queden elementos (hasNext: devuelve true si quedan elementos)
            String perro = iterator.next(); //creo la variable perro y se obtienen los elementos de tipo perro (next: devuelve el sgte objeto contenido en el array)
            if (perro.equalsIgnoreCase(perroBuscar)) { //aqui compara si la raza que ingrese x teclado esta en la lista d razas q creé
                iterator.remove(); //aqui le decimos al iterador que elimine la raza que ingrese q esta en la lista de razas
                encontrado = true; // si esa operacion de arriba es true entonces break, osea sale.
                break;
                
            }
        }
        
        Collections.sort(razasPerros); //llamo al metodo d collections "sort" para organizar los elementos en razasPerros d forma ascendente

        if (encontrado) { //aqui condiciono q si se encontro la raza abajo imprimo el msj de encontrado
            System.out.println("Perro encontrado y eliminado. Lista ordenada:");
        } else { // sino imprimo el msj de abajo
            System.out.println("Perro no encontrado en la lista. Lista ordenada:");
        }

        for (String razaPerro : razasPerros) { //en este forEach recorro la lista razasPerros q quedo despues de eliminar la raza
            System.out.println(razaPerro); // y aqui la imprimo
        }

    }
    
}


package colejer03alumnonotas;

import colejer03alumnonotas.servicios.AlumnoServicio;
import java.util.Scanner;

/**
 *Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas. 
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no.
* 
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
promedio final, devuelto por el método y mostrado en el main
 * 
 */
public class COLEjer03AlumnoNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creamos el servicio en el main y el scanner
        AlumnoServicio servicio = new AlumnoServicio();
        Scanner read = new Scanner(System.in);
        
        //llamamos los metodos creados en el servicio
        servicio.agregarAlumnos();
        servicio.mostrarAlumnos();
        
        //Creamos codigo para buscar la nota de determinado alumno
        System.out.println("------------------------------");
        System.out.println("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreAlumno = read.nextLine(); //leo la respuesta y se le asigna a la variable nombreAlumno
        double promedio = servicio.notaFinal(nombreAlumno); // creo la variable promedio para guardar alli el promedio de un alumno
        
        if(promedio != -1){ //aqui se condiciona que entre al bucle si la nota es diferente de -1
            System.out.println("La nota final de " + nombreAlumno + " es: " + promedio); //imprimo el msj   
        }else { //si no cumple la condición de arriba imprime el sgte msj
            System.out.println("El alumno " + nombreAlumno + "no se encuentra en la lista.");
        }
        
    }
    
}

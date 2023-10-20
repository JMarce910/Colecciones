/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colejer03alumnonotas.servicios;

import colejer03alumnonotas.entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class AlumnoServicio {
    
    List<Alumno> listaAlumnos = new ArrayList(); //creo una lista de alumnos de Tipo Alumno(clase)
    Scanner read = new Scanner(System.in);
    
    
    //creo el metodo para poder agregar alumnos con un bucle
    public void agregarAlumnos(){ 
        String respuesta; //creo la variable respuesta para el SI o NO
        
        do{
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = read.nextLine();
            List<Integer> notas = new ArrayList();
            
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingrese la nota " + i + ": ");
                int nota = read.nextInt(); // lee la nota que ingreso x teclado
                notas.add(nota); // añade y guarda las notas al ArrayList que me guardara todas las notas que ingrese
            }
            
            read.nextLine(); // Limpiar el buffer de entrada
            
            Alumno alumno = new Alumno(nombre, notas); // creo un nuevo alumno de la clase Alumno
            listaAlumnos.add(alumno); // le agrego cada alumno q creo a la listaAlumnos

            System.out.println("Desea ingresar otro alumno? (S/N): ");
            respuesta = read.nextLine(); // Leo la respuesta si o no
        }while (respuesta.equalsIgnoreCase("S")); //mientras la respuesta sea Si, seguira funcionando el bucle si no, sale
    }
    
    //creo el metodo para mostrar los alumnos creados
    public void mostrarAlumnos(){
        for (Alumno alumno : listaAlumnos) { //uso este bucle ForEach para recorrer la lista "listaAlumnos"
            System.out.println("Alumno: " + alumno.getNombre()); //imprimo el nombre del alumno con un get
            System.out.println("Notas: " + alumno.getNotas()); //imprimo las notas llamandolas con el get 
            System.out.println(" ");
        }
    }
    
    //creo el metodo notaFinal para calcular la nota final con las 3 anteriores
    public double notaFinal(String nombreAlumno){ //un metodo q devolvera un double y necesito el parametro del nombre del alumno para saber de quien es c/nota
        for (Alumno alumno : listaAlumnos) { //recorro los objetos alumno de la listaAlumnos
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                double suma = 0; // inicializa la variable suma desde cero para empezar las operaiones abajo
                
                for (int nota: notas){ // recorro la nota en la lista notas
                    suma += nota; // suma el valor de su derecha a la variable o propiedad de su izquierda y asigna el resultado a la variable o propiedad de su izquierda.
                }
                
                return suma / notas.size(); //retorna la operacion opromedio de notas
            }
        }
        
       return -1; //Retorna -1 si el alumno no se encuentra en la lista
    }
}
    
    


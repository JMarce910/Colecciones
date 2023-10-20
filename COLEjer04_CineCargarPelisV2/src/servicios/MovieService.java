/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class MovieService {
    List<Pelicula> movies = new ArrayList<>();
    Scanner read = new Scanner(System.in);

    public void agregarAlumnos() {
        String respuesta;

        do {

            System.out.print("Ingrese el nombre de la pelicula: ");
            String nombre = read.nextLine();
            System.out.print("Ingrese el nombre del director : ");
            String director = read.nextLine();
            System.out.print("Ingrese la duracion de la pelicula en horas : ");
            double duracion = read.nextDouble();

            read.nextLine(); // Limpiar el buffer de entrada

            Pelicula pelicula = new Pelicula(nombre, director, duracion);
            movies.add(pelicula);

            System.out.print("Desea agregar otra pelicula ? (S/N): ");
            respuesta = read.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    public void mostrarPelicula() {
        for (Pelicula movie : movies) {
            System.out.println("TITULO: " + movie.getNombre());
            System.out.println("DIRECTOR: " + movie.getDirector());
            System.out.println("DURACION: " + movie.getDuracion());
        }
    }

    public void mostrarPeliculaMayor() {
        for (Pelicula movie : movies) {
            if (movie.getDuracion() > 1) {
                System.out.println("Alumno: " + movie.getNombre());
                System.out.println("Notas: " + movie.getDirector());
                System.out.println("Notas: " + movie.getDuracion());
            }
        }
        
        
    }
     public void ordenarPeliculasPorDuracionMenorAMayor() {
        Collections.sort(movies, (Pelicula pelicula1, Pelicula pelicula2) -> Double.compare(pelicula1.getDuracion(), pelicula2.getDuracion()));
        System.out.println("Películas ordenadas por duración (menor a mayor):");
        for (Pelicula pelicula : movies) {
            System.out.println(pelicula.getNombre());
        }
    }
    
     
      public void ordenarPeliculasPorDuracionMayorAMenor() {
       Collections.sort(movies, (Pelicula pelicula1, Pelicula pelicula2) -> Double.compare(pelicula2.getDuracion(), pelicula1.getDuracion()));
        System.out.println("Películas ordenadas por duración (menor a mayor):");
        for (Pelicula pelicula : movies) {
           System.out.println(pelicula.getNombre());
        }
    }
    
      
       public void ordenarPeliculasPorTitulo() {
        Collections.sort(movies, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return pelicula1.getNombre().compareToIgnoreCase(pelicula2.getNombre());
            }
        });
        System.out.println("Películas ordenadas por título:");
        for (Pelicula pelicula : movies ) {
            System.out.println(pelicula.getNombre());
        }
    }

    public void ordenarPeliculasPorDirector() {
    Collections.sort(movies, new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getDirector().compareTo(pelicula2.getDirector());
        }
    });
    System.out.println("Películas ordenadas por director:");
    for (Pelicula pelicula : movies) {
        System.out.println(pelicula.getNombre());
    }
}
    
}

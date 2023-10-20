

package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class PeliculaServicio {
    
    public static final String SEPARADOR = "=====================";
    
    public List<Pelicula> listaPeliculas = new ArrayList();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    
    //creo el metodo para poder agregar peliculas con un bucle
    public void crearPeliculas(){ 
        boolean salir = true;

		do{
			Pelicula peliculaNueva = new Pelicula();

			System.out.println("Por favor ingrese el nombre de pelicula: ");
			peliculaNueva.setTitulo(read.next());

			System.out.println("Por favor ingrese el director de pelicula: ");
			peliculaNueva.setDirector(read.next());

			System.out.println("Por favor ingrese la duracion en horas de pelicula: ");
			peliculaNueva.setDuracion(read.nextDouble());

//			System.out.println(peliculaNueva);

			listaPeliculas.add(peliculaNueva);
			System.out.println("Pelicula creada y agregada a la lista. ");
			System.out.println("Desea ingresar otra pelicula? (S/N)");

			if(read.next().equalsIgnoreCase("N")){
				salir = false;
			}

		} while( salir );

	}
    
    
    public void mostrarLista(){
		for (Pelicula peliActual: listaPeliculas) {
			System.out.println(peliActual);
		}
	}

	public void pelisMenorUnaHora() {
		List<Pelicula> pelisMenorUnaHora = new ArrayList<>();
		Iterator<Pelicula> iterador = listaPeliculas.iterator();

		// Seteo una variable con la que voy a comparar cada elemento
		double duracionDeHoras = 1;

		// Condicion que verifica si hay un siguiente elemento para iterar, si no hay nada para analizar retorna false
		// y sale del bucle
		while (iterador.hasNext()) {

			// Creo un pelicula que va a ser cada elemento dentro de la lista que voy iterando, asi
			// Java sabe a que elemento tiene que ir utilizando en la iteracion que sea en ese momento
			Pelicula peliActual = iterador.next();

			if (peliActual.getDuracion() < duracionDeHoras) {
				pelisMenorUnaHora.add(peliActual);
			}
		}
		if (pelisMenorUnaHora.size() == 0) {
			System.out.println("No hay peliculas con duracion menor a una hora.");
		} else {
			System.out.println("Lista de peliculas con duracion menor a una hora: " + pelisMenorUnaHora);
		}
	}

	// En este prestar atencion a como se encadena el metodo sort (ordena) y el metodo reversed (invierte los elementos)
	public void ordenarPorDuracionMayorAMenor() {
		// Necesita saber que atributo se va a ordenar, por eso se pide a traves del get, la misma logica
		// Se aplica al resto
		listaPeliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion).reversed());
	}

	public void ordenarPorDuracionMenorAMayor() {
		listaPeliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion));
	}

	public void ordenarPorTitulo() {
		listaPeliculas.sort(Comparator.comparing(Pelicula::getTitulo));
	}

	public void ordenarPorDirector() {
		listaPeliculas.sort(Comparator.comparing(Pelicula::getDirector));
	}

	public void mostrarMenu() {

		// Variable de salida
		boolean salir = false;
		while (!salir) {
			System.out.println(SEPARADOR);
			System.out.println("==== Menú ====");
			System.out.println("1. Agregar película");
			System.out.println("2. Mostrar todas las películas");
			System.out.println("3. Mostrar películas con duración menor a 1 hora");
			System.out.println("4. Ordenar películas por duración (mayor a menor)");
			System.out.println("5. Ordenar películas por duración (menor a mayor)");
			System.out.println("6. Ordenar películas por título");
			System.out.println("7. Ordenar películas por director");
			System.out.println("8. Salir");

			int opcion = read.nextInt();

			switch (opcion) {
				case 1:
					crearPeliculas();
					break;
				case 2:
					mostrarLista();
					break;
				case 3:
					pelisMenorUnaHora();
					break;
				case 4:
					ordenarPorDuracionMayorAMenor();
					System.out.println("Películas ordenadas por duración (mayor a menor):");
					mostrarLista();
					break;
				case 5:
					ordenarPorDuracionMenorAMayor();
					System.out.println("Películas ordenadas por duración (menor a mayor):");
					mostrarLista();
					break;
				case 6:
					ordenarPorTitulo();
					System.out.println("Películas ordenadas por título:");
					mostrarLista();
					break;
				case 7:
					ordenarPorDirector();
					System.out.println("Películas ordenadas por director:");
					mostrarLista();
					break;
				case 8:
					salir = true;
					System.out.println("Fin del programa.");
					System.out.println(SEPARADOR);
					break;
				default:
					System.out.println("Opción inválida. Intente nuevamente.");
			}
		}
	}
}




package servicios;

import static colejerex02_cantantes.COLEjerEX02_Cantantes.lector;
import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class CantanteServicios {
    
    private List<CantanteFamoso> cantantes;

	public CantanteServicios() {
		cantantes = new ArrayList<>();
	}

	public void agregarCantante(CantanteFamoso cantante) {
		cantantes.add(cantante);
	}



	public void mostrarCantantes() {
		System.out.println("Lista de Cantantes Famosos:");
		for (CantanteFamoso cantante : cantantes) {
			System.out.println(cantante);
		}
	}

	public void eliminarCantante(String nombre) {
		CantanteFamoso cantanteAEliminar = null;
		for (CantanteFamoso cantante : cantantes) {
			if (cantante.getNombre().equalsIgnoreCase(nombre)) {
				cantanteAEliminar = cantante;
				break;
			}
		}

		if (cantanteAEliminar != null) {
			cantantes.remove(cantanteAEliminar);
			System.out.println("El cantante \"" + cantanteAEliminar.getNombre() + "\" ha sido eliminado.");
		} else {
			System.out.println("El cantante \"" + nombre + "\" no se encuentra en la lista.");
		}
	}

	public CantanteFamoso crearCantante() {

		System.out.print("Ingrese el nombre del cantante: ");
		String nombreCantante = lector.nextLine();
		System.out.print("Ingrese el disco con más ventas del cantante: ");
		String discoCantante = lector.nextLine();

		return new CantanteFamoso(nombreCantante, discoCantante);
	}

	// Agrego funcionalidades de ordenar
	public void ordenarPorArtista(){
		cantantes.sort(Comparator.comparing(CantanteFamoso::getNombre));
		System.out.println("Lista ordenada por Artista.");
	}

	public void ordenarPorDisco(){
		cantantes.sort(Comparator.comparing(CantanteFamoso::getDiscoConMasVentas));
	}
    
}

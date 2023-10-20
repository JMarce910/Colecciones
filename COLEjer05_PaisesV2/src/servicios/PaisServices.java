

package servicios;

import entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class PaisServices {
    
    // Aprovecho la opcion de los Set que no acepta elementos duplicados
	private Set<Pais> paises = new HashSet<>();

	public PaisServices() {

	}

	public void agregarPais(String paisNuevo) {
		// Creo un objeto pais
		Pais objetoPais = new Pais();
		objetoPais.setNombre(paisNuevo);
		paises.add(objetoPais);
	}

	public void mostrarPaises() {
		// Para solo mostrar, sirve foreach, si necesitamos
		// trabajarlo, conviene el Iterator
		System.out.println("Lista de paises:");
		for (Pais pais : paises) {
			System.out.println(pais);
		}
	}

	public void eliminarPais(String nombrePais) {
		Iterator<Pais> iterator = paises.iterator();

		while (iterator.hasNext()) {
			Pais pais = iterator.next();
			if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
				iterator.remove();
				System.out.println("El país \"" + pais + "\" ha sido eliminado.");
				return;
			}
		}
		System.out.println("El país \"" + nombrePais + "\" no se encuentra en la lista.");
	}
    
}

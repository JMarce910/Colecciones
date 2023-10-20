

package servicios;

import static colejerex04_codigopostal.COLEjerEX04_CodigoPostal.lector;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pc
 */
public class CiudadServices {
    
    public Map<Integer, String> listaCiudades;

	public CiudadServices() {
		listaCiudades = new HashMap<>();
	}


	public void mostrarMenu() {
		System.out.println("Menú de opciones:\n" +
				"1. Mostrar datos introducidos\n" +
				"2. Agregar una ciudad con su código postal\n" +
				"3. Buscar ciudad por código postal\n" +
				"4. Eliminar ciudades existentes\n" +
				"5. Salir del programa\n" +
				"Ingrese el número de opción que desee: ");

	}

	public void agregarCiudadesAleatorias() {
		listaCiudades.put(28001, "Madrid");
		listaCiudades.put(8001, "Barcelona");
		listaCiudades.put(41001, "Sevilla");
		listaCiudades.put(46001, "Valencia");
		listaCiudades.put(50001, "Zaragoza");
		listaCiudades.put(3001, "Alicante");
		listaCiudades.put(20001, "San Sebastián");
		listaCiudades.put(29001, "Málaga");
		listaCiudades.put(15001, "A Coruña");
		listaCiudades.put(35001, "Las Palmas de Gran Canaria");
	}

	public void mostrarCiudades(){
		System.out.println("Ciudades del mundo:");
		for (Map.Entry<Integer, String> entry : listaCiudades.entrySet()) {
			System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
		}
	}

	public void buscarCiudad(){
		// Modificaciones para pasar un Integer a un int
		System.out.println("Ingrese el Codigo Postal: ");
		// Este tipo de clases aceptan null como valor
		Integer codigo = null;

		// Try sirve para intentar una accion y si funciona lo corre, y si da error se
		// puede trabajar en vez de que se rompa la ejecucion

		// try intenta asignar a codigo el valor ingresado convertido por parseInt() a un numero entero.
		try {
			codigo = Integer.parseInt(lector.next());

		// Catch toma cuando resulta un error, y efectua el sout y el return de adentro en vez de parar tod o.
		} catch (NumberFormatException e) {
			System.out.println("El código postal debe ser un número entero válido.");
			return;
		}

		// Busca la clave
		String ciudadBuscada = listaCiudades.get(codigo);

		if (ciudadBuscada != null) {
			System.out.println("La ciudad con el código postal " + codigo + " es: " + ciudadBuscada);
		} else {
			System.out.println("No se encontró ninguna ciudad con el código postal " + codigo);
		}
	}

	public boolean elegirOpcion() {
		System.out.println("Ingrese la opcion: ");
		int opcion = lector.nextInt();

		switch(opcion){
			case 1 :
				mostrarCiudades();
				break;
			case 2 :
				agregarCiudad();
				break;
			case 3:
				buscarCiudad();
				break;
			case 4:
				eliminarCiudad();
				break;
			case 5:
				System.out.println("Saliendo del programa.");
				return false;
		}
		return true;
	}

	private void eliminarCiudad() {
		System.out.println("Ingrese el CP de la ciudad que quiere eliminar: ");
		int codigo = lector.nextInt();

		// Validar si existe la ciudad con ese codigo postal
		if(listaCiudades.containsKey(codigo)){
			String ciudadEliminada = listaCiudades.remove(codigo);
			System.out.println("Se elimino correctamente la ciudad : " + ciudadEliminada);
		} else {
			System.out.println("No se encontro ciudad con ese codigo.");
		}
	}

	private void agregarCiudad() {
		System.out.println("Ingrese el codigo postal:");
		int codigo = lector.nextInt();

		System.out.println("Ingrese el nombre de la ciudad: ");
		String nombre = lector.next();

		listaCiudades.put(codigo, nombre);
		System.out.println("Ciudad agregada exitosamente.");
	}
    
}



package servicios;

import entidades.Ciudad;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Pc
 */
public class CiudadService {
    
    Map<Integer, Ciudad> ciudades;
    
    public CiudadService(){
    ciudades = new HashMap<>();
    
        ciudades.put(1641, new Ciudad("Acasusso", 1641));
        ciudades.put(1648, new Ciudad("Tigre", 1648));
        ciudades.put(7630, new Ciudad("Necochea", 7630));
        ciudades.put(7000, new Ciudad("Tandil", 7000));
    
}
    public void agregarCiudad(int codigoPostal, String nombreCiudad){
        Ciudad ciudad = new Ciudad(nombreCiudad, codigoPostal);
        ciudades.put(codigoPostal, ciudad);
        
    }

    
    public void eliminarCiudad (int codigoPostal){
        ciudades.remove(codigoPostal);
    }
    
    public void mostrarCiudades() {
        System.out.println("Ciudades:");
        System.out.println("---------------------");
        for (Ciudad ciudad : ciudades.values()) {
            System.out.println(ciudad);
            System.out.println("---------------------"); // Línea de guiones
        }
    }
    
    public void buscarCiudadXCodPostal(int codigoPostal){
        Ciudad ciudadBuscada = ciudades.get(codigoPostal);
        if (ciudadBuscada != null) {
            System.out.println("Ciudad encontrada: " + ciudadBuscada.getNombre());
        } else {
            System.out.println("Codigo postal no encontrado.");
            
        }
    }
    
}

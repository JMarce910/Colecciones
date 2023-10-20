
package colmascotapp.utilidades;

import colmascotapp.entidades.Mascota;
import java.util.Comparator;

/**
 *
 * @author Pc
 */
public class Comparadores {
    
    //crear una variable o atributo global, los que uno quiera crear
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota> () {  //ctrl + click
        @Override
        public int compare(Mascota t, Mascota t1) {
            
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
    
    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota> () {  //ctrl + click
        @Override
        public int compare(Mascota t, Mascota t1) {
            
            return t.getEdad().compareTo(t1.getEdad());
        }
    };
        
}

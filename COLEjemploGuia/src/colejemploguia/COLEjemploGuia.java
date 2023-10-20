
package colejemploguia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Pc
 */
public class COLEjemploGuia {

    
    public static void main(String[] args) {
        
        // LISTAS:
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        int a = 18;
        int b = 114;
        int c = 910;
        numerosA.add(x);
        numerosA.add(a);
        numerosA.add(b);
        numerosA.add(c);
        System.out.println(numerosA);
        numerosA.remove(2);
        System.out.println(numerosA);
    
        System.out.println("*************************");
        
        
        // CONJUNTOS:
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        Integer z = 50;
        Integer w = 70;
        Integer v = 320;
        numerosB.add(y);
        numerosB.add(z);
        numerosB.add(w);
        numerosB.add(v);
        System.out.println(numerosB);
        numerosB.remove(320);
        System.out.println(numerosB);
        
        
        System.out.println("*************************");
        
        
        // MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        int dni;
        String nombreAlumno;
        alumnos.put(41931540, " Lucia");
        alumnos.put(1094888060, " Marcela");
        alumnos.put(1094946520, " Daniela");
        System.out.println(alumnos);
        alumnos.remove(41931540);
        System.out.println(alumnos);
        
    }
    
}

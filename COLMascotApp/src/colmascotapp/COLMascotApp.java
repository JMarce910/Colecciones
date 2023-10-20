
package colmascotapp;

import colmascotapp.servicios.ServicioMascota;


public class COLMascotApp {

    
    public static void main(String[] args) {
        
    // 23a. Creo el servicio mascota
    ServicioMascota servMasc = new ServicioMascota();
    
    servMasc.PetFactory(2);
    
    //servMasc.actualizarMascota(0); //voy a actualizar la mascota de la primera posicion(0)
    
    //servMasc.mostrarMascotas(); // vuelvo a mostrar las mascotas
    
    servMasc.eliminarMascotaPorNombre("Lola");
    
    servMasc.mostrarMascotas();
    
    
    // Codigo para trabajar con el Comparator contenido en pkg utilidades
    // ArrayList<Mascota> mascotas = new ArrayList();
    
    //mascotas.add(new Mascota("Lukas", "Luki", "Perro"));
    //mascotas.add(new Mascota("Socrates", "Soqui", "Perro"));
    
    //Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
    
    //for (Mascota mascota : mascotas){
    // System.out.println(mascota);
    //}
    
    } 
}

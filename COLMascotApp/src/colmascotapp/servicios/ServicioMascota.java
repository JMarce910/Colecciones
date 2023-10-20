
package colmascotapp.servicios;

import colmascotapp.entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ServicioMascota {
    
    private Scanner leer;
    
// 17. COLECCIONES
   // Agrego una nueva variable o atributo global de la clase SERVICIO
    private List<Mascota> mascotas;
    
// 18. lo inicializamos a traves del constructor

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    
// 19. vuelvo el metodo crearMascota() un void para que no me de el return, sino que 
// cada que yo lo llame, el me guarde el objeto en la Lista
    
    public Mascota crearMascota(){
        
        System.out.println("Introducir el nombre de la mascota: ");
        String nombre = leer.next();
        
        System.out.println("Introducir el apodo de la mascota: ");
        String apodo = leer.next();

        System.out.println("Ingrese el tipo de mascota: (Perro, Gato, etc...)");
        String tipo = leer.next();
        
// 21. Ahora guardo la mascota        
        return new Mascota(nombre, apodo, tipo);
    }
    
    
// 24. creo un nuevo metodo para agregar mascotas
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
// 22. Ahora creo otro método para visualizar las mascotas creadas
    public void mostrarMascotas(){

        System.out.println("La cantidad de mascotas son: " + mascotas.size());

        System.out.println("Las mascotas en la Lista son: ");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
    }
    
// 23. creo el metodo fabrica mascotas
    /**
     * Crea mascotas de forma predeterminada, es decir con el mismo nombre podo y tipo
     * @param cantidad quiere decir la cantidad de mascotas que vamos a crear y añadir
     * a la lista
     */
    public void fabricaMascotas(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            // y añado una nueva mascota de manera rapida harcodeando los datos nombre, apodo y tipo
            mascotas.add( new Mascota("Lukas", "Luki", "Perro Labrador"));
            // otra forma de añadir una mascota es:
            // Mascota aux = new Mascota(""Lukas", "Luki", "Perro Labrador"));
            //mascotas.add(aux);
            // si yo quiero crear 100 mascotas arriba en cantidad pongo 99 y Mascota aux se va 
            // a repetir y repetir hasta 100 creando nuevas mascotas
        }
    }
    
    /**
     * Crea mascotas pidiendo datos por teclado
     * Tambien es una fabricaMascotas
     * @param cantidad 
     */
    public void PetFactory(int cantidad){
        for (int i = 0; i < cantidad; i++) {
        //llamo al metodo que me pide los datos por teclado
            Mascota mascotaCreada = crearMascota();
            
        //aqui le paso la mascota creada y la agrego llamando al metodo agregarMascota
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
            
        }
        
    }  
    //24. Voy a actualizar objetos y hay 2 formas
    //necesita recibir como parametro el indice o posicion de la mascota
    // ToDo Try and Catch
//    public void actualizarMascota(int index){ 
//        Mascota m = mascotas.get(index); //llamo la lista q contiene las mascotas un get index
//        m.setApodo("Piter");
//    }
    
    
    // 2 forma: 
    public void actualizarMascota(int index){ 
        
        System.out.println("");
        System.out.println("---------- Actualizar -----------");
        Mascota m = crearMascota(); //llamo a la funcion crearMascota, creo una nueva mascota m
        
        mascotas.set(index, m); //uso el metodo set de mascotas
        
    }
    
    public void eliminarMascota(int index){
        
        if(index <= (mascotas.size() -1)){
            mascotas.remove(index);
        }else{
            System.out.println("Fallo al eliminar, el indice es erroneo");
        }
        
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            
            if (m.getNombre().equals(nombre)){
                mascotas.remove(m);
            }
            
        }
    }

   public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            
            if (m.getNombre().equals(nombreViejo)){
                m.setNombre(nombreNuevo);
            }
            
        }
    }
    
}
    

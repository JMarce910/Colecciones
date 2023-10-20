
package colmascotapp.entidades;


public class Mascota {
    
    // 1. creo los atributos de la mascota public
// 10a. los cambio a private para encapsular
    private String nombre;
    private String apodo;
    //perro, gato, conejo...
    private String tipo;
    private Integer edad;
    private boolean cola;
    private String color;
    private String raza;
    
    
    
// 7. voy a crear los constructores que sirven para hacer nacer un objeto
// y le paso atributos para que nazca con determinadas caracteristicas.
// por lo general es public para que sea de acceso externo a la clase, facilmente.
    
    public Mascota(){
        
    }

// 9. podemos poner logica dentro de los constructores con un if x eje:   
    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo")) {
            this.tipo = tipo;
        }
        
    }
    

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String color, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.color = color;
        this.raza = raza;
    }
    
    
//11. para poder acceder a los atributos si quiero cambiarlos creo los set

    public void setNombre(String nombre) {
// podemos poner logica dentro de los setters con un if x eje que si el nombre es 0
// no lo setie osea no tome el nombre o es inválido.
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    
    public String getApodo() {
        return apodo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Integer getEdad() {
        return edad;
    }

    
    public void setCola(boolean cola) {
        this.cola = cola;
    }
    
    public boolean isCola() {
        return cola;
    }

    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    } 
    
   
    
// 13. Vamos a crear el método toString q es una funcion que me devuelve un mensaje formateado
// y armado según cada mascota

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", edad=" + edad + ", cola=" + cola + ", color=" + color + ", raza=" + raza + '}';
    } 
    
}

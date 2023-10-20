
package colmascotapp.entidades;

import java.util.Date;


public class Usuario {
    
    // 2. creo los atributos del ususario que va a ingresar la mascota
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;
    
// 7. tambien creo los constructores de usuario
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
}

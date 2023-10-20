
package entidades;

import java.time.LocalDate;

/**
 *
 * @author Pc
 */
public class Reservas {
    
    private static int nextId = 1;
    
    private int id;
    private Habitacion habitacion;
    private LocalDate fechaIncio;
    private LocalDate fechaFin;
    private int cantPersonas;
    private Persona persona;

    public Reservas() {
    }

    public Reservas(int id, Habitacion habitacion, LocalDate fechaIncio, LocalDate fechaFin, int cantPersonas, Persona persona) {
        this.id = nextId++;
        this.habitacion = habitacion;
        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
        this.cantPersonas = cantPersonas;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(LocalDate fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}

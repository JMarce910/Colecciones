
package entidades;

/**
 *
 * @author Pc
 */
public class Habitacion {
    
    private int numero;
    private int capacidad;
    //private int cantPersonas;
    private boolean ocupada;

    public Habitacion() {
    }

    public Habitacion(int numero, int capacidad, boolean ocupada) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
}

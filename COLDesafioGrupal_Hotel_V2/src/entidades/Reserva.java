
package entidades;

import java.util.Date;

/**
 *
 * @author Pc
 */
public class Reserva {
    
    private int ID;
	private int NumeroHabitacion;
	private int cantPersonas;
	private Date fechas;

	public Reserva(int ID, int numeroHabitacion, int cantPersonas, Date fechas) {
		this.ID = ID;
		NumeroHabitacion = numeroHabitacion;
		this.cantPersonas = cantPersonas;
		this.fechas = fechas;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getNumeroHabitacion() {
		return NumeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		NumeroHabitacion = numeroHabitacion;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

	public Date getFechas() {
		return fechas;
	}

	public void setFechas(Date fechas) {
		this.fechas = fechas;
	}

	@Override
	public String toString() {
		return "Reserva{" +
				"ID=" + ID +
				", NumeroHabitacion=" + NumeroHabitacion +
				", cantPersonas=" + cantPersonas +
				", fechas=" + fechas +
				'}';
	}
    
}

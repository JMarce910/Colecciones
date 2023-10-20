

package entidades;


public class Producto {
    
    private String nombre;
    private String categoria;
    private double precio;
    private int cantInvetario;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, int cantInvetario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantInvetario = cantInvetario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantInvetario() {
        return cantInvetario;
    }

    public void setCantInvetario(int cantInvetario) {
        this.cantInvetario = cantInvetario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", cantInvetario=" + cantInvetario +
                '}';
    }
    
}

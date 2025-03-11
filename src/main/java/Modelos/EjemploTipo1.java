
package Modelos;

public class EjemploTipo1 {
    private String nombre;
    private String Direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "EjemploTipo1{" + "nombre=" + nombre + ", Direccion=" + Direccion + '}';
    } 
}

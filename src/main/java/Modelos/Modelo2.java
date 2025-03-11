
package Modelos;

public class Modelo2 {
    private String empresa;
    private String marca; 

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo2{" + "empresa=" + empresa + ", marca=" + marca + '}';
    }
    
}

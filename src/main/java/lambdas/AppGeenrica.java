package lambdas;

import Modelos.EjemploTipo1;
import Modelos.Modelo2;
import Services.Iprinter;

public class AppGeenrica {

    public static void main(String[] args) {
        Iprinter<String> imp = (objeto) -> {
            System.out.println(objeto);
        };
        imp.pirnter("Lambda desde interfaz");

        Iprinter<EjemploTipo1> ejem = modelo -> System.out.println(modelo);

        EjemploTipo1 MEjemplo = new EjemploTipo1();
        MEjemplo.setDireccion("Chalatenango, Chalatenango");
        MEjemplo.setNombre("Ever Sorto");
        ejem.pirnter(MEjemplo);

        Iprinter<Modelo2> md2 = temp -> System.out.println(temp);

        Modelo2 obj2 = new Modelo2();
        obj2.setEmpresa("Ecomoda");
        obj2.setMarca("Chinita");

        md2.pirnter(obj2);
    }
}

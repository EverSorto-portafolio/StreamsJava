
package lambdas;

import java.util.List;

public class LambdasFor {
    public static void main(String[] args) {
        List<String> pais = List.of(
                "El salvador",
                "Guatemala", 
                "Honduras", 
                "EEUU", 
                "Mexico");
        for (String temp : pais){
            System.out.println(temp);
        }
        System.out.println("--------------------------------------");
        pais.forEach( c -> System.out.println(c.toUpperCase()));
        
    }
}

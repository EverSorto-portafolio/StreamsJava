
package lambdas;

import java.util.function.Function;

public class funcionesEjemplo {
    
    static  Function<Integer, Integer> multiplicar =  n -> n * 10;
    static  Function<Integer, Integer>  sumar = n -> n + 10;
    
    public static void main(String[] args) {
        System.out.println(multiplicar.apply(10));
        System.out.println(sumar.apply(10));
    }

}

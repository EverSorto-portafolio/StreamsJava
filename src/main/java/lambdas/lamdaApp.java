
package lambdas;

import Services.IMath;

public class lamdaApp {
    public static void main(String[] args) {
        
        IMath objeto = new IMath() {
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };
        System.out.println( objeto.execute(5.0 ,8.0));
        
        IMath multiplicar = (a, b) -> a * b;
         System.out.println( multiplicar.execute(5.0 ,8.0));
        
        IMath divir = (a, b) ->{
        return a /b;
        };
        System.out.println( divir.execute(5.0 ,8.0));
    }
    
}

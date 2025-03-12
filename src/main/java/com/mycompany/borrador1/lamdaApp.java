
package com.mycompany.borrador1;

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
    }
    
}

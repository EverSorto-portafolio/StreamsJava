
package Services;

@FunctionalInterface
public interface IMath {
    
    Double execute (Double a , Double b);
    
    default Double suma(Double a , Double b){
    return a + b;
    };
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author everc
 */
public class OperadorDeREferencia {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(10);
        IntStream repetir = IntStream.range(1, 11);
     // repetir.forEach(i ->  numbers.add(i));
        repetir.forEach(numbers::add);
        System.out.println(numbers);
        
    }

}

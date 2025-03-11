/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.borrador1;

import Modelos.EjemploTipo1;
import Modelos.Modelo2;
import Services.InterfaceDB1;

public class Borrador1 {

    public static void main(String[] args) {
           implementarClassInterfaz  obj = new implementarClassInterfaz();
           ImplementacionClase2 obj2 = new ImplementacionClase2();  
           
          
           obj.getAll();  //set  marca
           obj.getById(1);  // get marca 
           obj.insert("");  //set  empresa 
           obj.Update("Interfaz1"); // getempresa    
           System.out.println(obj.all());
         
        System.out.println("----------------------------");
        
           obj2.getAll();  //set  marca
           obj2.getById(1);  // get marca 
           obj2.insert("");  //set  empresa 
           obj2.Update("Interfaz1"); // getempresa    
           System.out.println(obj2.all());
            
    }
}

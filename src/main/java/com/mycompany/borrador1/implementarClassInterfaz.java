/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrador1;

import Modelos.Modelo2;
import Services.InterfaceDB1;

/**
 *
 * @author everc
 */
public class implementarClassInterfaz implements InterfaceDB1<Modelos.Modelo2> {
    
    Modelo2 obj = new Modelo2();
    @Override
    public Modelo2 getAll() {
       obj.setMarca("sin marca");    
       return  obj;
    }

    @Override
    public Modelo2 getById(int id) {
         obj.getMarca();
       return  obj;
    }

    @Override
    public Modelo2 insert(String objeto) {
        obj.();
       return  obj;
    }

    @Override
    public Modelo2 Update(String objeto) {
       
    }

    @Override
    public Modelo2 delete(String objeto) {
      
    }

    
   
    
    
    
}

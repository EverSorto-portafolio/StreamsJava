/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrador1;

import Services.InterfaceDB1;

/**
 *
 * @author everc
 */
public class implementarClassInterfaz implements InterfaceDB1 {

    @Override
    public String getAll() {
        return "Usando la interfaz InterfaceDB1 getAll ";
    }

    @Override
    public String getById(int id) {
         return "Usando la interfaz InterfaceDB1 getById";
    }

    @Override
    public String insert(String objeto) {
       return "Usando la interfaz InterfaceDB1 insert";
    }

    @Override
    public String Update(String objeto) {
        return "Usando la interfaz InterfaceDB1 Update";    }

    @Override
    public String delete(String objeto) {
       return "Usando la interfaz InterfaceDB1 delete";  
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrador1;

/**
 *
 * @author everc
 */
public class ImplementacionClase2 implements Services.Servicesdb2{

     @Override
    public String getAll() {
        return "UUsando la interfaz Servicesdb2 getAll ";
    }

    @Override
    public String getById(int id) {
         return "UUsando la interfaz Servicesdb2 getById";
    }

    @Override
    public String insert(String objeto) {
       return "UUsando la interfaz Servicesdb2 insert";
    }

    @Override
    public String Update(String objeto) {
        return "UUsando la interfaz Servicesdb2 Update";    }

    @Override
    public String delete(String objeto) {
       return "UUsando la interfaz Servicesdb2 delete";  
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.borrador1;

import Services.InterfaceDB1;

public class Borrador1 {

    public static void main(String[] args) {
        InterfaceDB1 interfaz1;
        interfaz1 = new implementarClassInterfaz();
        Services.Servicesdb2 implementacionIfaz2;
        implementacionIfaz2 = new ImplementacionClase2();

        System.out.println(interfaz1.Update("Holamundo"));
        System.err.println(interfaz1.delete(""));
        System.out.println(interfaz1.getAll());
        System.out.println(interfaz1.delete(""));

        System.out.println(implementacionIfaz2.Update("Holamundo"));
        System.err.println(implementacionIfaz2.delete(""));
        System.out.println(implementacionIfaz2.getAll());
        System.out.println(implementacionIfaz2.delete(""));

    }
}

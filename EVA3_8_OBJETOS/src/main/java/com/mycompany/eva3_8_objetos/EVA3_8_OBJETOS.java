/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_objetos;

/**
 *
 * @author carlo
 */
public class EVA3_8_OBJETOS {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Carlos";
        perso1.apellido = "Castillo";
        perso1.edad = 21;
        imprimirPersonas(perso1);
        
        Persona perso2 = new Persona ();
        perso2.nombre = "Carlos";
        perso2.apellido = "Hernandez";
        perso2.edad = 22;
        imprimirPersonas(perso2);
        
    }
    public static void imprimirPersonas(Persona perso){
        System.out.println("Direccion " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);
        
    }
}
class Persona{
    String nombre;
    String apellido;
    int edad;
}

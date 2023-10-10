/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_modulo;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA2_3_MODULO {

    public static void main(String[] args) {
        int valor, residuo; 
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el valor");
        valor = input.nextInt();
        
        residuo = valor % 2; //% modulo --> residuo
        if (residuo == 0) //VALOR ES PAR
            System.out.println("El valor es par");
        else 
            System.out.println("El valor es impar");
    }
}

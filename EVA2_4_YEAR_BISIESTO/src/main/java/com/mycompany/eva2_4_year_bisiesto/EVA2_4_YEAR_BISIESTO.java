/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_year_bisiesto;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA2_4_YEAR_BISIESTO {

    public static void main(String[] args) {
        int year, residuo;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el año: ");
        year = input.nextInt();
        //VERIFICAR SI ES DIVISIBLE ENTRE 4
        residuo = year % 4;
        
        if (residuo == 0){ //Divisible entre 4, no es garantia de año bisiesto
               residuo = year % 100;
               if (residuo > 0) //No es divisible entre 100, es bisiesto
                   System.out.println("El año es bisiesto");
               else {
                   residuo = year % 400;
                   if (residuo == 0)
                       System.out.println("Año bisiesto");
                   else 
                       System.out.println("No es año bisiesto");
                   
               }
    }else
        System.out.println("No es año bisiesto");
        
        
    }
}

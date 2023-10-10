/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_if_anidado;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA2_2_IF_ANIDADO {

    public static void main(String[] args) {
        int valor1, valor2;
        Scanner input = new Scanner (System.in); 
        
        System.out.println("valor 1: ");
        valor1 = input.nextInt();
        System.out.println("valor 2: ");
        valor2 = input.nextInt();
        
       //> operadores
        if (valor1 > valor2)//VERDAD       //concatenar
            System.out.println("El valor mas grande es " + valor1);
        else{//FALSO, EL VALOR NO ES MAS GRANDE QUE EL VALOR2
            //if anidado: un if dentro de otro if 
           //EN JAVA: 
           //= ES ASIGNACION
           //== ES COMPARACION 
            if(valor1 == valor2)
                System.out.println("Ambos valores son iguales");
            else 
                System.out.println("El valor mas pequeño es " + valor1);
        } 
            
 
    }
}

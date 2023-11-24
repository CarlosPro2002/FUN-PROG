/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_factorial;

/**
 *
 * @author carlo
 */
public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        System.out.println("El factorial de 5 = " + calcularFactorial(5));
        System.out.println("5 elevado a la 3 = " + calcularPotencia(2, 5));
    }
    public static int calcularFactorial(int num){
       //factorial de 5: 1x2x3x4x5=120
       //isar cicli
       //regresar el valor cacluclador 
      int resu = 1;
       for (int i = 1; i <= num; i++) {
           resu *= i;
            
        }
       return resu; 
    }
    //crear una funcion que calcule la potencia de un numero entero.
    public static int calcularPotencia(int base, int exp){
          int resultado = 1;
        for(int i = 0; i < exp; i++) {
            resultado *= base;
        }
        return resultado;
    }

   
        
    }


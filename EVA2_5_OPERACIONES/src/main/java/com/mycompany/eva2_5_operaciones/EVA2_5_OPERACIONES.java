/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_operaciones;

import static java.lang.System.out;

/**
 *
 * @author carlo
 */
public class EVA2_5_OPERACIONES {

    public static void main(String[] args) {
        int var1, var2, resu;
        
        var1 = 100;
        var2 = 200; 
        
        
        //OPERADOR + 
        //SUMA
        //CONCATENAR --> UNIR CADENAS DE TEXTO 
        
        resu = var1 + var2;
        System.out.println();//SALTO DE LINEA
        System.out.println("SUMA: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 + var2 = " + resu);

        //RESTA 
        resu = var1 - var2;
        System.out.println();//SALTO DE LINEA
        System.out.println("RESTA: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 - var2 = " + resu);
        
        //MULTIPLICACION
        resu = var1 * var2;
        System.out.println();//SALTO DE LINEA
        System.out.println("MULTIPLICACION: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 * var2 = " + resu);
        
        //DIVISION
        var1 = 15;
        var2 = 7;
        resu = var1 / var2;
        System.out.println();//SALTO DE LINEA
        System.out.println("DIVISION: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 / var2 = " + resu);
        
        //DIVISION FLOTANTE 
        double resuExacto;
        resuExacto = var1 / var2;
        System.out.println();//SALTO DE LINEA
        System.out.println("DIVISION EXACTA: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 / var2 = " + resuExacto);
        
        double var2F = 7;
        resuExacto = var1 / var2F;
        System.out.println();//SALTO DE LINEA
        System.out.println("DIVISION EXACTA (¿SERA?: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2F);
        System.out.println("var1 / var2 = " + resuExacto);
        
        int cifra = 7;
        double cifraDouble = 7.0;
        
        int division = 100 / 10; //SE TOMA EL DIVISOR COMO ENTERO 
        //double division = 100 / 10.0; //SE TOMA COMO DIVISOR FLOTANTE
        
        //PRECEDENCIA DE OPERACIONES:
        int a = 5, b = 3, c = 2;
        int resultado = (a * b) + (a - c) * (b - a);//(15)+(3)*(-2)// 15 - 6
        System.out.println("RESULTADO PRECEDENCIA: " + resultado);
        
        //POTENCIAS Y RAICES: 
        double potencia;
        potencia = Math.pow(100, 2);
        System.out.println("POTENCIA = " + potencia);
        
        
        
    }
}

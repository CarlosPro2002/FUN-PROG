/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA2_1_IF {

    public static void main(String[] args) {
        int califa; 
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la calificacion");
        califa = input.nextInt();
        
        if (califa >= 70) {//Esto se ejecuta si es verdad
            System.out.println("Aprobaste");
            System.out.println("Quema tus apuntes");
        }else{ //Esto se ejecuta si es falso. Else es opcional 
            System.out.println("No aprobaste");
        }
    }
}

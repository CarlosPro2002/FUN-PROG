/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_arreglos;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA2_25_ARREGLOS {

    public static void main(String[] args) {
        int cant = 0;
        int [] arregloCali;
        Scanner input = new Scanner (System.in);
        System.out.println("¿Cuantas calificaciones se van a capturar?");
        arregloCali = new int [cant];
        for (int i = 0; i < cant; i++){
            System.out.println("Introduce la calificacion");
            arregloCali[i] = input.nextInt();
        }
        for (int i = 0; i < cant; i++){
            System.out.print(arregloCali[i] + " - ");
           
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_paso_referencia;

/**
 *
 * @author carlo
 */
public class EVA3_7_PASO_REFERENCIA {

    public static void main(String[] args) {
        int[] arreglo = new int [10];
        System.out.println("El valor arreglo en el main " + arreglo);
        llenarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
        }
    }
    public static void llenarArreglo(int[] valores){
        System.out.println("El valor en llenarArreglo es " + valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100);
        }
    }
}

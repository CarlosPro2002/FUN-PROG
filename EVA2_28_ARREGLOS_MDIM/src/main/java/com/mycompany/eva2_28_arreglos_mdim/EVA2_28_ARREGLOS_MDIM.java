/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_28_arreglos_mdim;

/**
 *
 * @author carlo
 */
public class EVA2_28_ARREGLOS_MDIM {

    public static void main(String[] args) {
        //ARREGLO DE DIMENSIONES: MATRIZ
                                //filas, columnas
        int[][] matriz = new int[5][5];
        
        //ASIGNAR UN VALOR:
        matriz[1][3] = 100;
        System.out.println("Valor en [1][3] = " + matriz[1][3]);
        System.out.println("matriz.length = " + matriz.length);
        
        //matriz.lenght siempre es la primer dimension
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 100);
            }
            
            
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }            
            System.out.println("");
            
             }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_29_arreglos_mdim_2;

/**
 *
 * @author carlo
 */
public class EVA2_29_ARREGLOS_MDIM_2 {

    public static void main(String[] args) {
       int[][] matriz = new int[3][];
       matriz[0] = new int [10];
       matriz[1] = new int [5];
       matriz[2] = new int [3];
       
        for (int i = 0; i < matriz.lenght; i++) {
            for (int j = 0; j < matriz[i].lenght; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
                
                
            }
            
        }
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_continue;

/**
 *
 * @author carlo
 */
public class EVA2_20_CONTINUE {

    public static void main(String[] args) {
        //Break termina el ciclo 
        for (int i = 1; i <= 15; i++){
            if (i == 10)
                break;
            System.out.print(i + "-");
            
        } 
        for (int i = 1; i <= 15; i++){
            if(i == 10)
                continue;
            System.out.print(i + "-");
        }
    }
}

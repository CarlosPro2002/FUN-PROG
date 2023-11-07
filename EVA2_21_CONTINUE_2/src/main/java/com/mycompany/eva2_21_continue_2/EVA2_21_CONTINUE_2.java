/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_21_continue_2;

/**
 *
 * @author carlo
 */
public class EVA2_21_CONTINUE_2 {

    public static void main(String[] args) {
        for (int i = 1; i < 15; i++){
            if ((i % 2) != 0)
            continue;
            
            System.out.print(i + "-");
        }
    }
}

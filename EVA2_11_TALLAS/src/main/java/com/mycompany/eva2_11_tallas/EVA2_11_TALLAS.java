/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_tallas;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA2_11_TALLAS {

    public static void main(String[] args) {
         int tallas;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu tallas: ");
        tallas = input.nextInt();
        
        switch(tallas){
            case 29:
                System.out.println("SMALL");
                break;
            case 42:
                System.out.println("MEDIUM");
                break;
            case 44:
                System.out.println("LARGE");
                break;
            case 48:
                System.out.println("XLARGE");
                break;
            default: 
                System.out.println("EL NUMERO DE TALLA ES INVALIDO");
        }
    }
}

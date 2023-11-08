/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EJERCICIO_2 {

    public static void main(String[] args) {
         int nume1, nume2;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        nume1 = input.nextInt();
        System.out.println("Introduce el segundo numero");
        nume2 = input.nextInt();
        
        for (int i = nume1; i <= nume2; i++){
            if ((i % 2) != 0)
            continue;
            System.out.print(i);
            System.out.print("-");
        }
    }
}

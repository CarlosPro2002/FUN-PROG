/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA1_9_AREA_TRIANGULO {

    public static void main(String[] args) {
        //TODO code application logic here;
        //double es el tipo real (para numero de parte decimal)
        double base;
        double altura;
        double area;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("introduce la base del triangulo");
        base = captu.nextDouble();
        System.out.println("introduce la altura del triangulo");
        altura = captu.nextDouble();
        
        area = (base * altura)/2;
        
        System.out.println("El area del triangulo es:");
        System.out.println(area);
        
    }
}

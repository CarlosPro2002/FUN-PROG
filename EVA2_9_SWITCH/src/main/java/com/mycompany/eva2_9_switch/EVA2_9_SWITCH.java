/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_switch;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA2_9_SWITCH {

    public static void main(String[] args) {
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero del mes: ");
        mes = input.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                System.out.println("CUMPLEAÑOS DE ESTE PAPI");
                System.out.println("UNA FIESTOTA!!");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            default: //SIEMPRE ES LA ULTIMA INSTRUCCION (PERO ES OPCIONAL)
                System.out.println("}El numero de mes no es valido");
        }
    }
}

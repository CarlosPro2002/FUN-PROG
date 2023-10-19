/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_carreras;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA2_12_CARRERAS {

    public static void main(String[] args) {
       String carrera;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce las siglas de tu carrera: ");
        carrera = input.nextLine();
        
        switch(carrera){
            case "ISC":
                System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
                break;
            case "INF":
                System.out.println("INGENIERIA EN INFORMATICA");
                break;
            case "IND":
                System.out.println("INGENIERIA INDUSTRIAL");
                break;
            case "IDI":
                System.out.println("INGENIERIA EN DISEÑO INDUSTRIAL");
                break;
            case "LA":
                System.out.println("LICENCIATURA EN ADMINISTRACION");
                break;
            case "IGE":
                System.out.println("INGENIERIA EN GESTION EMPRESARIAL");
                break;
            case "ARQ":
                System.out.println("ARQUITECTURA");
                break;
            default:
                System.out.println("SIGLAS NO VALIDAS");
                
        }
    }
}

package com.ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner omega = new Scanner(System.in);
        Random rand = new Random();
        int ramdon = rand.nextInt(100);
        System.out.println(ramdon);
        int cambio;
        int i = 0;

        while (true) {
            if (i != ramdon) {
                i++;
            }
            System.out.println("Ingrese el número aleatorio: ");
            cambio = omega.nextInt();
            
            if (cambio < ramdon) {

                System.out.println("El número oculto es mayor ");
            }

            if (cambio > ramdon) {
                System.out.println("El número oculto es menor ");
            }

            if (cambio == ramdon) {

                System.out.println("Número correcto ");
                System.out.println("Intentos realizados: "+i);
                
                break;
                
            }
            
        }

    }
    
}

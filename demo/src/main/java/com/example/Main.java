package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lamedia = new Scanner(System.in);
        System.out.print("Ingrese los números separados por comas: ");
        String ingreso = lamedia.nextLine();
        String[] elementos = ingreso.split(",");
        double[] datos = new double[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            try {
                datos[i] = Double.parseDouble(elementos[i]);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ser un número.");
            }
        }
        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Calcular la media");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = lamedia.nextInt();
            lamedia.nextLine();
            switch (opcion) {
                case 1:
                    double suma = 0;
                    for (double dato : datos) {
                        suma += dato;
                    }
                    double media = suma / datos.length;
                    System.out.println("La media es: " + media);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    System.out.println("Ingrese una opcíón valida.");
            }
        }

    }
}

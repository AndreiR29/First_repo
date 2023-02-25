package com.itfactory.extraoptionale;

import java.util.Scanner;

public class Problema1 {
    /**
     * 1. Sa se citească de la tastatura numere de tip int pana la întâlnirea lui 0.
     * Sa se afișeze numerele care satisfac relația: 20 < 6x^2 + 5x + 1 < 50.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu numarul: ");
        int x = Integer.parseInt(scanner.nextLine());

        while (x != 0) {
            int ecuatia = 6 * x * x + 5 * x + 1;
            System.out.println("Ecuatia este " + ecuatia);

             if ((20 < ecuatia) && (ecuatia < 100)) {
                 System.out.println("Numarul " + x + " satisface relatia.");

             }
             else
                 System.out.println("Numarul " + x + " nu satisface relatia.");

            System.out.println("Indrodu alt numar!");
            x = Integer.parseInt(scanner.nextLine());
        }

    }
}
 // nu am stiut sa fac afisarea la final a tuturor numerelor care satisfac relatia, asa ca am facut verificarea pentru fiecare in parte

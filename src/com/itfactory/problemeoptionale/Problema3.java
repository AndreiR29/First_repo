package com.itfactory.problemeoptionale;

import java.util.Scanner;

public class Problema3 {
    /**
     * 3. Scrieti un program in care creati o consola interactiva prin care userul poate sa aleaga optiuni de la 1 la 3.
     * La start-ul programului, va trebui sa apara un mesaj cu optiunile posibile.
     * a) Pentru optiunea 1, userul va trebui sa introduca un numar de la 1 la 10.
     * Daca numarul nu este in acest interval se va afisa un mesaj de eroare.
     * b) Pentru optiunea 2 userul va trebui sa introduca doua numere intregi si se va afisa suma acestora
     * c) Pentru optiunea 3 userul va trebui sa introduca un numar intreg pozitiv (se va face verificarea)
     * iar pe baza acestuia se vor afisa toate numerele de la 0 pana la acesta.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti una dintre urmatoarele optiuni: 1, 2 sau 3! ");
        System.out.print("Aleg opiunea: ");
        int optiune = Integer.parseInt(scanner.nextLine());
        if ((optiune != 1) && (optiune != 2) && (optiune != 3)) {
            System.out.println("Optiune aleasa este invalida. Te rugam incearca din nou!");
        }

        if (optiune == 1) {
            System.out.println("Indroduceti un numar de la 1 la 10!");
            int nr = Integer.parseInt(scanner.nextLine());
            if (nr < 1 || nr > 10) {
                System.out.println("EROARE! Numarul nu este cuprins in intervalul [1; 10]");
            }
        }
        else if (optiune == 2) {
                System.out.println("Indroduceti doua numere intregi!");
                System.out.println("Primul numar este: ");
                int nr1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Al doilea numar este: ");
                int nr2 = Integer.parseInt(scanner.nextLine());

                int suma = nr1 + nr2;
                System.out.println("Suma celor doua numere este: " + suma);
            }
        else if (optiune == 3) {
                System.out.println("Introduceti un numar intreg pozitiv!");
                int nrIntregPozitiv = Integer.parseInt(scanner.nextLine());
                if (nrIntregPozitiv > 0) {
                    for (int i = 0; i < nrIntregPozitiv; i++)
                        //System.out.println("Numerele de la 0 pana la " + nrIntregPozitiv + " sunt: " + i + "; ");
                        System.out.print(i + "; ");

                }
                else
                    System.out.println("Numarul introdus nu este intreg pozitiv.");

            }


    }
}












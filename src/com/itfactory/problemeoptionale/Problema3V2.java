package com.itfactory.problemeoptionale;

import java.util.Scanner;

public class Problema3V2 {
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
        int optiune1 = 1;
        int optiune2 = 2;
        int optiune3 = 3;

        System.out.println("Alegeti una dintre umatoarele optiuni: 1, 2 sau 3!");

        Scanner scanner = new Scanner(System.in);
        int optiune = Integer.parseInt(scanner.nextLine());
        if ((optiune != 1) && (optiune != 2) && (optiune != 3)) {
            System.out.println("Nu ai ales o optiune valida. Te rugam sa reincerci!");
        }

        switch (optiune) {
            case 1: {
                System.out.println("Ai ales optiunea 1.");
                System.out.println("Introdu un numar intre 1 si 10!");
                System.out.println("Numarul introdus este: ");
                int numar = Integer.parseInt(scanner.nextLine());
                if ((numar < 1) || (numar > 10)) {
                    System.out.println("Nu ai intrudus un numar cuprins intre 1 si 10!");
                }
            }
            case 2: {
                System.out.println("Ai ales optiunea 2.");
                System.out.println("Introdu 2 numere intregi!");
                System.out.print("Primul numar este: ");
                int numar1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Al doilea numar este: ");
                int numar2 = Integer.parseInt(scanner.nextLine());

                int suma = numar1 + numar2;
                System.out.println("Suma celor doua numere este: " + suma);
            }
            case 3: {
                System.out.println("Ai ales optiunea 3.");
                System.out.println("Introdu un numar intreg pozitiv!");
                System.out.print("Numarul introdus este: ");
                int numar3 = Integer.parseInt(scanner.nextLine());
                if (numar3 > 0) {
                    for (int i = 0; i <= numar3; i++) {
                        System.out.print(i + "; ");
                    }
                } else
                System.out.println("Numarul introdus nu este pozitiv.");

            }

        }

    }
}





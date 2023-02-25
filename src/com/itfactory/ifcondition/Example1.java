package com.itfactory.ifcondition;

import java.util.Scanner;

public class Example1
{
    /**
     * Se citeste un numar de la tastatura. Sa se afiseze un mesaj afirmativ daca numarul este mai mare ca 10
     * In caz contrar se va afisa un mesaj negativ.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int number = Integer.parseInt(scanner.nextLine());  // citim numarul de la tastatura
        // punem conditia
        if (number > 10) {
            System.out.println("Numarul este mai mare ca 10.");
        } else {
            System.out.println("Numarul NU este mai mare ca 10.");

        }
    }
}

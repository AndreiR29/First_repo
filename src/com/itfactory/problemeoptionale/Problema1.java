package com.itfactory.problemeoptionale;

import java.util.Scanner;

public class Problema1 {
    /**
     * 1. Scrieti un program in care, folosind o bucla (? decideti voi care) o sa cititi de la tastatura numere intregi
     * pana la intalnirea unui numar divizibil cu 7.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number % 7 != 0) {
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Numarul anterior este divizibil cu 7, deci ne oprim.");

    }
}

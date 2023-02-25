package com.itfactory.extraoptionale;

import java.util.Scanner;

public class Problema2 {
    /**
     * 2. Sa se citească de la tastatura numere de tip int pana userul introduce un număr negativ.
     * In momentul în care introduce numărul negativ se va afișa suma numerelor precedente.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.print("Introdu numarul: ");
        int numar = Integer.parseInt(scanner.nextLine());

        while (numar > 0) {
            suma = suma + numar * numar;

            System.out.print("Introduceti urmatorul numar: " );
            numar = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Suma patratelor este: " + suma);
    }
}

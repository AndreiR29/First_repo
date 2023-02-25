package com.itfactory.dowhilecondition;

import java.util.Scanner;

public class Example2
{
    /**
     * Sa se implementeze un program in care se citeste initial un numar x int de la tastatura
     * Sa se creeze o bucla de tip <do while> in care la acest numar se adauga cate un nou numar citit pana in momentul in care acesta depaseste valoarea de 50 (Sau puteti alege voi)
     *
     * @param args
     */
    public static void main(String[] args)
    {
        //int x, y;  // am adaugat variabilele
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numarul initial: ");
        int x = scanner.nextInt();  // citim numarul x
        do
        {
            System.out.print("Introduceti noul numar: ");
           int y = scanner.nextInt();
            System.out.println("S-a citit numarul: " + y);
            x = x + y; //x += y este un mod mai simplu de a-l aduna pe y la x.
            System.out.println("Am obtinut numarul: " + x);
            System.out.println("--------------------------");
        } while (x <= 50); // punem conditia care ne da voie sa introducem numerele

        System.out.println("Am iesit din bucla");
    }
}
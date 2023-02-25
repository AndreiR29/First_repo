package com.itfactory.whilecondition;

import java.util.Random;

public class Example2
{
    /**
     * Se se genereze numere intr-o bucla, intre 0 si 100 pana cand numarul este mai mic decat 50
     * @param args
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int nr = random.nextInt(0, 100);
        System.out.println("Numarul random este: " + nr );
        while (nr > 50) {
            nr = random.nextInt(0, 100);
            System.out.println("Numarul random este: " + nr);
        }
        if (nr < 50) {
            System.out.println("S-a generat un numar mai mic decat 50. STOP!");
        }

    }
}
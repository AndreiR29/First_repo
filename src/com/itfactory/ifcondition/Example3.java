package com.itfactory.ifcondition;

import java.util.Random;

public class Example3
{
    /**
     Vreau sa verific daca un numar este intre 1 si 25, intre 25 si 50, intre 50 si 75 sau intre 75 si 100
     1.....25......50......75.....100 ?
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomInt = random.nextInt(100);

        if(randomInt >= 1 && randomInt <= 25) {
            System.out.println("Numarul " + randomInt + " este cuprins intre 1 si 25");
        } else if (randomInt >= 26 && randomInt <= 50) {
            System.out.println("Numarul " + randomInt + " este cuprins intre 26 si 50");
        } else if  (randomInt >= 51 && randomInt <= 75) {
            System.out.println("Numarul " + randomInt + " este cuprins intre 51 si 75");
        } else {
            System.out.println("Numarul " + randomInt + " este cuprins intre 75 si 100");

        }

    }
}

package com.itfactory.whilecondition;


public class Example3
{
    /**
     * Se da un numar x = 1.
     * Se se incrementeze numarul x pana cand acesta depaseste 5.
     * @param args
     */
    public static void main(String[] args)
    {
        int x = 1;

        while (x <=5) {
            System.out.println("Numarul este: " + x);
            x++;
        }
        System.out.println("Urmatorul numar depaste valoarea 5. Deci ne oprim aici.");


    }
}
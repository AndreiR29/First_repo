package com.itfactory.forcondition;

import java.util.Random;

public class Example2 {
    /**
     * Sa se creeze un program in care se vor parcurge numerele de la 0 la 19
     * La fiecare iteratie, se va genera un numar random x intre 0 si 20
     * Se va verifica conditia daca indexul adunat cu numarul generat random este 30, se va afisa un mesaj de match.
     * <p>
     * Exemplu: la indexul 12 s-a generat numarul x=18. Prin urmare 12 + 18 = 30
     *
     * @param args
     */
    public static void main(String[] args)
    {
            Random random = new Random();
            int x = random.nextInt(20); // x ia valoarea unui numar random, care poate fi cel mult 20
        System.out.println("Numarul random este " + x); // am afisat numarul random
            for ( int i = 0; i < 20; i++) {
                if ((i + x) == 30) {
                    System.out.println("Am gasit un match: " + i + " : " + x);
            }
                System.out.println("Suma dintre nr random si index este "+ (i+x)); // aici am afisat sa vad cum functioaza programul
                // initial se genereaza un numar random
                // apoi <i> ia valori de la 0 la 20
                // in momentul in care suma dintre nr random si valoarea lui <i> este 30, apare mesajul:"Am gasit un match"
                // pentru a afisa mesajul de mai sus, nr random trebuie sa fie cel putin egal cu 11
        }
    }
}

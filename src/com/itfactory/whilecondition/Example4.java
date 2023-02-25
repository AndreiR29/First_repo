package com.itfactory.whilecondition;

import java.util.Random;

public class Example4
{
    /**
     * Se cere sa se creeze o bucla while prin care se genereaza cate un numar randon intre 1 si 10 la fiecare iteratie.
     * In momentul in care s-a generat 5 se va iesi din bucla.
     * @param args
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(10 + 1); // se genereaza primul nr random si in functie de valoarea lui intram in bucla while
        System.out.println("Primul numar random generat este: " + x); // se afiseaza primul nr random

        while (x != 5)  // cat timp primul nr random este diferit de 5 se executa bucla
        {
            x = random.nextInt(1, 10); // se genereaza un al doilea numar random
            System.out.println("Numarul generat este: " + x); // se afiseaza al doilea nr random
                                                             // noul valoare a lui x pentru care se verifica instructiunea while va fi al doilea numar random
        }
// daca valoarea lui x generat random va fi 5 se va afisa urmatorul mesaj
        System.out.println("Ultimul numar generat este egal cu 5, deci ne oprim.");
    }

}



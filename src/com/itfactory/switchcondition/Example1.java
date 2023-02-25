package com.itfactory.switchcondition;

import java.util.Random;

public class Example1
{
    /**
     * Sa se genereze un numar random int intre 0 si 3.
     * Sa se creeze un statement switch prin care se verifica numarul generat.
     * Se va afisa un mesaj in momentul in care numarul coincide cu case-ul spefic si se iese din switch.
     * @param args
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(3 + 1);
        // am afisat valoarea lui x pentru a vedea ce nr random a fost ales si daca acesta concide cu case-ul specific
        //doar pentru verificare am facut acesta afisare
       // System.out.println("Valoarea lui x este " + x);
        switch (x)
        {
            case 0: {
                System.out.println("Am generat random 0");
            }
            break;
            case 1: {
                System.out.println("Am generat random 1");
            }
            break;
            case 2: {
                System.out.println("Am generat random 2");
            }
            break;
            case 3: {
                System.out.println("Am generat random 3");
            }
            break;
        }
    }
}
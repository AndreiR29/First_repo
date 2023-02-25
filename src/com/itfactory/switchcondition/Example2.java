package com.itfactory.switchcondition;

import java.util.Random;

public class Example2
{
    /**
     * Sa se genereze un numar int random intre 0 si 4
     * Sa se creeze un statement switch prin care se verifica numarul generat.
     * In cazul in care s-a generat 0 o sa afisez un mesaj "Nu am nicio bomboana"
     * In cazul in care s-a generat 1 o sa afisez un mesaj "Am o bomboana"
     * In cazul in care s-a generat 2,3 sau 4 sa se afisze mesajul "Am  o bomboane"
     * @param args
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(4 + 1);
        System.out.println("Numarul genera este: " + x);

        switch (x)
        {
            case 0: {
                System.out.println("Nu am nicio bomboana.");
            }
            break;

            case 1: {
                System.out.println("Am o bomboana.");
            }
            break;

            /* am facut la fel si pentru cazurile 2,3,4
              apoi am folosit default pentru ca e mai simplu, in cazul in care numarul generar nu e 0 sau 1, e de la sine inteles ca e 2, 3 sau 4
            */

            /*
            case 2: {
                System.out.println("Am doua bomboane.");
            }
            break;

            case 3: {
                System.out.println("Am trei bomboane.");
            }
            break;

            case 4: {
                System.out.println("Am patru bomboane.");
            }
            break;
            */
            default : {
                System.out.println("Am mai mult de o bomboana.");
            }



        }

        //Pentru verificare puteti afisa numarul generat.
       // System.out.println(x);
    }
}
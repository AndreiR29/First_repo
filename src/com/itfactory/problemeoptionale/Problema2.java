package com.itfactory.problemeoptionale;

public class Problema2 {
    /** Scrieti un program in care afisati toate numerele intregi de la -100 la 100, mai putin cele divizibile cu 2 sau cu 3.
     */
    public static void main(String[] args) {

        for (int i =-100; i<100; i++) {
            if ((i % 2 != 0) && (i % 3 != 0)) {
                System.out.print(i + "; ");
            }
        }
    }
}

package java004;

import java.util.Scanner;

public class Java004 {

    public static void main(String[] args) {
        // leer dos variable de tipo int
        // comparar si son iguales o cual es menor o mayor
        Scanner scn = new Scanner(System.in);
        int a, b;

        // captura de datos
        System.out.print(" a : ");
        a = scn.nextInt();
        System.out.print(" b : ");
        b = scn.nextInt();

        /*
         if(a==b){ System.out.println(a+" es igual a "+b); }
         if(a<b){ System.out.println(a+" es menor que "+b); }
         if(a>b){ System.out.println(a+" es mayor que "+b); }
         */
        if (a == b) {
            System.out.println(a + " es igual a " + b);
        } else {
            if (a < b) {
                System.out.println(a + " es menor que " + b);
            } else {
                System.out.println(a+" es mayor que "+b);
            }
        }
    }
}


package java005;

import java.util.Scanner;

public class Java005 {

    public static void main(String[] args) {
        // Leer tres valores enteros desde teclado
        // mostrar en pantalla cual es mayor, mediano y el menor

        // operadores lógicos
        // == igual que
        // != distinto que
        // < menor que - <= menor o igual que
        // > mayor que - >= mayor o igual que
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + " > " + b + " > " + c);
            } else {
                System.out.println(a + " > " + c + " > " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(b + " > " + a + " > " + c);
            } else {
                System.out.println(b + " > " + c + " > " + a);
            }
        } else {
            if (a >= b) {
                System.out.println(c + " > " + a + " > " + b);
            } else {
                System.out.println(c + " > " + b + " > " + a);
            }
        }

        if (a <= b) {
            if (a <= c) {
                if (b <= c) {
                    System.out.println(c + " > " + b + " > " + a);
                } else {
                    System.out.println(b + " > " + c + " > " + a);
                }
            } else {
                System.out.println(b + " > " + a + " > " + c);
            }
        } else if (c <= b) {
            System.out.println(a + " > " + b + " > " + c);
        } else if (c <= a) {
            System.out.println(a + " > " + c + " > " + b);
        } else {
            System.out.println(c + " > " + a + " > " + b);
        }
    }
}

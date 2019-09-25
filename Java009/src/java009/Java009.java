package java009;

import java.util.Scanner;

public class Java009 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        // ingresar dos valores enteros a, b
        int a, b, r, conta;

        // hacer producto con sumas sucesivas
        System.out.println("***************************");
        System.out.print("a : "); a = scn.nextInt();
        System.out.print("b : "); b = scn.nextInt();
        r = 0;
        for (int i = 1; i <= a; i++) {
            r = r + b;
        }
        System.out.println(a+"*"+b+" = " + r);

        // dividir con restas sucesivas
        System.out.println("***************************");
        System.out.print("a : "); a = scn.nextInt();
        System.out.print("b : "); b = scn.nextInt();
        r=a;
        conta = 0;
        while (r >= b) {
            r = r - b;
            conta++;
        }
        System.out.println(a+"/"+b+" = " + conta);
        System.out.println("con resto = "+r);

    }

}

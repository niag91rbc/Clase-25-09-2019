
package java006;

import java.util.Scanner;

public class Java006 {

    public static void main(String[] args) {
        // Leer dos variables int a, b
        // Leer la operacion de tipo cadena op
        // s=suma, r=resta, p=multiplicación, d=divisíon
        Scanner scn=new Scanner(System.in);
        int a, b, r;
        String op;
        // lectura de datos
        System.out.print(" a : "); a=scn.nextInt();
        System.out.print(" b : "); b=scn.nextInt();
        System.out.print(" op : "); op=scn.next();
        r=0;
        switch(op){
            case "s": r=a+b; break;
            case "r": r=a-b; break;
            case "p": r=a*b; break;
            case "d": r=a/b; break;
        }
        System.out.println("Resultado es "+r);
    }
    
}

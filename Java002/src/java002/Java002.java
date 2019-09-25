package java002;

import java.util.Scanner;

public class Java002 {

    public static void main(String[] args) {
        // leer datos desde teclado - usamos la libreria Scanner    
        Scanner scn = new Scanner(System.in);
        // declarar variable float
        float a, b, r;

        // ingreso desde teclado para variable a, b
        System.out.print("Ingrese a : ");
        a = scn.nextFloat();
        System.out.print("Ingrese b : ");
        b = scn.nextFloat();
        
        r=a+b; System.out.println("Suma : "+r);
        r=a-b; System.out.println("Resta : "+r);
        r=a*b; System.out.println("Multiplicación : "+r);
        r=a/b; System.out.println("División : "+r);
    }
}

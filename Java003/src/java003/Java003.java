
package java003;

import java.util.Scanner;

public class Java003 {

    public static void main(String[] args) {
        // Sentencias de selección
        // if
        Scanner scn=new Scanner(System.in);
        int a, b;
        
        // obtener valore para la variable a y b
        System.out.print(" a : "); a=scn.nextInt();
        System.out.print(" b : "); b=scn.nextInt();
        if(a%b == 0){
            System.out.println(a+" es divisible por "+b+" = "+(a/b));
        }else{
            System.out.println(a+" no es divisible por "+b+" su resto es "+(a%b));
        }
    }
    
}

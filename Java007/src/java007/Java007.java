
package java007;

public class Java007 {

    public static void main(String[] args) {
        // genere la siguiente serie
        // 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, .....
        
        // sumas sucesivas
        int r=0;
        for(int i=1; i<=10; i++){
            // r=r+i;
            r+=i;
            System.out.println(r);
        }
        
        // Factorial o productos sucesivos
        r=1;
        for(int i=1; i<=6; i++){
            // r=r*i;
            r*=i;
            System.out.println(r);
        }
        
    }
    
}

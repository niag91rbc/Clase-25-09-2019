
package java008;

public class Java008 {

    public static void main(String[] args) {
        // sentencias de iteracion con condición lógica
        // while(){}  -- do{ }while()
        
        // generar la seria de las sumas sucesiva
        int i;
        i=1;
        while(i<=10){
            System.out.println(i*(i+1)/2);
            i=i+1; // i+=1; o i++;
        }
    }
}

package inverso;
import java.util.Scanner;

public class Inverso {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];
        
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }
       for (int i = numeros.length - 1; i >= 0 ; i--) {
           System.out.println(numeros[i]);
       }
            
    }
    
}

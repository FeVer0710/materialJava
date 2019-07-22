package enteros;
import java.util.Scanner;

public class Enteros {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[4];
        
        for(int i=0;i<4;i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println(numeros[0]);
        System.out.println(numeros[3]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
    }
    
}

package enteros_correcto;
import java.util.Scanner;

public class Enteros_correcto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[10];
        int PN=0, UN=9;
        for(int i = 0;i < 10;i++){
            System.out.print((i+1) + ". Digite el numero: ");
            numeros[i] = entrada.nextInt();
        }
        for(int i = 0; i<5;i++){
            System.out.println(numeros[PN]);
            PN++;
            System.out.println(numeros[UN]);
            UN--;
        }
    }
    
}

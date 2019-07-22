package e3;
import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        
        a = new int[10]; //ARREGLO a CON 10 ELEMENTOS
        b = new int[10]; //ARREGLO b CON 10 ELEMENTOS
        c = new int[20]; //ARREGLO c CONTENDRA LOS ARREGLOS a Y b
        
        //SE LLENA EL ARREGLO a
        System.out.println("Digite el primer arreglo: ");
        for(int i=0;i<10;i++){
            System.out.println((i+1) + ". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        //SE LLAMA AL ARREGLO b
        System.out.println("/nDigite el segundo arreglo: ");
        for(int i=0;i<10;i++){
            System.out.println((i+1) + ". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        //SE MEZCLAN LOS ARREGLOS a Y b EN c
        int j=0;
        for(int i=0;i<10;i++){
            c[j] = a[i]; //1°A, 2°A... 10°A
            j++;
            c[j] = b[i]; //1°B, 2°B... 10°B
            j++;
        }
        System.out.println("El tercer arreglo es: ");
        for(int i=0;i<20;i++){
            System.out.println(c[i] + " ");
        }
        System.out.println();
    }
    
}

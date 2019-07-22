package inverso_correcto;
import java.util.Scanner;

public class Inverso_correcto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        
        for(int i=0;i<5;i++){
            System.out.println((i+1) + ". Digite un numero:");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("Imprimir los elementos del arreglo");
        for(int i=4; i>0; i--){
            System.out.println(numeros[i]);
        }
    }
    
}

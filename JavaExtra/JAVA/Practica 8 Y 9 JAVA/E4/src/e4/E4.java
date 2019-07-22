package e4;
import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = false, decreciente = false;
        
        System.out.println("Llenar el arreglo: ");
        for(int i=0;i<10;i++){
            System.out.println((i+1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        for(int i=0;i<9;i++){
            if(arreglo[i] < arreglo[i+1]){ //CRECIENTE
                creciente = true;
            }
            if(arreglo[i] > arreglo[i+1]){ //DECRECIENTE
                decreciente = true;
            }
        }
        if(creciente == true && decreciente == false){
            System.out.println("El arreglo esta en forma creciente");
        }
        else if(creciente == false && decreciente == true){
            System.out.println("El arreglo esta en forma decreciente");
        }
        else if(creciente == true && decreciente == true){
            System.out.println("El arreglo esta desordenado");
        }
        else if(creciente == false && decreciente == false){
            System.out.println("Todos los elementos del arreglo son iguales");
        }
    }
    
}

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingerese el primer numero");
    int N1 = input.nextInt();
     System.out.println("Ingrese el segundo numero");
    int N2 = input.nextInt();
    if (N1 == N2){
        System.out.println("El numero 1 y numero 2 son iguales");
    }else if (N1 < N2){
        System.out.println("El numero 2 es mayor que el numero 1");
    }else if (N1 > N2){
        System.out.println("EL numero 1 es mayor que el numero 2");
    }
    }
    
}

package a2;
import java.util.Scanner;
public class A2 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el primer valor:");
    int S1 = input.nextInt();
    System.out.println("Ingrese el segundo valor:");
    int S2 = input.nextInt();
    int Suma = S1 + S2;
    System.out.println("La suma de " + S1 + " + " + S2 + " es igual a " + Suma);
    System.out.println();
    
    System.out.println("Ingrese el primer valor:");
    int R1 = input.nextInt();
    System.out.println("Ingrese el segundo valor:");
    int R2 = input.nextInt();
    int Resta = R1 - R2;
    System.out.println("La de resta de " + R1 + " - " + R2 + " es igual a " + Resta);
    System.out.println();
    
    System.out.println("Ingrese el primer valor: ");
    int M1 = input.nextInt();
    System.out.println("Ingrese el segundo valor:");
    int M2 = input.nextInt();
    int Multiplicacion = M1 * M2;
    System.out.println("La multiplicacion de " + M1 + " * " + M2 + " es igual a " + Multiplicacion);
    System.out.println();
    
    System.out.println("Ingrese el primer valor: ");
    int D1 = input.nextInt();
    System.out.println("Ingrese el segundo valor: ");
    int D2 = input.nextInt();
    int Division = D1 / D2;
    System.out.println("La division de " + D1 + " / " + D2 + " es igual a " + Division);
    System.out.println();
    }
    
}

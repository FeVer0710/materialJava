package a5;
import java.util.Scanner;
public class A5 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = -1;
    while (numero <= 0) {
        System.out.println("Introduce un numero positivo: ");
        numero = sc.nextInt();
    }
    sc.close();
    }
}

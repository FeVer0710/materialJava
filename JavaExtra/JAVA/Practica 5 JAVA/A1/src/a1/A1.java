package a1;
import java.util.Scanner;
public class A1 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = input.nextInt();
    System.out.println("Cuenta hasta: " + numero);
    for (int i = 1; i <= numero; i++){
    System.out.println(i);
    }
    }
}

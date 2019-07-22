package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el radio del circulo");
    double R = input.nextDouble();
    double A = Math.PI*Math.pow(R,2);
    System.out.println(A);
    }
    
}

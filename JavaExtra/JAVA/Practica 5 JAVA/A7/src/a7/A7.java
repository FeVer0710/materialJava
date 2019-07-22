package a7;
import java.util.Scanner;
public class A7 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = input.nextInt();
        System.out.println("Numero par menor que: " + numero);
        int n;
        do {
            n = (int) (Math.random() * numero);
         System.out.println(n);   
        }while (n % 2 !=0);
     System.out.println("Y el numero par elegido es: " + n);  
    }
    
}

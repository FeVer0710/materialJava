package pkg2aparcial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
                            //CON FOR
    System.out.println("Ingrese el numero que desea multiplicar");
    int numero = input.nextInt();
    System.out.println("Esta es la tabla del " + numero);
    for (int i = 1; i<=10 ;i++){
        System.out.println(numero + " * " + i + " = " + numero*i);
    }
    System.out.println();
    
                           //CON WHILE
    System.out.println("Ingrese el numero que desea multiplicar");
    int n = input.nextInt();
    int i = 1;
    System.out.println("Esta es la tabla del " + n);
    while (i <= 10)
    {
        System.out.println(n + " * " + i + " = " + n*i);
        i++;
    }
    }
}

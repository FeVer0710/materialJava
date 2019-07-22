package a1;
//Se importa el paquete java.util con la clase scanner
import java.util.Scanner;
public class A1 {

    public static void main(String[] args) {
     //se crea el objeto input de la clase scanner
     Scanner input = new Scanner(System.in);
     
     //se pregunta el valor
     System.out.println("Ingresa un texto: ");
     
     //se espera q que el ususario ingrese el texto
     String linea = input.nextLine(); 
     
     //se imprime en pantalla lo que el usuario ingreso
     System.out.println("Tu ingresaste: " + linea);
     
     System.out.println("Ingrese un valor entero: ");
     int entero = input.nextInt();
     System.out.println("Tu ingresaste: " + entero);
     
     System.out.println("Ingrese un valor decimal: ");
     double decimal = input.nextDouble();
     System.out.println("Tu ingresaste: " + decimal);
    }
    
}

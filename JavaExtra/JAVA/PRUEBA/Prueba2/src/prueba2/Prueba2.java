package prueba2;
import java.util.Scanner;
public class Prueba2 {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
     
    int mayor;
    int medio;
    int menor;
    
    System.out.println("Ingrese el primer numero");
    int n1 = scanner.nextInt();
    System.out.println("Ingrese el segundo numero");
    int n2 = scanner.nextInt();
    System.out.println("Ingrese el tercer numero");
    int n3 = scanner.nextInt();
    
    if (n1 > n2 && n1 > n3){
       mayor = n1;
       if (n2 > n3){
       medio = n2;
       menor = n3;
       }else {
       medio = n3;
       menor = n2;
       }
       System.out.println("El numero mayor es: " + mayor);
       System.out.println("El numero medio es: " + medio);
       System.out.println("El numero menor es: " + menor);
       }
    if (n2 >n1 && n2 > n3) {
        mayor = n2;
        if (n1 > n3){
            medio = n1;
            menor = n3;
        }else {
            medio = n3;
            menor = n1;
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero medio es: " + medio);
        System.out.println("El numero menor es: " + menor);
        }
    if (n3 > n1 && n3 > n2){
        mayor = n3;
        if (n2 > n1){
            medio = n2;
            menor = n1;
        }else{
            medio = n1;
            menor = n2;
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero medio es: " + medio);
        System.out.println("El numero menor es: " + menor);
    }    
    }
}

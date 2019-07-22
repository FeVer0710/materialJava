package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        metodos met = new metodos();
        double n1, n2, resultado;
        int opcion;
        boolean op = true;
        while (op){
            System.out.println("********************");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Selleciona una opcion: ");
            opcion = entrada.nextInt();
            
            if (opcion == 5){
                System.out.println("Finalizada la tarea.......");
                break;
            }else {
                switch (opcion){
                    case 1:
                        System.out.print("Ingrese el primer numero: ");
                        n1 = entrada.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        n2 = entrada.nextDouble();
                        resultado = met.sumar(n1, n2);
                        System.out.println("El resultado de la suma es: " + resultado);
                        break;
                    case 2:
                        System.out.print("Ingrese el primer numero: ");
                        n1 = entrada.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        n2 = entrada.nextDouble();
                        resultado = met.restar(n1, n2);
                        System.out.println("El resultado de la resta es: " + resultado);
                        break;
                    case 3:
                        System.out.print("Ingrese el primer numero: ");
                        n1 = entrada.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        n2 = entrada.nextDouble();
                        resultado = met.multiplicar(n1, n2);
                        System.out.println("El resultado de la multiplicacion es: " + resultado);
                        break;
                    case 4:
                        System.out.print("Ingrese el primer numero: ");
                        n1 = entrada.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        n2 = entrada.nextDouble();
                        resultado = met.dividir(n1, n2);
                        System.out.println("El resultado de la division es: " + resultado);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }
    }
    
}

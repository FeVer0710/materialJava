package a3;

public class A3 {

    public static void main(String[] args) {
    String saludo = "hola mi nombre es ";
    String nombre = "Vegeta";
    int ssj = 4;
    System.out.println("my name is " + "Edgar");
    System.out.println(saludo + nombre);
    System.out.println("Puedo convertirme en SSJ nivel " + ssj);
    System.out.println();
    
    int accountBalance = 200;
    String bankMessage = String.format("El balance de la cuenta es de %d ",accountBalance);
    System.out.println(bankMessage);
    System.out.println();
    
    int age = 34;
    String name = "Jaime";
    String output = String.format("%s tiene %d años de edad.",name,age);
    System.out.println(output);
    System.out.println();
    
    String intro = "El resultado de";
    String plus = "mas";
    double primero = 2.5;
    double segundo = 5.8;
    double resultado = primero + segundo;
    String cadena = String.format("%s %f %s %f es: %f",intro,primero,plus,segundo,resultado);
    System.out.println(cadena);
    }
    
}

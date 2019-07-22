package a2;

public class A2 {

    public static void main(String[] args) {
        int temperatura = 26;
    String queHacer = (temperatura > 25)? "A la playa!!!" : "Esperando el buen tiempo...";
    System.out.println(queHacer);
    
    double numero = (temperatura > 10) ? (Math.random() * 10) : 0 ;
    System.out.println(numero);
   
    }
    
}

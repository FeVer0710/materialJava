package puebra1;
import java.util.Scanner;
public class Puebra1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese la temperatura en grados Centigrados" );
    float gC = sc.nextFloat();
    float gF = (gC * 9/5) + 32;
    System.out.println("La temperatura en grados Fahrenheit es: " + gF + "°" + " F ");
    }
    
}

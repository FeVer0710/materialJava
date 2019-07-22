package pkg1aparcial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double Sueldo;
        System.out.println("Por favor, introduzca el numero de horas trabjadas: ");
        int horasDeTrabajo = sc.nextInt();
        if (horasDeTrabajo <= 35){
            Sueldo = 12 * horasDeTrabajo;
        }else {
            Sueldo = (35 * 12) + ((horasDeTrabajo-35) * 25);
    System.out.println("Su sueldo semnanal es de: $" + Sueldo + " Dolares");
    }
  }
}

package a2;
import java.util.Scanner;
public class A2 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
     System.out.println("Ingrese un numero entre 0 y 9,999");
int n = input.nextInt(); 
int i; 
for (i=0;n>0;n/=10,i*=10) 
    i+=n%10; 
System.out.println(i/10); 
    }
    
}

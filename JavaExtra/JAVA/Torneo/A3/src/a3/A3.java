package a3;
import java.util.Scanner;
public class A3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int j,num,cont_pri;
 boolean primo;
 cont_pri=0;
 System.out.print("Introduce numero: ");
 num = input.nextInt();
 for(int i=1;i<=num;i++){

 primo=true;
 j=2;
 while (j<=i-1 && primo==true)
 {
 if (i%j==0)
 primo=false;
 j++;
 }
 if (primo==true){
 cont_pri++; 
 System.out.println(i+(" es primo"));
 }
 }
 System.out.println("En el rango 1.." + num + ", hay "+ cont_pri + " números primos");
 }
}

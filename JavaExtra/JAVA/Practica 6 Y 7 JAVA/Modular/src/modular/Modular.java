package modular;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Modular {
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    public static int numero;
    
    public static boolean perfecto(){
        int i;
        int suma = 0;
        
        for (i = numero-1; i>=1; i--)
            if(numero%i == 0)
                suma += i;
        return suma == numero;
    }
    
    public static boolean defectivo(){
        int i;
        int suma = 0;
        
        for (i = numero-1; i>=1; i--)
            if(numero%i == 0)
                suma += i;
        if (numero > suma)
            return true;
        else
            return false;
    }
    public static boolean abundante(){
        int i;
        int suma = 0;
        
        for (i = numero; i>1; i--)
            if (numero%i == 0)
                suma += i;
        if (suma > 2 * numero)
            return true;
        else
            return false;
    }
    public static void main(String[] args) throws IOException{
        
        boolean p, d;
        System.out.println("Programa que detecta los siguientes tipos de numneros: ");
        System.out.println("Es perfecto, Defectivo y/o Abundante");
        System.out.println("Escirba el numero a evaluar: ");
        entrada = buffer.readLine();
        numero = Integer.parseInt(entrada);
        
        p = perfecto();
        if (p == true)
            System.out.println("El numero: " + numero + " es perfecto");
        else 
            System.out.println("El numero: " + numero + " NO es perfecto");
        
        d = defectivo();
        if (d)
            System.out.println("El numero: " + numero + " es defectivo");
        else 
            System.out.println("El numero: " + numero + " NO es defectivo");
        if (abundante())
            System.out.println("El numero: " + numero + " es abundante");
        else 
            System.out.println("El numero: " + numero + " NO es abundante");
    }
}

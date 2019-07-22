package e2;
import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float suma_pos = 0, suma_neg = 0, media_pos, media_neg;
        int conteo_pos = 0, conteo_neg = 0, conteo_ceros = 0;
        
        System.out.println("Guardando los numeros en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1) + ". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
            
            if(numeros[i] == 0){
                conteo_ceros++;
            }
            else if(numeros[i] > 0){
                suma_pos += numeros[i];
                conteo_pos++;
            }
            else{
                suma_neg += numeros[i];
                conteo_neg++;
            }
        }
        //MEDIA DE NUMEROS POSITIVOS
        if(conteo_pos == 0){
            System.out.println("No se puede calcular la media de numeros positivos");
        }
        else{
            media_pos = suma_pos / conteo_pos;
            System.out.println("La media de numeros positivos es: " + media_pos);
        }
        //MEDIA DE NUMEROS NEGATIVOS
        if(conteo_neg == 0){
            System.out.println("No se puede calcular la media de numeros negativos");
        }
        else{
            media_neg = suma_neg / conteo_neg;
            System.out.println("La media de numeros negativos es: " + media_neg);
        }
        System.out.println("La cantidad de ceros es: " + conteo_ceros);
    }
    
}

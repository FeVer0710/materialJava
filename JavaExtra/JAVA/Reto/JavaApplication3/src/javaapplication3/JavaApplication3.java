package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
    int P = 10;
    System.out.println("Ingrese su nota de programacion estructurada: " + P);
    double M = 5.7;
    System.out.println("Ingrese su nota de Desarrollo de pensamiento matematico: " + M);
     int I = 8;
     System.out.println("Ingrese su nota de Contruccion de frases en ingles sobre cuestiones laborales: " + I);
    if (P > 6){
        System.out.println("Programacion estructurada-Aprobada");
    }else {
        System.out.println("Programacion estructurada-Reprobado");
    }if (M > 6){
        System.out.println("Desarollo del pensamiento matematico-Aprobado");
    }else {
        System.out.println("Desarollo del pensamiento matematico-Reprobado");
    }if (I > 6){
        System.out.println("Contruccion de frases en ingles sobre cuestiones laborales-Aprobado");
    }else {
        System.out.println("Contruccion de frases en ingles sobre cuestiones laborales-Reprobado");
    }
    }
    
}

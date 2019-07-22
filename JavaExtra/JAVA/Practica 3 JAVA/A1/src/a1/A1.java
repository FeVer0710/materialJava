package a1;

public class A1 {

    public static void main(String[] args) {
    int temperatura = 30;
    boolean haceSol = true;
    boolean nevando = false;
    
    if (temperatura > 25){System.out.println("A la playa!!!");
    }
    if (haceSol){System.out.println("No olvides la sombrilla"); 
    }
    if (nevando || haceSol){System.out.println("Que bien");
    }
    if (nevando && (temperatura >= 20 && temperatura <= 30)){System.out.println("No me lo creo");
    }
    if ((temperatura < 0 || temperatura > 30)&& haceSol){System.out.println("Mejor me quedo en casa");
    }
    }
    
}

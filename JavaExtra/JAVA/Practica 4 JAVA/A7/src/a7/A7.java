package a7;

public class A7 {

    public static void main(String[] args) {
    int Dia = 6;
    Integer diasHastaFinSemana = 0;
    if (Dia > 1 && Dia < 7){
        if (Dia < 6){
            diasHastaFinSemana++;
            if (Dia < 5){
                diasHastaFinSemana++;
                if (Dia < 4){
                    diasHastaFinSemana++;
                    if (Dia <3){
                        diasHastaFinSemana++;
                    }
                }
            }
        }
        System.out.println("Dia laboral: Dias restantes hasta el fin de semana: " + diasHastaFinSemana);
    }else if (Dia == 1 || Dia == 7){
        System.out.println("Fin de semana");
    }else {
        System.out.println("La semana solo tiene 7 dias");
    }
    }
    
}

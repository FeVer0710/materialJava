package a6;

public class A6 {

    public static void main(String[] args) {
    Integer diasHastaFinSemana = 0;
        int Dia = 1;
    switch (Dia){
        case 2:
            diasHastaFinSemana++;
        case 3:
            diasHastaFinSemana++;
        case 4:
            diasHastaFinSemana++;
        case 5:
            diasHastaFinSemana++;
        case 6:
            System.out.println("Dias laboral: Dias restantes hasta el fin de semana: " 
                    + diasHastaFinSemana);
            break;
        case 1:
        case 7:
            System.out.println("Fin de semana");
            break;
        default:
            System.out.println("La semana solo tiene 7 dias");
            break;
    }
    }
    
}

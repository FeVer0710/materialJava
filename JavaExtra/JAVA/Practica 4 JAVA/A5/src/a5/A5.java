package a5;

public class A5 {

    public static void main(String[] args) {
        int Dia = 1;
    switch (Dia){
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
            System.out.println("Dia laboral");
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

package a4;

public class A4 {

    public static void main(String[] args) {
    String tipoVehiculo = "Coche";
    switch (tipoVehiculo) {
        case "Coche":
            System.out.println("Puedes pasar de 00:00 a 08:00");
        break;
        case "Camion":
            System.out.println("Puedes pasar de 08:00 a 16:00");
        break;
        case "moto":
            System.out.println("Puedes pasar de 16:00 a 24:00");
        break;
        default:
            System.out.println("No se puede pasar con un: " + tipoVehiculo);
            break;
    }
    }
    
}

package a1;

public class A1 {

    public static void main(String[] args) {
        int temperatura = 25;
        boolean nevando = false; 
        if (temperatura > 15){
            if (temperatura > 25){
                System.out.println("A la playa!!!");
            }else {
                System.out.println("A la montaña!!!");
            }
        }else if (temperatura < 5){
            if (nevando){
                System.out.println("A esquiar!!!");
            }
        }else {
            System.out.println("A descansar... zZz");
        }
    }
    
}

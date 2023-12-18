import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cantidad de dinero");
        double dinero = teclado.nextDouble();

        int b10 = (int) dinero/10;
        int b5 = (int) dinero;
        int m50 = (int) dinero;
        int m10 = (int) dinero;
        int m5 = (int) dinero;
        int m1 = (int) dinero;

        System.out.println("El número de billetes de 10 es de " + b10);
    }
}

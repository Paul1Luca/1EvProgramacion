import java.io.IOException;
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entre 32 y 255");
        int num = (char) System.in.read();

        System.out.println("Su equvalente en carácter es " + (char) num);


    }
}

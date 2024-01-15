import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce todos los números que quieras y termina con un .");
        int num;
        int contador = 0;

        do {
            num = teclado.nextInt();
            int mayor = num;
            if (mayor < num){
                System.out.println(mayor);
            }

            contador++;
        }while (!(num == '.'));
        System.out.println("Has introducido " + contador + " números");
    }
}

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos números");
        int N = teclado.nextInt();
        int M = teclado.nextInt();
        int num = N;

        if (M > N) {
            do {
                System.out.println(num);
                num++;
            } while (num <= M);
        } else {
            do {
                System.out.println(num);
                num--;
            } while (num >= M);
        }
    }
}

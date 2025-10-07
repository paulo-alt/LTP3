import java.util.Scanner;

public class Trindade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os três números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("É possível formar um triângulo");
        } else {
            System.out.println("Não é possível formar um triângulo");
        }

        sc.close();
    }
}

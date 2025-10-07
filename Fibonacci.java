public class Main {
    public static void main(String[] args) {
        //Variaveis
        int a = 0, b = 1, R;

        System.out.println("Sequência de números Fibonacci:");
        //Estrutura
        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            //calculo
            R = a + b;
            a = b;
            b = R;
        }
    }
}

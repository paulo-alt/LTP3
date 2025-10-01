/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somarnumeros;

import java.util.Scanner; 

public class SomarNumeros {
    public static void main(String[] args) {
        Double a, b, c;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o primeiro valor: ");
        a = entrada.nextDouble();

        System.out.printf("Digite o segundo valor: ");
        b = entrada.nextDouble();

        c = a + b;

        System.out.printf("%.2f + %.2f = %.2f\n", a, b, c);

        entrada.close(); // boa prática: fechar o Scanner
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Tabuada { // Define a classe principal
    public static void main(String[] args) { // Ponto de entrada do programa

        // Declarando variáveis
        int valor1;
        int resultado;

        // Criando o Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Recebendo o valor requisitado pelo usuário
        System.out.println("Digite o valor da tabuada que você precisa:");
        valor1 = sc.nextInt(); // Lendo o número que o usuário digitou

        // Estrutura de repetição
        System.out.println("Tabuada do " + valor1 + ":");
        for (int i = 1; i <= 10; i++) { // Loop de 1 até 10
            resultado = valor1 * i; // Calcula o resultado da multiplicação
            System.out.println(valor1 + " x " + i + " = " + resultado); // Mostra o resultado
        }

        sc.close(); // Fecha o Scanner
    }
}

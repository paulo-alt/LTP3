/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

public class CalculaIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada da data de nascimento
        System.out.println("Digite sua data de nascimento (dd/MM/yyyy):");
        String nascimentoStr = sc.nextLine();

        // Entrada da data atual
        System.out.println("Digite a data atual (dd/MM/yyyy):");
        String hojeStr = sc.nextLine();

        // Converter Strings em LocalDate
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(nascimentoStr, formato);
        LocalDate hoje = LocalDate.parse(hojeStr, formato);

        // Calcular idade
        int idade = Period.between(nascimento, hoje).getYears();

        // Ajustar se a pessoa ainda não fez aniversário este ano
        LocalDate aniversarioEsteAno = nascimento.withYear(hoje.getYear());
        if (hoje.isBefore(aniversarioEsteAno)) {
            idade -= 1;
        }

        System.out.println("Idade: " + idade + " anos");

        sc.close();
    }
}
